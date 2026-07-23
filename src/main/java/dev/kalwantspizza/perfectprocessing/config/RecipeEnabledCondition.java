package dev.kalwantspizza.perfectprocessing.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.neoforged.neoforge.common.conditions.ICondition;

public record RecipeEnabledCondition(String flag) implements ICondition {
    public static final MapCodec<RecipeEnabledCondition> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            Codec.STRING.fieldOf("flag").forGetter(RecipeEnabledCondition::flag)
            ).apply(inst, RecipeEnabledCondition::new));

    @Override
    public boolean test(IContext iContext) {
        return PerfectConfig.common().isEnabled(flag);
    }

    @Override
    public MapCodec<? extends ICondition> codec() {
        return CODEC;
    }
}
