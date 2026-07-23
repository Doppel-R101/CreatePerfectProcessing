package dev.kalwantspizza.perfectprocessing.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.neoforged.neoforge.common.conditions.ICondition;

public record RecipeModeCondition(String flag, PGems.RecipeTypeSetting recipeTypeSetting) implements ICondition {
    public static final MapCodec<RecipeModeCondition> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            Codec.STRING.fieldOf("flag").forGetter(RecipeModeCondition::flag),
            Codec.STRING.xmap(PGems.RecipeTypeSetting::valueOf, Enum::name).fieldOf("recipeTypeSetting").forGetter(RecipeModeCondition::recipeTypeSetting)
            ).apply(inst, RecipeModeCondition::new));

    @Override
    public boolean test(IContext iContext) {
        return PerfectConfig.common().getMode(flag) == recipeTypeSetting;
    }

    @Override
    public MapCodec<? extends ICondition> codec() {
        return CODEC;
    }
}
