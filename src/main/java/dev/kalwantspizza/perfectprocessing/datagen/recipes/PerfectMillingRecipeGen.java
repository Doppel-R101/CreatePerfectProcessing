package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.api.data.recipe.MillingRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class PerfectMillingRecipeGen extends MillingRecipeGen {
    public PerfectMillingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }

    GeneratedRecipe

            COBBLED_DEEPSLATE_FROM_MILLING = create("content/cobbled_deepslate_from_milling", b -> b
            .require(Items.DEEPSLATE)
            .duration(250)
            .output(Items.COBBLED_DEEPSLATE)
    );
}
