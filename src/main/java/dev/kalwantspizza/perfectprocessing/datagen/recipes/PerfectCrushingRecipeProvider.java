package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.lightning.northstar.Northstar;
import com.lightning.northstar.content.NorthstarItems;
import com.rae.creatingspace.CreatingSpace;
import com.rae.creatingspace.init.ingameobject.ItemInit;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import dev.kalwantspizza.perfectprocessing.PerfectTags.ItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.common.conditions.NotCondition;
import net.p3pp3rf1y.sophisticatedbackpacks.SophisticatedBackpacks;
import net.p3pp3rf1y.sophisticatedbackpacks.init.ModItems;
import com.copycatsplus.copycats.Copycats;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;

public class PerfectCrushingRecipeProvider extends CrushingRecipeGen {

    GeneratedRecipe

    // Copycats
        RECYCLE_COPYCATS_COGWHEEL = create("recycling/copycat/cogwheel", b -> b
            .duration(300)
            .require(ItemTags.COPYCAT_SCRAP_COGWHEELS)
            .output(0.45f, AllItems.ZINC_NUGGET.get(), 3)
            .output(0.15f, AllItems.ZINC_NUGGET, 2)
            .output(0.5f, AllItems.ANDESITE_ALLOY, 1)
            .output(0.25f, Items.OAK_PLANKS, 1)
            .withCondition(new ModLoadedCondition(Copycats.MODID))
    ),

