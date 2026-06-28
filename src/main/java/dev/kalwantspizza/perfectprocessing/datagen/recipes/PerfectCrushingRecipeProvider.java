package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import dev.kalwantspizza.perfectprocessing.PerfectTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

import net.minecraft.world.item.Items;

public class PerfectCrushingRecipeProvider extends CrushingRecipeGen {

    GeneratedRecipe
    // Cardboard
            ARMOR_CARDBOARD_LARGE = create("all_recycle/armor/cardboard_large", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_CARDBOARD_LARGE)
                .output(AllItems.CARDBOARD.get(), 3)
                .output(0.5f, AllItems.CARDBOARD.get(), 1)
                .output(0.25f, AllItems.CARDBOARD.get(), 1)
    ),
            ARMOR_CARDBOARD_SMALL = create("all_recycle/armor/cardboard_small", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_CARDBOARD_SMALL)
                .output(AllItems.CARDBOARD.get(), 1)
                .output(0.25f, AllItems.CARDBOARD.get(), 1)
    ),
    // Leather
            ARMOR_LEATHER_LARGE = create("all_recycle/armor/leather_large", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_LEATHER_LARGE)
                .output(Items.LEATHER, 3)
                .output(0.5f, Items.LEATHER, 1)
                .output(0.25f, Items.LEATHER, 1)
    ),
            ARMOR_LEATHER_SMALL = create("all_recycle/armor/leather_small", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_LEATHER_SMALL)
                .output(Items.LEATHER, 1)
                .output(0.25f, Items.LEATHER, 1)
    ),

            ARMOR_CHAINMAIL_LARGE = create("all_recycle/armor/chainmail_large", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_CHAINMAIL_LARGE)
                .output(Items.IRON_INGOT, 3)
                .output(0.5f, Items.IRON_INGOT, 1)
                .output(0.55f, Items.IRON_NUGGET, 4)
                .output(0.25f, Items.IRON_NUGGET, 2)
    ),
            ARMOR_CHAINMAIL_SMALL = create("all_recycle/armor/chainmail_small", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_CHAINMAIL_SMALL)
                .output(Items.IRON_INGOT, 1)
                .output(0.25f, Items.IRON_INGOT, 1)
                .output(0.25f, Items.IRON_NUGGET, 2)
    ),

            ARMOR_IRON_LARGE = create("all_recycle/armor/iron_large", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_IRON_LARGE)
                .output(Items.IRON_INGOT, 3)
                .output(0.5f, Items.IRON_INGOT, 1)
                .output(0.55f, Items.IRON_NUGGET, 4)
                .output(0.25f, Items.IRON_NUGGET, 2)
    ),
            ARMOR_IRON_SMALL = create("all_recycle/armor/iron_small", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_IRON_SMALL)
                .output(Items.IRON_INGOT, 1)
                .output(0.25f, Items.IRON_INGOT, 1)
                .output(0.25f, Items.IRON_NUGGET, 2)
    ),

            ARMOR_GOLDEN_LARGE = create("all_recycle/armor/golden_large", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_GOLDEN_LARGE)
                .output(Items.GOLD_INGOT, 3)
                .output(0.5f, Items.GOLD_INGOT, 1)
                .output(0.55f, Items.GOLD_NUGGET, 4)
                .output(0.25f, Items.GOLD_NUGGET, 2)
    ),
            ARMOR_GOLDEN_SMALL = create("all_recycle/armor/golden_small", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_GOLDEN_SMALL)
                .output(Items.GOLD_INGOT, 1)
                .output(0.25f, Items.GOLD_INGOT, 1)
                .output(0.25f, Items.GOLD_NUGGET, 2)
    ),

            ARMOR_DIAMOND_LARGE = create("all_recycle/armor/diamond_large", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_DIAMOND_LARGE)
                .output(Items.DIAMOND, 3)
                .output(0.5f, Items.DIAMOND, 1)
    ),
            ARMOR_DIAMOND_SMALL = create("all_recycle/armor/diamond_small", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_DIAMOND_SMALL)
                .output(Items.DIAMOND, 1)
                .output(0.25f, Items.DIAMOND, 1)
    ),

            ARMOR_NETHERITE_LARGE = create("all_recycle/armor/netherite_large", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_NETHERITE_LARGE)
                .output(Items.DIAMOND, 3)
                .output(0.5f, Items.DIAMOND, 1)
                .output(0.55f, Items.NETHERITE_SCRAP, 2)
                .output(0.25f, Items.DIAMOND, 2)
    ),
            ARMOR_NETHERITE_SMALL = create("all_recycle/armor/netherite_small", b -> b
                .duration(200)
                .require(PerfectTags.ItemTags.ARMOR_NETHERITE_SMALL)
                .output(Items.DIAMOND, 1)
                .output(0.25f, Items.NETHERITE_SCRAP, 2)
                .output(0.25f, Items.DIAMOND, 2)
    );


    /*
     * End of recipe list
     */

    public PerfectCrushingRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }
}
