package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.AllItems;
import com.simibubi.create.AllTags;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class PerfectMixingRecipeGen extends MixingRecipeGen {
    public PerfectMixingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }

    GeneratedRecipe

            TUFF_FROM_MIXING = create("content/tuff_from_mixing", b -> b
                .require(Items.ANDESITE)
                .require(Items.ANDESITE)
                .require(Items.DIORITE)
                .require(Items.DIORITE)
                .require(Tags.Fluids.LAVA, 100)
		        .output(Items.TUFF, 2)
    ),

            NETHERRACK_FROM_MIXING = create("content/netherrack_from_mixing", b -> b
                .require(Tags.Items.STONES)
                .require(Tags.Items.STONES)
                .require(Items.NETHER_WART)
		        .output(Items.NETHERRACK, 2)
                .requiresHeat(HeatCondition.HEATED)
    ),

            DIORITE_AS_MIXING = create("content/diorite_as_mixing", b -> b
                .require(Items.ANDESITE)
                .require(Items.COBBLESTONE)
		        .output(Items.DIORITE)
    ),

            CHROMATIC_COMPOUND_FROM_MIXING = create("content/chromatic_compound_from_mixing", b -> b
                .require(Tags.Items.DUSTS_GLOWSTONE)
                .require(Tags.Items.DUSTS_GLOWSTONE)
                .require(Tags.Items.DUSTS_GLOWSTONE)
                .require(AllTags.AllItemTags.OBSIDIAN_DUST.tag)
                .require(AllTags.AllItemTags.OBSIDIAN_DUST.tag)
                .require(AllTags.AllItemTags.OBSIDIAN_DUST.tag)
                .require(AllItems.POLISHED_ROSE_QUARTZ)
		        .output(AllItems.CHROMATIC_COMPOUND)
                .requiresHeat(HeatCondition.HEATED)
    );
}