        RECYCLE_COPYCATS_IRON_DOOR = create("recycling/copycat/iron_door", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_IRON_DOOR)
                .output(0.75f, AllItems.ZINC_NUGGET, 4)
                .output(0.2f, AllItems.ZINC_NUGGET, 3)
                .output(0.56f, Items.IRON_INGOT, 3)
                .output(0.35f, Items.IRON_NUGGET, 5)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
        ),

        RECYCLE_COPYCATS_LARGE = create("recycling/copycat/large", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_LARGE)
                .output(0.75f, AllItems.ZINC_NUGGET, 4)
                .output(0.20f, AllItems.ZINC_NUGGET, 3)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
        ),

        RECYCLE_COPYCATS_MEDIUM = create("recycling/copycat/medium", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_MEDIUM)
                .output(0.65f, AllItems.ZINC_NUGGET, 4)
                .output(0.15f, AllItems.ZINC_NUGGET, 3)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
        ),

        RECYCLE_COPYCATS_MINI = create("recycling/copycat/mini", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_MINI)
                .output(0.35f, AllItems.ZINC_NUGGET, 2)
                .output(0.10f, AllItems.ZINC_NUGGET, 1)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
        ),

        RECYCLE_COPYCATS_NORMAL = create("recycling/copycat/normal", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_MINI)
                .output(0.45f, AllItems.ZINC_NUGGET, 3)
                .output(0.15f, AllItems.ZINC_NUGGET, 2)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
        ),

        RECYCLE_COPYCATS_PIPE = create("recycling/copycat/pipe", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_PIPE)
                .output(0.45f, AllItems.ZINC_NUGGET, 3)
                .output(0.15f, AllItems.ZINC_NUGGET, 2)
                .output(0.5f, AllItems.COPPER_SHEET, 1)
                .output(0.25f, Items.COPPER_INGOT, 1)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
        ),

        RECYCLE_COPYCATS_SMALL = create("recycling/copycat/small", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_SMALL)
                .output(0.45f, AllItems.ZINC_NUGGET, 2)
                .output(0.10f, AllItems.ZINC_NUGGET, 2)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
        ),

        RECYCLE_COPYCATS_TINY = create("recycling/copycat/tiny", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_SMALL)
                .output(0.35f, AllItems.ZINC_NUGGET, 1)
                .output(0.05f, AllItems.ZINC_NUGGET, 1)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
        ),

        // Sophisticated Backpacks
        RECYCLE_SOPHISTICATED_UPGRADE_ADVANCED = create("recycling/sophisticated/advanced_upgrades", b -> b
                .duration(300)
                .require(ItemTags.SOPHISTICATED_ADVANCED_UPGRADES)
                .output(0.45f, ModItems.UPGRADE_BASE.get(), 1)
                .output(0.35f, Items.GOLD_NUGGET, 7)
                .output(0.25f, Items.REDSTONE, 1)
                .output(0.15f, Items.DIAMOND, 1)
                .withCondition(new ModLoadedCondition(SophisticatedBackpacks.MOD_ID))


        ),

        RECYCLE_SOPHISTICATED_BACKPACKS = create("recycling/sophisticated/backpacks", b -> b
                .duration(300)
                .require(ItemTags.SOPHISTICATED_BACKPACKS)
                .output(0.65f, Items.OAK_PLANKS, 2)
                .output(0.25f, Items.OAK_PLANKS, 3)
                .output(0.35f, Items.STRING, 2)
                .output(0.25f, Items.LEATHER, 2)
                .output(0.45f, Items.LEATHER, 1)
                .withCondition(new ModLoadedCondition(SophisticatedBackpacks.MOD_ID))


        ),

        RECYCLE_SOPHISTICATED_BACKPACKS_VALUE = create("recycling/sophisticated/backpacks_value", b -> b
                .duration(300)
                .require(ItemTags.SOPHISTICATED_BACKPACKS_VALUE)
                .output(0.65f, Items.OAK_PLANKS, 2)
                .output(0.25f, Items.OAK_PLANKS, 3)
                .output(0.35f, Items.STRING, 2)
                .output(0.25f, Items.LEATHER, 2)
                .output(0.45f, Items.LEATHER, 1)
                .output(0.15f, Items.DIAMOND, 2)
                .withCondition(new ModLoadedCondition(SophisticatedBackpacks.MOD_ID))


        ),

        RECYCLE_SOPHISTICATED_NORMAL_UPGRADES = create("recycling/sophisticated/normal_upgrades", b -> b
                .duration(300)
                .require(ItemTags.SOPHISTICATED_NORMAL_UPGRADES)
                .output(0.45f, ModItems.UPGRADE_BASE.get(), 1)
                .output(0.35f, Items.IRON_NUGGET, 7)
                .output(0.335f, Items.REDSTONE, 2)
                .withCondition(new ModLoadedCondition(SophisticatedBackpacks.MOD_ID))


        ),

        RECYCLE_SOPHISTICATED_SPECIAL_UPGRADES = create("recycling/sophisticated/special_upgrades", b -> b
                .duration(300)
                .require(ItemTags.SOPHISTICATED_NORMAL_UPGRADES)
                .output(0.45f, ModItems.UPGRADE_BASE.get(), 1)
                .output(Items.NETHER_STAR, 1)
                .output(0.45f, Items.ENDER_EYE, 2)
                .withCondition(new ModLoadedCondition(SophisticatedBackpacks.MOD_ID))


        ),

    // General
    // Armour
    // Cardboard
        ARMOR_CARDBOARD_LARGE = create("recycling/general/armor/cardboard_large", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_CARDBOARD_LARGE)
            .output(AllItems.CARDBOARD.get(), 3)
            .output(0.5f, AllItems.CARDBOARD.get(), 1)
            .output(0.25f, AllItems.CARDBOARD.get(), 1)
    ),
        ARMOR_CARDBOARD_SMALL = create("recycling/general/armor/cardboard_small", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_CARDBOARD_SMALL)
            .output(AllItems.CARDBOARD.get(), 1)
            .output(0.25f, AllItems.CARDBOARD.get(), 1)
    ),
    // Leather
        ARMOR_LEATHER_LARGE = create("recycling/general/armor/leather_large", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_LEATHER_LARGE)
            .output(Items.LEATHER, 3)
            .output(0.5f, Items.LEATHER, 1)
            .output(0.25f, Items.LEATHER, 1)
    ),
        ARMOR_LEATHER_SMALL = create("recycling/general/armor/leather_small", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_LEATHER_SMALL)
            .output(Items.LEATHER, 1)
            .output(0.25f, Items.LEATHER, 1)
    ),

        ARMOR_CHAINMAIL_LARGE = create("recycling/general/armor/chainmail_large", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_CHAINMAIL_LARGE)
            .output(Items.IRON_INGOT, 3)
            .output(0.5f, Items.IRON_INGOT, 1)
            .output(0.55f, Items.IRON_NUGGET, 4)
            .output(0.25f, Items.IRON_NUGGET, 2)
    ),
        ARMOR_CHAINMAIL_SMALL = create("recycling/general/armor/chainmail_small", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_CHAINMAIL_SMALL)
            .output(Items.IRON_INGOT, 1)
            .output(0.25f, Items.IRON_INGOT, 1)
            .output(0.25f, Items.IRON_NUGGET, 2)
    ),

        ARMOR_IRON_LARGE = create("recycling/general/armor/iron_large", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_IRON_LARGE)
            .output(Items.IRON_INGOT, 3)
            .output(0.5f, Items.IRON_INGOT, 1)
            .output(0.55f, Items.IRON_NUGGET, 4)
            .output(0.25f, Items.IRON_NUGGET, 2)
    ),
        ARMOR_IRON_SMALL = create("recycling/general/armor/iron_small", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_IRON_SMALL)
            .output(Items.IRON_INGOT, 1)
            .output(0.25f, Items.IRON_INGOT, 1)
            .output(0.25f, Items.IRON_NUGGET, 2)
    ),

        ARMOR_GOLDEN_LARGE = create("recycling/general/armor/golden_large", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_GOLDEN_LARGE)
            .output(Items.GOLD_INGOT, 3)
            .output(0.5f, Items.GOLD_INGOT, 1)
            .output(0.55f, Items.GOLD_NUGGET, 4)
            .output(0.25f, Items.GOLD_NUGGET, 2)
    ),
        ARMOR_GOLDEN_SMALL = create("recycling/general/armor/golden_small", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_GOLDEN_SMALL)
            .output(Items.GOLD_INGOT, 1)
            .output(0.25f, Items.GOLD_INGOT, 1)
            .output(0.25f, Items.GOLD_NUGGET, 2)
    ),

        ARMOR_DIAMOND_LARGE = create("recycling/general/armor/diamond_large", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_DIAMOND_LARGE)
            .output(Items.DIAMOND, 3)
            .output(0.5f, Items.DIAMOND, 1)
    ),
        ARMOR_DIAMOND_SMALL = create("recycling/general/armor/diamond_small", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_DIAMOND_SMALL)
            .output(Items.DIAMOND, 1)
            .output(0.25f, Items.DIAMOND, 1)
    ),

        ARMOR_NETHERITE_LARGE = create("recycling/general/armor/netherite_large", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_NETHERITE_LARGE)
            .output(Items.DIAMOND, 3)
            .output(0.5f, Items.DIAMOND, 1)
            .output(0.55f, Items.NETHERITE_SCRAP, 2)
            .output(0.25f, Items.DIAMOND, 2)
    ),
        ARMOR_NETHERITE_SMALL = create("recycling/general/armor/netherite_small", b -> b
            .duration(200)
            .require(ItemTags.ARMOR_NETHERITE_SMALL)
            .output(Items.DIAMOND, 1)
            .output(0.25f, Items.NETHERITE_SCRAP, 2)
            .output(0.25f, Items.DIAMOND, 2)
    ),


        COBBLED_DEEPSLATE_FROM_DEEPSLATE = create("content/cobbled_deepslate_from_deepslate", b -> b
                .duration(250)
                .require(Items.DEEPSLATE)
                .output(Items.COBBLED_DEEPSLATE)
        ),

        COPPER_NUGGET_FROM_LIMESTONE = create("content/copper_nugget_from_limestone", b -> b
                .duration(250)
                .require(AllPaletteStoneTypes.LIMESTONE.getBaseBlock().get())
                .output(0.30f, AllItems.COPPER_NUGGET)
                .withCondition(new NotCondition(new ModLoadedCondition(Northstar.MOD_ID)))
        ),

        RUTILE_CONCENTRATE_FROM_LIMESTONE = create("compat/northstar/rutile_concentrate_from_limestone", b -> b
                .duration(250)
                .require(AllPaletteStoneTypes.LIMESTONE.getBaseBlock().get())
                .output(0.30f, AllItems.COPPER_NUGGET)
                .output(0.50f, NorthstarItems.RUTILE_CONCENTRATE)
                .withCondition(new ModLoadedCondition(Northstar.MOD_ID))
        ),

        NICKEL_NUGGET_FROM_SCORCHIA = create("compat/creatingspace/nickel_nugget_from_scorchia", b -> b
                .duration(250)
                .require(AllPaletteStoneTypes.SCORCHIA.getBaseBlock().get())
                .output(0.30f, ItemInit.NICKEL_NUGGET)
                .withCondition(new ModLoadedCondition(CreatingSpace.MODID))
        ),

        POWERED_OBSIDIAN_FROM_CRYING_OBSIDIAN = create("content/powdered_obsidian_from_crying_obsidian", b -> b
                .duration(500)
                .require(Items.CRYING_OBSIDIAN)
                .output(Items.OBSIDIAN)
                .output(0.25f, AllItems.POWDERED_OBSIDIAN)
        );

    /*
     * End of recipe list
     */

    public PerfectCrushingRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }
}
