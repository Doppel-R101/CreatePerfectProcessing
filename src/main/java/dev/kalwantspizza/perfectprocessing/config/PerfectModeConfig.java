package dev.kalwantspizza.perfectprocessing.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import java.util.LinkedHashMap;
import java.util.Map;

public class PerfectModeConfig {
    private static final PGems.RecipeTypeSetting DEFAULT_MODE = PGems.RecipeTypeSetting.ASSEMBLY;

    private final Map<String, ModConfigSpec.EnumValue<PGems.RecipeTypeSetting>> modes = new LinkedHashMap<>();

    public static final PerfectModeConfig CONFIG;
    public static final ModConfigSpec SPEC;

    static {
        Pair<PerfectModeConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(PerfectModeConfig::new);
        CONFIG = pair.getLeft();
        SPEC = pair.getRight();
    }

    private PerfectModeConfig(ModConfigSpec.Builder builder) {
        builder.push("RecipeTypeSettings");
        register(builder, "AncientDebris", "Which recipe set governs Ancient Debris recipes.");
        register(builder, "Diamonds", "Which recipe set governs Diamond recipes.");
        builder.pop();
    }

    private void register(ModConfigSpec.Builder builder, String flag, String comment) {
        modes.put(flag, builder.comment(comment).defineEnum(flag, DEFAULT_MODE));
    }

    public PGems.RecipeTypeSetting getMode(String flag) {
        ModConfigSpec.EnumValue<PGems.RecipeTypeSetting> value = modes.get(flag);
        if (value == null) throw new IllegalArgumentException("Unknown recipe mode key: " + flag);
        return value.get();
    }
}
