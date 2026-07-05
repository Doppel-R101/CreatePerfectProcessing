package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.HauntingRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import com.github.eterdelta.crittersandcompanions.registry.CACItems;
import com.github.eterdelta.crittersandcompanions.CrittersAndCompanions;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class PerfectHauntingRecipeGen extends HauntingRecipeGen {


    GeneratedRecipe

            PHANTOM_MEMBRANE_FROM_FEATHERS = create("content/phantom_membrane_from_feathers", b -> b
                .require(Tags.Items.FEATHERS)
                .output(0.25f, Items.PHANTOM_MEMBRANE)
    ),

            PHANTOM_MEMBRANE_FROM_DRAGON_FLY_WING = create("content/compat/crit_n_comp/phantom_membrane_from_dragon_fly_wing", b -> b
                .require(CACItems.DRAGONFLY_WING.get())
                .output(0.25f, Items.PHANTOM_MEMBRANE)
                .withCondition(new ModLoadedCondition(CrittersAndCompanions.MODID))
    ),

            MAGMA_CREAM_FROM_SLIME = create("content/magma_cream_from_slime", b -> b
                .require(Tags.Items.SLIME_BALLS)
                .output(Items.MAGMA_CREAM)
    ),

            ANCIENT_DEBRIS_FROM_DIAMOND = create("content/ancient_debris_from_diamond", b -> b
                .require(Tags.Items.STORAGE_BLOCKS_DIAMOND)
                .output(0.16f, Items.ANCIENT_DEBRIS)
                .output(0.30f, Items.OBSIDIAN)
                .output(0.12f, Items.COAL_BLOCK)
                .output(0.05f, AllItems.POWDERED_OBSIDIAN)
                .output(0.02f, Items.CHARCOAL)
    ),

            LAPIS_FROM_DIAMOND = create("content/lapis_from_diamond", b -> b
                .require(Tags.Items.GEMS_DIAMOND)
                .output(0.50f, Items.LAPIS_LAZULI, 4)
    );

    public PerfectHauntingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }

}
