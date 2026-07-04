package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.DeployingRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class PerfectDeployingRecipeGen extends DeployingRecipeGen {
    public PerfectDeployingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }

    GeneratedRecipe

            POWDER_SNOW_BUCKET_FROM_SNOW = create("content/powder_snow_bucket_from_snow", b -> b
            .require(Items.SNOW_BLOCK)
            .require(Items.BUCKET)
            .output(Items.POWDER_SNOW_BUCKET)

    ),

            ENDER_EYE_FROM_POLISHING_CRYING_OBSIDIAN = create("content/ender_eye_from_polishing_crying_obsidian", b -> b
            .require(Items.CRYING_OBSIDIAN)
            .require(AllItems.SAND_PAPER)
            .output(Items.ENDER_EYE)

    );
}
