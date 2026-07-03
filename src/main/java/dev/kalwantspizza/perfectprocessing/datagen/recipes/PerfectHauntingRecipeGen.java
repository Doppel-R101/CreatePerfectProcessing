package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.api.data.recipe.HauntingRecipeGen;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;



public class PerfectHauntingRecipeGen extends HauntingRecipeGen {
    GeneratedRecipe


            PHANTOM_MEMBRANE_FROM_FEATHERS = create("content/phantom_membrane_from_feathers", b -> b
            .require(Tags.Items.FEATHERS)
            .output(0.25f, Items.PHANTOM_MEMBRANE)
    ),

            PHANTOM_MEMBRANE_FROM_DRAGON_FLY_WING = create("content/compat/crit_n_comp/phantom_membrane_from_dragon_fly_wing", b -> b
            .require()
            .output(0.25f, Items.PHANTOM_MEMBRANE)
    );

}
