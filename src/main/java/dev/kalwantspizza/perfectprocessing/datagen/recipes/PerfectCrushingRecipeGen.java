package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.lightning.northstar.Northstar;
import com.lightning.northstar.content.NorthstarItems;
import com.rae.creatingspace.CreatingSpace;
import com.rae.creatingspace.init.ingameobject.ItemInit;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import dev.kalwantspizza.perfectprocessing.PerfectTags.ItemTags;
import dev.kalwantspizza.perfectprocessing.config.RecipeEnabledCondition;
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

@SuppressWarnings("unused")
public class PerfectCrushingRecipeGen extends CrushingRecipeGen {

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
                .withCondition(new RecipeEnabledCondition("copycats"))
        ),

        RECYCLE_COPYCATS_IRON_DOOR = create("recycling/copycat/iron_door", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_IRON_DOOR)
                .output(0.75f, AllItems.ZINC_NUGGET, 4)
                .output(0.2f, AllItems.ZINC_NUGGET, 3)
                .output(0.56f, Items.IRON_INGOT, 3)
                .output(0.35f, Items.IRON_NUGGET, 5)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
                .withCondition(new RecipeEnabledCondition("copycats"))
        ),

        RECYCLE_COPYCATS_LARGE = create("recycling/copycat/large", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_LARGE)
                .output(0.75f, AllItems.ZINC_NUGGET, 4)
                .output(0.20f, AllItems.ZINC_NUGGET, 3)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
                .withCondition(new RecipeEnabledCondition("copycats"))
        ),

        RECYCLE_COPYCATS_MEDIUM = create("recycling/copycat/medium", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_MEDIUM)
                .output(0.65f, AllItems.ZINC_NUGGET, 4)
                .output(0.15f, AllItems.ZINC_NUGGET, 3)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
                .withCondition(new RecipeEnabledCondition("copycats"))
        ),

        RECYCLE_COPYCATS_MINI = create("recycling/copycat/mini", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_MINI)
                .output(0.35f, AllItems.ZINC_NUGGET, 2)
                .output(0.10f, AllItems.ZINC_NUGGET, 1)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
                .withCondition(new RecipeEnabledCondition("copycats"))
        ),

        RECYCLE_COPYCATS_NORMAL = create("recycling/copycat/normal", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_MINI)
                .output(0.45f, AllItems.ZINC_NUGGET, 3)
                .output(0.15f, AllItems.ZINC_NUGGET, 2)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
                .withCondition(new RecipeEnabledCondition("copycats"))
        ),

        RECYCLE_COPYCATS_PIPE = create("recycling/copycat/pipe", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_PIPE)
                .output(0.45f, AllItems.ZINC_NUGGET, 3)
                .output(0.15f, AllItems.ZINC_NUGGET, 2)
                .output(0.5f, AllItems.COPPER_SHEET, 1)
                .output(0.25f, Items.COPPER_INGOT, 1)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
                .withCondition(new RecipeEnabledCondition("copycats"))
        ),

        RECYCLE_COPYCATS_SMALL = create("recycling/copycat/small", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_SMALL)
                .output(0.45f, AllItems.ZINC_NUGGET, 2)
                .output(0.10f, AllItems.ZINC_NUGGET, 2)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
                .withCondition(new RecipeEnabledCondition("copycats"))
        ),

        RECYCLE_COPYCATS_TINY = create("recycling/copycat/tiny", b -> b
                .duration(300)
                .require(ItemTags.COPYCAT_SCRAP_SMALL)
                .output(0.35f, AllItems.ZINC_NUGGET, 1)
                .output(0.05f, AllItems.ZINC_NUGGET, 1)
                .withCondition(new ModLoadedCondition(Copycats.MODID))
                .withCondition(new RecipeEnabledCondition("copycats"))
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
                .withCondition(new RecipeEnabledCondition("sophisticatedBackpacks"))


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
                .withCondition(new RecipeEnabledCondition("sophisticatedBackpacks"))

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
                .withCondition(new RecipeEnabledCondition("sophisticatedBackpacks"))

        ),

        RECYCLE_SOPHISTICATED_NORMAL_UPGRADES = create("recycling/sophisticated/normal_upgrades", b -> b
                .duration(300)
                .require(ItemTags.SOPHISTICATED_NORMAL_UPGRADES)
                .output(0.45f, ModItems.UPGRADE_BASE.get(), 1)
                .output(0.35f, Items.IRON_NUGGET, 7)
                .output(0.335f, Items.REDSTONE, 2)
                .withCondition(new ModLoadedCondition(SophisticatedBackpacks.MOD_ID))
                .withCondition(new RecipeEnabledCondition("sophisticatedBackpacks"))

        ),

        RECYCLE_SOPHISTICATED_SPECIAL_UPGRADES = create("recycling/sophisticated/special_upgrades", b -> b
                .duration(300)
                .require(ItemTags.SOPHISTICATED_NORMAL_UPGRADES)
                .output(0.45f, ModItems.UPGRADE_BASE.get(), 1)
                .output(Items.NETHER_STAR, 1)
                .output(0.45f, Items.ENDER_EYE, 2)
                .withCondition(new ModLoadedCondition(SophisticatedBackpacks.MOD_ID))
                .withCondition(new RecipeEnabledCondition("sophisticatedBackpacks"))

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
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_CARDBOARD_SMALL = create("recycling/general/armor/cardboard_small", b -> b
                .duration(200)
                .require(ItemTags.ARMOR_CARDBOARD_SMALL)
                .output(AllItems.CARDBOARD.get(), 1)
                .output(0.25f, AllItems.CARDBOARD.get(), 1)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        // Leather
        ARMOR_LEATHER_LARGE = create("recycling/general/armor/leather_large", b -> b
                .duration(200)
                .require(ItemTags.ARMOR_LEATHER_LARGE)
                .output(Items.LEATHER, 3)
                .output(0.5f, Items.LEATHER, 1)
                .output(0.25f, Items.LEATHER, 1)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_LEATHER_SMALL = create("recycling/general/armor/leather_small", b -> b
                .duration(200)
                .require(ItemTags.ARMOR_LEATHER_SMALL)
                .output(Items.LEATHER, 1)
                .output(0.25f, Items.LEATHER, 1)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_CHAINMAIL_LARGE = create("recycling/general/armor/chainmail_large", b -> b
                .duration(300)
                .require(ItemTags.ARMOR_CHAINMAIL_LARGE)
                .output(Items.IRON_INGOT, 3)
                .output(0.5f, Items.IRON_INGOT, 1)
                .output(0.55f, Items.IRON_NUGGET, 4)
                .output(0.25f, Items.IRON_NUGGET, 2)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_CHAINMAIL_SMALL = create("recycling/general/armor/chainmail_small", b -> b
                .duration(300)
                .require(ItemTags.ARMOR_CHAINMAIL_SMALL)
                .output(Items.IRON_INGOT, 1)
                .output(0.25f, Items.IRON_INGOT, 1)
                .output(0.25f, Items.IRON_NUGGET, 2)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_IRON_LARGE = create("recycling/general/armor/iron_large", b -> b
                .duration(400)
                .require(ItemTags.ARMOR_IRON_LARGE)
                .output(Items.IRON_INGOT, 3)
                .output(0.5f, Items.IRON_INGOT, 1)
                .output(0.55f, Items.IRON_NUGGET, 4)
                .output(0.25f, Items.IRON_NUGGET, 2)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_IRON_SMALL = create("recycling/general/armor/iron_small", b -> b
                .duration(400)
                .require(ItemTags.ARMOR_IRON_SMALL)
                .output(Items.IRON_INGOT, 1)
                .output(0.25f, Items.IRON_INGOT, 1)
                .output(0.25f, Items.IRON_NUGGET, 2)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_GOLDEN_LARGE = create("recycling/general/armor/golden_large", b -> b
                .duration(400)
                .require(ItemTags.ARMOR_GOLDEN_LARGE)
                .output(Items.GOLD_INGOT, 3)
                .output(0.5f, Items.GOLD_INGOT, 1)
                .output(0.55f, Items.GOLD_NUGGET, 4)
                .output(0.25f, Items.GOLD_NUGGET, 2)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),
        ARMOR_GOLDEN_SMALL = create("recycling/general/armor/golden_small", b -> b
                .duration(400)
                .require(ItemTags.ARMOR_GOLDEN_SMALL)
                .output(Items.GOLD_INGOT, 1)
                .output(0.25f, Items.GOLD_INGOT, 1)
                .output(0.25f, Items.GOLD_NUGGET, 2)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_DIAMOND_LARGE = create("recycling/general/armor/diamond_large", b -> b
                .duration(400)
                .require(ItemTags.ARMOR_DIAMOND_LARGE)
                .output(Items.DIAMOND, 3)
                .output(0.5f, Items.DIAMOND, 1)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),
        ARMOR_DIAMOND_SMALL = create("recycling/general/armor/diamond_small", b -> b
                .duration(400)
                .require(ItemTags.ARMOR_DIAMOND_SMALL)
                .output(Items.DIAMOND, 1)
                .output(0.25f, Items.DIAMOND, 1)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_NETHERITE_LARGE = create("recycling/general/armor/netherite_large", b -> b
                .duration(400)
                .require(ItemTags.ARMOR_NETHERITE_LARGE)
                .output(Items.DIAMOND, 3)
                .output(0.5f, Items.DIAMOND, 1)
                .output(0.55f, Items.NETHERITE_SCRAP, 2)
                .output(0.25f, Items.DIAMOND, 2)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_NETHERITE_SMALL = create("recycling/general/armor/netherite_small", b -> b
                .duration(400)
                .require(ItemTags.ARMOR_NETHERITE_SMALL)
                .output(Items.DIAMOND, 1)
                .output(0.25f, Items.NETHERITE_SCRAP, 2)
                .output(0.25f, Items.DIAMOND, 2)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_COPPER_LARGE = create("recycling/general/armor/copper_large", b -> b
                .duration(300)
                .require(ItemTags.ARMOR_COPPER_LARGE)
                .output(Items.COPPER_INGOT, 3)
                .output(0.5f, Items.COPPER_INGOT, 1)
                .output(0.55f, AllItems.COPPER_NUGGET, 4)
                .output(0.25f, AllItems.COPPER_NUGGET, 2)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_COPPER_SMALL = create("recycling/general/armor/copper_small", b -> b
                .duration(300)
                .require(ItemTags.ARMOR_COPPER_SMALL)
                .output(Items.COPPER_INGOT, 1)
                .output(0.25f, Items.COPPER_INGOT, 1)
                .output(0.25f, AllItems.COPPER_NUGGET, 2)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_COPPER_ANDESITE_MIX_LARGE = create("recycling/general/armor/copper_andesite_mix_large", b -> b
                .duration(400)
                .require(ItemTags.ARMOR_COPPER_ANDESITE_ALLOY_MIX_LARGE)
                .output(Items.COPPER_INGOT, 3)
                .output(0.5f, Items.COPPER_INGOT, 1)
                .output(0.15f, Items.COPPER_INGOT, 4)
                .output(0.25f, AllItems.COPPER_NUGGET, 2)
                .output(AllItems.ANDESITE_ALLOY, 1)
                .output(0.45f, AllItems.ANDESITE_ALLOY, 1)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        ARMOR_COPPER_ANDESITE_MIX_SMALL = create("recycling/general/armor/copper_andesite_mix_small", b -> b
                .duration(400)
                .require(ItemTags.ARMOR_COPPER_ANDESITE_ALLOY_MIX_SMALL)
                .output(Items.COPPER_INGOT, 1)
                .output(0.25f, Items.COPPER_INGOT, 1)
                .output(0.25f, AllItems.COPPER_NUGGET, 2)
                .output(AllItems.ANDESITE_ALLOY, 1)
                .output(0.45f, AllItems.ANDESITE_ALLOY, 1)
                .withCondition(new RecipeEnabledCondition("armour"))
        ),

        TOOLS_WOODEN_LARGE = create("recycling/general/tools/wooden_large", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_WOODEN_LARGE)
                .output(Items.OAK_PLANKS, 1)
                .output(Items.STICK, 1)
                .output(0.50f, Items.OAK_PLANKS, 1)
                .output(0.66f, Items.STICK, 2)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_WOODEN_NORMAL = create("recycling/general/tools/wooden_normal", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_WOODEN_NORMAL)
                .output(0.50f, Items.OAK_PLANKS, 1)
                .output(Items.STICK, 1)
                .output(0.33f, Items.OAK_PLANKS, 1)
                .output(0.66f, Items.STICK, 2)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_WOODEN_SMALL = create("recycling/general/tools/wooden_small", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_WOODEN_SMALL)
                .output(Items.STICK, 1)
                .output(0.33f, Items.OAK_PLANKS, 1)
                .output(0.50f, Items.STICK, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_STONE_LARGE = create("recycling/general/tools/stone_large", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_STONE_LARGE)
                .output(Items.COBBLESTONE, 1)
                .output(Items.STICK, 1)
                .output(0.50f, Items.COBBLESTONE, 1)
                .output(0.50f, Items.STICK, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_STONE_NORMAL = create("recycling/general/tools/stone_normal", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_STONE_NORMAL)
                .output(0.50f, Items.COBBLESTONE, 1)
                .output(Items.STICK, 1)
                .output(0.33f, Items.COBBLESTONE, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_STONE_SMALL = create("recycling/general/tools/stone_small", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_STONE_SMALL)
                .output(Items.STICK, 1)
                .output(0.33f, Items.COBBLESTONE, 1)
                .output(0.50f, Items.STICK, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_IRON_LARGE = create("recycling/general/tools/iron_large", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_IRON_LARGE)
                .output(Items.IRON_INGOT, 1)
                .output(Items.STICK, 1)
                .output(0.50f, Items.IRON_INGOT, 1)
                .output(0.50f, Items.STICK, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_IRON_NORMAL = create("recycling/general/tools/iron_normal", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_IRON_NORMAL)
                .output(0.50f, Items.IRON_INGOT, 1)
                .output(Items.STICK, 1)
                .output(0.33f, Items.IRON_INGOT, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_IRON_SMALL = create("recycling/general/tools/iron_small", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_IRON_SMALL)
                .output(Items.STICK, 1)
                .output(0.33f, Items.IRON_INGOT, 1)
                .output(0.50f, Items.STICK, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_GOLDEN_LARGE = create("recycling/general/tools/golden_large", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_GOLDEN_LARGE)
                .output(Items.GOLD_INGOT, 1)
                .output(Items.STICK, 1)
                .output(0.50f, Items.GOLD_INGOT, 1)
                .output(0.50f, Items.STICK, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_GOLDEN_NORMAL = create("recycling/general/tools/golden_normal", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_GOLDEN_NORMAL)
                .output(0.50f, Items.GOLD_INGOT, 1)
                .output(Items.STICK, 1)
                .output(0.33f, Items.GOLD_INGOT, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_GOLDEN_SMALL = create("recycling/general/tools/golden_small", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_GOLDEN_SMALL)
                .output(Items.STICK, 1)
                .output(0.33f, Items.GOLD_INGOT, 1)
                .output(0.50f, Items.STICK, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_DIAMOND_LARGE = create("recycling/general/tools/diamond_large", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_DIAMOND_LARGE)
                .output(Items.DIAMOND, 1)
                .output(Items.STICK, 1)
                .output(0.50f, Items.DIAMOND, 1)
                .output(0.50f, Items.STICK, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_DIAMOND_NORMAL = create("recycling/general/tools/diamond_normal", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_DIAMOND_NORMAL)
                .output(0.50f, Items.DIAMOND, 1)
                .output(Items.STICK, 1)
                .output(0.33f, Items.DIAMOND, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_DIAMOND_SMALL = create("recycling/general/tools/diamond_small", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_DIAMOND_SMALL)
                .output(Items.STICK, 1)
                .output(0.33f, Items.DIAMOND, 1)
                .output(0.50f, Items.STICK, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_NETHERITE_LARGE = create("recycling/general/tools/netherite_large", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_DIAMOND_LARGE)
                .output(Items.DIAMOND, 1)
                .output(Items.STICK, 1)
                .output(0.50f, Items.DIAMOND, 1)
                .output(0.50f, Items.NETHERITE_SCRAP, 1)
                .output(0.50f, Items.GOLD_INGOT, 1)
                .output(0.50f, Items.STICK, 1)
                .output(0.33f, Items.NETHERITE_SCRAP, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_NETHERITE_NORMAL = create("recycling/general/tools/netherite_normal", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_DIAMOND_NORMAL)
                .output(0.50f, Items.DIAMOND, 1)
                .output(0.50f, Items.NETHERITE_SCRAP, 1)
                .output(0.50f, Items.GOLD_INGOT, 1)
                .output(Items.STICK, 1)
                .output(0.33f, Items.DIAMOND, 1)
                .output(0.33f, Items.NETHERITE_SCRAP, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),

        TOOLS_NETHERITE_SMALL = create("recycling/general/tools/netherite_small", b -> b
                .duration(200)
                .require(ItemTags.TOOLS_DIAMOND_SMALL)
                .output(Items.STICK, 1)
                .output(0.33f, Items.DIAMOND, 1)
                .output(0.50f, Items.NETHERITE_SCRAP, 1)
                .output(0.50f, Items.GOLD_INGOT, 1)
                .output(0.50f, Items.STICK, 1)
                .output(0.33f, Items.NETHERITE_SCRAP, 1)
                .withCondition(new RecipeEnabledCondition("tools"))
        ),




        COBBLED_DEEPSLATE_FROM_DEEPSLATE = create("content/cobbled_deepslate_from_deepslate", b -> b
                .duration(250)
                .require(Items.DEEPSLATE)
                .output(Items.COBBLED_DEEPSLATE)
                .withCondition(new RecipeEnabledCondition("crushingDeepslate"))
        ),

        COPPER_NUGGET_FROM_LIMESTONE = create("content/copper_nugget_from_limestone", b -> b
                .duration(250)
                .require(AllPaletteStoneTypes.LIMESTONE.getBaseBlock().get())
                .output(0.30f, AllItems.COPPER_NUGGET)
                .withCondition(new NotCondition(new ModLoadedCondition(Northstar.MOD_ID)))
                .withCondition(new RecipeEnabledCondition("copperCrushing"))
        ),

        RUTILE_CONCENTRATE_FROM_LIMESTONE = create("content/compat/northstar/rutile_concentrate_from_limestone", b -> b
                .duration(250)
                .require(AllPaletteStoneTypes.LIMESTONE.getBaseBlock().get())
                .output(0.30f, AllItems.COPPER_NUGGET)
                .output(0.50f, NorthstarItems.RUTILE_CONCENTRATE)
                .withCondition(new ModLoadedCondition(Northstar.MOD_ID))
                .withCondition(new RecipeEnabledCondition("rutileConcentrateCrushing"))
        ),

        NICKEL_NUGGET_FROM_SCORCHIA = create("content/compat/creatingspace/nickel_nugget_from_scorchia", b -> b
                .duration(250)
                .require(AllPaletteStoneTypes.SCORCHIA.getBaseBlock().get())
                .output(0.30f, ItemInit.NICKEL_NUGGET)
                .withCondition(new ModLoadedCondition(CreatingSpace.MODID))
                .withCondition(new RecipeEnabledCondition("nickelCrushing"))
        ),

        POWERED_OBSIDIAN_FROM_CRYING_OBSIDIAN = create("content/powdered_obsidian_from_crying_obsidian", b -> b
                .duration(500)
                .require(Items.CRYING_OBSIDIAN)
                .output(Items.OBSIDIAN)
                .output(0.25f, AllItems.POWDERED_OBSIDIAN)
                .withCondition(new RecipeEnabledCondition("powderedObsidianCrushing"))
        ),

        ZINC_NUGGET_FROM_SCORIA = create("content/zinc_nugget_from_scoria", b -> b
                .duration(250)
                .require(AllPaletteStoneTypes.SCORIA.getBaseBlock().get())
                .output(0.30f, AllItems.ZINC_NUGGET)
                .withCondition(new RecipeEnabledCondition("zincCrushing"))
        );

    /*
     * End of recipe list
     */

    public PerfectCrushingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }
}
