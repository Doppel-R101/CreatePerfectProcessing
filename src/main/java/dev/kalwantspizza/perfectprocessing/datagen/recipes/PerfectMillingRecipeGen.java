package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.MillingRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import dev.kalwantspizza.perfectprocessing.config.RecipeEnabledCondition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class PerfectMillingRecipeGen extends MillingRecipeGen {
    public PerfectMillingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }

    GeneratedRecipe

            COBBLED_DEEPSLATE_FROM_MILLING = create("content/cobbled_deepslate_from_milling", b -> b
            .require(Items.DEEPSLATE)
            .duration(250)
            .output(Items.COBBLED_DEEPSLATE)
            .withCondition(new RecipeEnabledCondition("crushingDeepslate"))
    ),

            CINDER_FLOUR_FROM_MILLING = create("content/cinder_flour_from_milling", b -> b
            .require(Items.NETHERRACK)
            .duration(250)
            .output(AllItems.CINDER_FLOUR)
    );
}
