package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.ItemApplicationRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import dev.kalwantspizza.perfectprocessing.config.RecipeEnabledCondition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class PerfectItemApplicationRecipeGen extends ItemApplicationRecipeGen {
    public PerfectItemApplicationRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }

    GeneratedRecipe

            SHADOW_STEEL_CASING = create("content/shadow_steel_casing", b -> b
                .require(Tags.Items.STRIPPED_LOGS)
                .require(AllItems.SHADOW_STEEL)
                .output(AllBlocks.SHADOW_STEEL_CASING)
                .withCondition(new RecipeEnabledCondition("legacyCasings"))

    ),

            REFINED_RADIANCE_CASING = create("content/refined_radiance_casing", b -> b
                .require(Tags.Items.STRIPPED_LOGS)
                .require(AllItems.REFINED_RADIANCE)
                .output(AllBlocks.REFINED_RADIANCE_CASING)
                .withCondition(new RecipeEnabledCondition("legacyCasings"))

    );
}
