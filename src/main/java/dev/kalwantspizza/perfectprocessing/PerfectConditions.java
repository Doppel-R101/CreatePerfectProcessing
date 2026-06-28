package dev.kalwantspizza.perfectprocessing;

import com.mojang.serialization.MapCodec;
import net.neoforged.neoforge.common.conditions.ICondition;

import java.util.Optional;

// Perfect? I HATE THIS; WHY DOES THIS NEED TO EXIST?
public record PerfectConditions(String flag, Optional<Boolean> extraCondition) implements ICondition {



    @Override
    public boolean test(IContext iContext) {
        return false;
    }

    @Override
    public MapCodec<? extends ICondition> codec() {
        return null;
    }
}
