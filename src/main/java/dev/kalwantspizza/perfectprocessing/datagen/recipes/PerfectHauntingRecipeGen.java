package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.api.data.recipe.HauntingRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import com.github.eterdelta.crittersandcompanions.registry.CACItems;

import java.util.concurrent.CompletableFuture;

public class PerfectHauntingRecipeGen extends HauntingRecipeGen {


    GeneratedRecipe

            PHANTOM_MEMBRANE_FROM_FEATHERS = create("content/phantom_membrane_from_feathers", b -> b
            .require(Tags.Items.FEATHERS)
            .output(0.25f, Items.PHANTOM_MEMBRANE)
    ),

            PHANTOM_MEMBRANE_FROM_DRAGON_FLY_WING = create("content/compat/crit_n_comp/phantom_membrane_from_dragon_fly_wing", b -> b
            .require(CACItems.DRAGONFLY_WING.get())
            .output(0.25f, Items.PHANTOM_MEMBRANE)
    );

    public PerfectHauntingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, String defaultNamespace) {
        super(output, registries, defaultNamespace);
    }

}
