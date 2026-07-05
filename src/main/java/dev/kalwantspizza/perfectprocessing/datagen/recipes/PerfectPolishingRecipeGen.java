package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.api.data.recipe.PolishingRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class PerfectPolishingRecipeGen extends PolishingRecipeGen {
    public PerfectPolishingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }

    GeneratedRecipe

    ENDER_EYE_FROM_CRYING_OBSIDIAN = create("content/ender_eye_from_crying_obsidian", b -> b
            .require(Items.CRYING_OBSIDIAN)
            .output(Items.ENDER_EYE)
    );
}
