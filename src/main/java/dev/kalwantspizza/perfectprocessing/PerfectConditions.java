package dev.kalwantspizza.perfectprocessing;

import com.mojang.serialization.MapCodec;
import dev.kalwantspizza.perfectprocessing.config.RecipeEnabledCondition;
import dev.kalwantspizza.perfectprocessing.config.RecipeModeCondition;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

import static dev.kalwantspizza.perfectprocessing.PerfectProcessing.MODID;

public  class PerfectConditions {
    public static final DeferredRegister<MapCodec<? extends ICondition>> CONDITION_CODECS =
            DeferredRegister.create(NeoForgeRegistries.Keys.CONDITION_CODECS, MODID);

    public static final Supplier<MapCodec<RecipeEnabledCondition>> RECIPE_ENABLED =
            CONDITION_CODECS.register("recipe_enabled",() -> RecipeEnabledCondition.CODEC);
    public static final Supplier<MapCodec<RecipeModeCondition>> RECIPE_TYPE_SETTING =
            CONDITION_CODECS.register("recipe_type_setting", () -> RecipeModeCondition.CODEC);

    public static void register(IEventBus modEventBus) {
        CONDITION_CODECS.register(modEventBus);
    }

}