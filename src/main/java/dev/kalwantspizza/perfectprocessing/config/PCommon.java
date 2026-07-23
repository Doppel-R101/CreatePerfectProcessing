package dev.kalwantspizza.perfectprocessing.config;

import net.createmod.catnip.config.ConfigBase;

import java.util.LinkedHashMap;
import java.util.Map;

public class PCommon extends ConfigBase {
    public final PBlocks blocks = nested(0, PBlocks::new, Comments.blocks);
    public final PCasings casings = nested(0, PCasings::new, Comments.casings);
    public final PGems gems = nested(0, PGems::new, Comments.gems);
    public final PItems items = nested(0, PItems::new, Comments.items);
    public final PRecycling recycling = nested(0, PRecycling::new, Comments.recycling);

    private final Map<String, ConfigBool> booleanFlags = new LinkedHashMap<>();
    private final Map<String, ConfigEnum<PGems.RecipeTypeSetting>> modeFlags = new LinkedHashMap<>();

    public PCommon() {
        booleanFlags.put("compactCoal", gems.CoalCompacting);
        booleanFlags.put("copperCrushing", gems.CopperCrushing);
        booleanFlags.put("lapisHaunting", gems.LapisHaunting);
        booleanFlags.put("nickelCrushing", gems.NickelCrushing);
        booleanFlags.put("zincCrushing", gems.ZincCrushing);
        modeFlags.put("ancientDebrisRecipe", gems.AncientDebrisRecipe);
        modeFlags.put("diamondRecipe", gems.DiamondRecipe);
        booleanFlags.put("crushingDeepslate", blocks.crushingDeepslate);
        booleanFlags.put("compactResource", blocks.compactResource);
        booleanFlags.put("fillDecorative", blocks.fillDecorative);
        booleanFlags.put("mixingProduce", blocks.mixingProduce);
        booleanFlags.put("spongeDupe", blocks.spongeDupe);
        booleanFlags.put("legacyCasings", casings.LegacyCasings);
        booleanFlags.put("enderEyePolishing", items.enderEyePolishing);
        booleanFlags.put("magmaCreamHaunting", items.magmaCreamHaunting);
        booleanFlags.put("phantomMembraneHaunting", items.phantomMembraneHaunting);
        booleanFlags.put("powderedObsidianCrushing", items.powderedObsidianCrushing);
        booleanFlags.put("powderedSnowBucketDeploying", items.powderedSnowBucketDeploying);
        booleanFlags.put("rutileConcentrateCrushing", items.rutileConcentrateCrushing);
        booleanFlags.put("armour", recycling.armour);
        booleanFlags.put("copycats", recycling.copycats);
        booleanFlags.put("sophisticatedBackpacks", recycling.sophisticatedBackpacks);
        booleanFlags.put("tools", recycling.tools);
    }

    public boolean isEnabled(String flag) {
        ConfigBool value = booleanFlags.get(flag);
        if (value == null) throw new IllegalArgumentException("Unknown boolean recipe flag: " + flag);
        return value.get();
    }

    public PGems.RecipeTypeSetting getMode(String flag) {
        ConfigEnum<PGems.RecipeTypeSetting> value = modeFlags.get(flag);
        if (value == null) throw new IllegalArgumentException("Unknown recipe mode flag: " + flag);
        return value.get();
    }



    @Override
    public String getName() {
        return "common";
    }

    private static class Comments {
        static String blocks = "All recipes producing blocks";
        static String casings = "All recipes related to casings";
        static String gems = "All recipes that produce gems, such as diamonds";
        static String items = "All recipes that produce items which aren't gems";
        static String recycling = "All recipes related to recycling items, tools and blocks";
    }
}
