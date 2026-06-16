package dev.kalwantspizza.perfectprocessing.datagen;

import com.copycatsplus.copycats.CCBlocks;
import com.lightning.northstar.content.NorthstarItems;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import dev.kalwantspizza.perfectprocessing.AllTags;
import dev.kalwantspizza.perfectprocessing.perfectprocessing;
import net.mcreator.createstuffadditions.init.CreateSaModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.p3pp3rf1y.sophisticatedbackpacks.init.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CompletableFuture.supplyAsync(() -> null), perfectprocessing.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(AllTags.ItemTags.COPYCAT_SCRAP_LARGE).add(
                CCBlocks.COPYCAT_BLOCK.asItem(),
                CCBlocks.COPYCAT_BEAM.asItem(),
                CCBlocks.COPYCAT_FENCE.asItem(),
                CCBlocks.COPYCAT_FENCE_GATE.asItem(),
                CCBlocks.COPYCAT_FOLDING_DOOR.asItem(),
                CCBlocks.COPYCAT_GHOST_BLOCK.asItem(),
                CCBlocks.COPYCAT_VERTICAL_STAIRS.asItem(),
                CCBlocks.COPYCAT_STAIRS.asItem(),
                CCBlocks.COPYCAT_WALL.asItem()
        );
        tag(AllTags.ItemTags.COPYCAT_SCRAP_MEDIUM).add(
                CCBlocks.COPYCAT_SLAB.asItem(),
                CCBlocks.COPYCAT_HEAVY_WEIGHTED_PRESSURE_PLATE.asItem(),
                CCBlocks.COPYCAT_IRON_TRAPDOOR.asItem(),
                CCBlocks.COPYCAT_SLOPE.asItem(),
                CCBlocks.COPYCAT_VERTICAL_SLOPE.asItem(),
                CCBlocks.COPYCAT_LIGHT_WEIGHTED_PRESSURE_PLATE.asItem()
        );
        tag(AllTags.ItemTags.COPYCAT_SCRAP_NORMAL).add(
                CCBlocks.COPYCAT_BEAM.asItem(),
                CCBlocks.COPYCAT_SHAFT.asItem(),
                AllBlocks.COPYCAT_PANEL.asItem(),
                AllBlocks.COPYCAT_STEP.asItem(),
                CCBlocks.COPYCAT_STONE_BUTTON.asItem(),
                CCBlocks.COPYCAT_STONE_PRESSURE_PLATE.asItem(),
                CCBlocks.COPYCAT_TRAPDOOR.asItem(),
                CCBlocks.COPYCAT_VERTICAL_STEP.asItem(),
                CCBlocks.COPYCAT_WOODEN_BUTTON.asItem(),
                CCBlocks.COPYCAT_WOODEN_PRESSURE_PLATE.asItem()
        );
        tag(AllTags.ItemTags.COPYCAT_SCRAP_SMALL).add(
                CCBlocks.COPYCAT_LADDER.asItem()
        );
        tag(AllTags.ItemTags.COPYCAT_SCRAP_MINI).add(
                CCBlocks.COPYCAT_BOARD.asItem(),
                CCBlocks.COPYCAT_BYTE.asItem(),
                CCBlocks.COPYCAT_FLAT_PANE.asItem(),
                CCBlocks.COPYCAT_HALF_PANEL.asItem(),
                CCBlocks.COPYCAT_LAYER.asItem(),
                CCBlocks.COPYCAT_PANE.asItem(),
                CCBlocks.COPYCAT_SLOPE_LAYER.asItem()
        );
        tag(AllTags.ItemTags.COPYCAT_SCRAP_TINY).add(
                CCBlocks.COPYCAT_BYTE_PANEL.asItem(),
                CCBlocks.COPYCAT_CORNER_SLICE.asItem(),
                CCBlocks.COPYCAT_HALF_LAYER.asItem(),
                CCBlocks.COPYCAT_SLICE.asItem(),
                CCBlocks.COPYCAT_STACKED_HALF_LAYER.asItem(),
                CCBlocks.COPYCAT_VERTICAL_HALF_LAYER.asItem(),
                CCBlocks.COPYCAT_VERTICAL_SLICE.asItem()
        );
        tag(AllTags.ItemTags.COPYCAT_SCRAP_IRON_DOOR).add(
                CCBlocks.COPYCAT_IRON_DOOR.asItem()
        );
        tag(AllTags.ItemTags.COPYCAT_SCRAP_COGWHEELS).add(
                CCBlocks.COPYCAT_COGWHEEL.asItem(),
                CCBlocks.COPYCAT_LARGE_COGWHEEL.asItem()
        );
        tag(AllTags.ItemTags.COPYCAT_SCRAP_PIPE).add(
                CCBlocks.COPYCAT_FLUID_PIPE.asItem()
        );

        tag(AllTags.ItemTags.SOPHISTICATED_NORMAL_UPGRADES).add(
                ModItems.PICKUP_UPGRADE.getKey(),
                ModItems.FILTER_UPGRADE.getKey(),
                ModItems.MAGNET_UPGRADE.getKey(),
                ModItems.MOB_CATCHER_UPGRADE.getKey(),
                ModItems.FEEDING_UPGRADE.getKey(),
                ModItems.COMPACTING_UPGRADE.getKey(),
                ModItems.VOID_UPGRADE.getKey(),
                ModItems.RESTOCK_UPGRADE.getKey(),
                ModItems.DEPOSIT_UPGRADE.getKey(),
                ModItems.REFILL_UPGRADE.getKey(),
                ModItems.SMELTING_UPGRADE.getKey(),
                ModItems.SMOKING_UPGRADE.getKey(),
                ModItems.BLASTING_UPGRADE.getKey(),
                ModItems.CRAFTING_UPGRADE.getKey(),
                ModItems.STONECUTTER_UPGRADE.getKey(),
                ModItems.JUKEBOX_UPGRADE.getKey(),
                ModItems.TOOL_SWAPPER_UPGRADE.getKey(),
                ModItems.TANK_UPGRADE.getKey(),
                ModItems.BATTERY_UPGRADE.getKey(),
                ModItems.PUMP_UPGRADE.getKey(),
                ModItems.ANVIL_UPGRADE.getKey(),
                ModItems.SMITHING_UPGRADE.getKey(),
                ModItems.ALCHEMY_UPGRADE.getKey()
        );
        tag(AllTags.ItemTags.SOPHISTICATED_ADVANCED_UPGRADES).add(
                ModItems.ADVANCED_PICKUP_UPGRADE.getKey(),
                ModItems.ADVANCED_FILTER_UPGRADE.getKey(),
                ModItems.ADVANCED_MAGNET_UPGRADE.getKey(),
                ModItems.ADVANCED_MOB_CATCHER_UPGRADE.getKey(),
                ModItems.ADVANCED_FEEDING_UPGRADE.getKey(),
                ModItems.ADVANCED_COMPACTING_UPGRADE.getKey(),
                ModItems.ADVANCED_VOID_UPGRADE.getKey(),
                ModItems.ADVANCED_RESTOCK_UPGRADE.getKey(),
                ModItems.ADVANCED_DEPOSIT_UPGRADE.getKey(),
                ModItems.ADVANCED_REFILL_UPGRADE.getKey(),
                ModItems.AUTO_SMELTING_UPGRADE.getKey(),
                ModItems.AUTO_SMOKING_UPGRADE.getKey(),
                ModItems.AUTO_BLASTING_UPGRADE.getKey(),
                ModItems.ADVANCED_JUKEBOX_UPGRADE.getKey(),
                ModItems.ADVANCED_TOOL_SWAPPER_UPGRADE.getKey(),
                ModItems.ADVANCED_PUMP_UPGRADE.getKey(),
                ModItems.ADVANCED_ALCHEMY_UPGRADE.getKey()
        );
        tag(AllTags.ItemTags.SOPHISTICATED_SPECIAL_UPGRADES).add(
                ModItems.INCEPTION_UPGRADE.getKey(),
                ModItems.EVERLASTING_UPGRADE.getKey()
        );
        tag(AllTags.ItemTags.SOPHISTICATED_BACKPACKS).add(
                ModItems.BACKPACK.getKey(),
                ModItems.COPPER_BACKPACK.getKey(),
                ModItems.IRON_BACKPACK.getKey(),
                ModItems.GOLD_BACKPACK.getKey()
        );
        tag(AllTags.ItemTags.SOPHISTICATED_BACKPACKS_VALUE).add(
                ModItems.DIAMOND_BACKPACK.getKey(),
                ModItems.NETHERITE_BACKPACK.getKey()
        );
        // Wood
        tag(AllTags.ItemTags.TOOLS_WOODEN_LARGE).add(
                Items.WOODEN_AXE,
                Items.WOODEN_PICKAXE
        );
        tag(AllTags.ItemTags.TOOLS_WOODEN_NORMAL).add(
                Items.WOODEN_HOE,
                Items.WOODEN_SWORD
        );
        tag(AllTags.ItemTags.TOOLS_WOODEN_SMALL).add(
                Items.WOODEN_SHOVEL
        );
        // Stone
        tag(AllTags.ItemTags.TOOLS_STONE_LARGE).add(
                Items.STONE_AXE,
                Items.STONE_PICKAXE
        );
        tag(AllTags.ItemTags.TOOLS_STONE_NORMAL).add(
                Items.STONE_HOE,
                Items.STONE_SWORD
        );
        tag(AllTags.ItemTags.TOOLS_STONE_SMALL).add(
                Items.STONE_SHOVEL
        );
        // Iron
        tag(AllTags.ItemTags.TOOLS_IRON_LARGE).add(
                Items.IRON_AXE,
                Items.IRON_PICKAXE
        );
        tag(AllTags.ItemTags.TOOLS_IRON_NORMAL).add(
                Items.IRON_HOE,
                Items.IRON_SWORD
        );
        tag(AllTags.ItemTags.TOOLS_IRON_SMALL).add(
                Items.IRON_SHOVEL
        );
        // Gold
        tag(AllTags.ItemTags.TOOLS_GOLD_LARGE).add(
                Items.GOLDEN_AXE,
                Items.GOLDEN_PICKAXE
        );
        tag(AllTags.ItemTags.TOOLS_GOLD_NORMAL).add(
                Items.GOLDEN_HOE,
                Items.GOLDEN_SWORD
        );
        tag(AllTags.ItemTags.TOOLS_GOLD_SMALL).add(
                Items.GOLDEN_SHOVEL
        );
        // Diamond
        tag(AllTags.ItemTags.TOOLS_DIAMOND_LARGE).add(
                Items.DIAMOND_AXE,
                Items.DIAMOND_PICKAXE
        );
        tag(AllTags.ItemTags.TOOLS_DIAMOND_NORMAL).add(
                Items.DIAMOND_HOE,
                Items.DIAMOND_SWORD
        );
        tag(AllTags.ItemTags.TOOLS_DIAMOND_SMALL).add(
                Items.DIAMOND_SHOVEL
        );
        // Netherite
        tag(AllTags.ItemTags.TOOLS_NETHERITE_LARGE).add(
                Items.NETHERITE_AXE,
                Items.NETHERITE_PICKAXE
        );
        tag(AllTags.ItemTags.TOOLS_NETHERITE_NORMAL).add(
                Items.NETHERITE_HOE,
                Items.NETHERITE_SWORD
        );
        tag(AllTags.ItemTags.TOOLS_NETHERITE_SMALL).add(
                Items.NETHERITE_SHOVEL
        );
        // Blazing (Stuffs & Additions)
        tag(AllTags.ItemTags.TOOLS_BLAZING_LARGE).add(
                CreateSaModItems.BLAZING_PICKAXE.get(),
                CreateSaModItems.BLAZING_AXE.get()
        );
        tag(AllTags.ItemTags.TOOLS_BLAZING_NORMAL).add(
                CreateSaModItems.BLAZING_CLEAVER.get()
        );
        tag(AllTags.ItemTags.TOOLS_BLAZING_SMALL).add(
                CreateSaModItems.BLAZING_SHOVEL.get()
        );
        // Gilded Quartz (Stuffs & Additions)
        tag(AllTags.ItemTags.TOOLS_GILDED_QUARTZ_LARGE).add(
                CreateSaModItems.ROSE_QUARTZ_PICKAXE.get(),
                CreateSaModItems.ROSE_QUARTZ_AXE.get()
        );
        tag(AllTags.ItemTags.TOOLS_GILDED_QUARTZ_NORMAL).add(
                CreateSaModItems.ROSE_QUARTZ_SWORD.get()
        );
        tag(AllTags.ItemTags.TOOLS_GILDED_QUARTZ_SMALL).add(
                CreateSaModItems.ROSE_QUARTZ_SHOVEL.get()
        );
        // Brass (Stuffs & Additions)
        tag(AllTags.ItemTags.TOOLS_BRASS_LARGE).add(
                CreateSaModItems.BRASS_AXE.get(),
                CreateSaModItems.BRASS_PICKAXE.get()
        );
        tag(AllTags.ItemTags.TOOLS_BRASS_NORMAL).add(
                CreateSaModItems.BRASS_HOE.get(),
                CreateSaModItems.BRASS_SWORD.get()
        );
        tag(AllTags.ItemTags.TOOLS_BRASS_SMALL).add(
                CreateSaModItems.BRASS_SHOVEL.get()
        );
        // Zinc (Stuffs & Additions)
        tag(AllTags.ItemTags.TOOLS_ZINC_LARGE).add(
                CreateSaModItems.ZINC_PICKAXE.get(),
                CreateSaModItems.ZINC_AXE.get()
        );
        tag(AllTags.ItemTags.TOOLS_ZINC_NORMAL).add(
                CreateSaModItems.ZINC_HOE.get(),
                CreateSaModItems.ZINC_SWORD.get()
        );
        tag(AllTags.ItemTags.TOOLS_ZINC_SMALL).add(
                CreateSaModItems.ZINC_SHOVEL.get()
        );
        // Copper (Stuffs & Additions)
        tag(AllTags.ItemTags.TOOLS_COPPER_LARGE).add(
                CreateSaModItems.COPPER_PICKAXE.get(),
                CreateSaModItems.COPPER_AXE.get()
        );
        tag(AllTags.ItemTags.TOOLS_COPPER_NORMAL).add(
                CreateSaModItems.COPPER_HOE.get(),
                CreateSaModItems.COPPER_SWORD.get()
        );
        tag(AllTags.ItemTags.TOOLS_COPPER_SMALL).add(
                CreateSaModItems.COPPER_SHOVEL.get()
        );
        // Experience (Stuffs & Additions)
        tag(AllTags.ItemTags.TOOLS_EXPERIENCE_LARGE).add(
                CreateSaModItems.EXPERIENCE_AXE.get(),
                CreateSaModItems.EXPERIENCE_PICKAXE.get()
        );
        tag(AllTags.ItemTags.TOOLS_EXPERIENCE_NORMAL).add(
                CreateSaModItems.EXPERIENCE_SWORD.get()
        );
        tag(AllTags.ItemTags.TOOLS_EXPERIENCE_SMALL).add(
                CreateSaModItems.EXPERIENCE_SHOVEL.get()
        );
        // Martian Steel (Northstar)
        tag(AllTags.ItemTags.TOOLS_MARTIAN_STEEL_LARGE).add(
                NorthstarItems.MARTIAN_AXE.get(),
                NorthstarItems.MARTIAN_PICKAXE.get()
        );
        tag(AllTags.ItemTags.TOOLS_MARTIAN_STEEL_NORMAL).add(
                NorthstarItems.MARTIAN_HOE.get(),
                NorthstarItems.MARTIAN_SWORD.get()
        );
        tag(AllTags.ItemTags.TOOLS_MARTIAN_STEEL_SMALL).add(
                NorthstarItems.MARTIAN_SHOVEL.get()
        );

        // Leather
        tag(AllTags.ItemTags.ARMOR_LEATHER_LARGE).add(
                Items.LEATHER_CHESTPLATE,
                Items.LEATHER_LEGGINGS
        );
        tag(AllTags.ItemTags.ARMOR_LEATHER_SMALL).add(
                Items.LEATHER_HELMET,
                Items.LEATHER_BOOTS
        );
        // Chainmail
        tag(AllTags.ItemTags.ARMOR_CHAINMAIL_LARGE).add(
                Items.CHAINMAIL_CHESTPLATE,
                Items.CHAINMAIL_LEGGINGS
        );
        tag(AllTags.ItemTags.ARMOR_CHAINMAIL_SMALL).add(
                Items.CHAINMAIL_HELMET,
                Items.CHAINMAIL_BOOTS
        );
        // Iron
        tag(AllTags.ItemTags.ARMOR_IRON_LARGE).add(
                Items.IRON_CHESTPLATE,
                Items.IRON_LEGGINGS
        );
        tag(AllTags.ItemTags.ARMOR_IRON_SMALL).add(
                Items.IRON_HELMET,
                Items.IRON_BOOTS
        );
        // Gold
        tag(AllTags.ItemTags.ARMOR_GOLDEN_LARGE).add(
                Items.GOLDEN_CHESTPLATE,
                Items.GOLDEN_LEGGINGS
        );
        tag(AllTags.ItemTags.ARMOR_GOLDEN_SMALL).add(
                Items.GOLDEN_HELMET,
                Items.GOLDEN_BOOTS
        );
        // Diamond
        tag(AllTags.ItemTags.ARMOR_DIAMOND_LARGE).add(
                Items.DIAMOND_CHESTPLATE,
                Items.DIAMOND_LEGGINGS
        );
        tag(AllTags.ItemTags.ARMOR_DIAMOND_SMALL).add(
                Items.DIAMOND_HELMET,
                Items.DIAMOND_BOOTS
        );
        // Netherite
        tag(AllTags.ItemTags.ARMOR_NETHERITE_LARGE).add(
                Items.NETHERITE_CHESTPLATE,
                Items.NETHERITE_LEGGINGS
        );
        tag(AllTags.ItemTags.ARMOR_NETHERITE_SMALL).add(
                Items.NETHERITE_HELMET,
                Items.NETHERITE_BOOTS
        );
        // Cardboard (Create)
        tag(AllTags.ItemTags.ARMOR_CARDBOARD_LARGE).add(
                AllItems.CARDBOARD_CHESTPLATE.get(),
                AllItems.CARDBOARD_LEGGINGS.get()
        );
        tag(AllTags.ItemTags.ARMOR_CARDBOARD_SMALL).add(
                AllItems.CARDBOARD_HELMET.get(),
                AllItems.CARDBOARD_BOOTS.get()
        );
        // Brass (Stuffs & Additions)
        tag(AllTags.ItemTags.ARMOR_BRASS_LARGE).add(
                CreateSaModItems.BRASS_CHESTPLATE.get(),
                CreateSaModItems.BRASS_LEGGINGS.get()
        );
        tag(AllTags.ItemTags.ARMOR_BRASS_SMALL).add(
                CreateSaModItems.BRASS_HELMET.get(),
                CreateSaModItems.BRASS_BOOTS.get()
        );
        // Zinc (Stuffs & Additions)
        tag(AllTags.ItemTags.ARMOR_ZINC_LARGE).add(
                CreateSaModItems.ZINC_CHESTPLATE.get(),
                CreateSaModItems.ZINC_LEGGINGS.get()
        );
        tag(AllTags.ItemTags.ARMOR_ZINC_SMALL).add(
                CreateSaModItems.ZINC_LEGGINGS.get(),
                CreateSaModItems.ZINC_BOOTS.get()
        );
        // Copper (Stuffs & Additions)
        tag(AllTags.ItemTags.ARMOR_COPPER_LARGE).add(
                CreateSaModItems.COPPER_CHESTPLATE.get(),
                CreateSaModItems.COPPER_LEGGINGS.get()
        );
        tag(AllTags.ItemTags.ARMOR_COPPER_SMALL).add(
                CreateSaModItems.COPPER_HELMET.get(),
                CreateSaModItems.COPPER_BOOTS.get()
        );
        // Martian Steel (Northstar)
        tag(AllTags.ItemTags.ARMOR_MARTIAN_STEEL_LARGE).add(
                NorthstarItems.MARTIAN_STEEL_CHESTPLATE.get(),
                NorthstarItems.MARTIAN_STEEL_LEGGINGS.get()
        );
        tag(AllTags.ItemTags.ARMOR_MARTIAN_STEEL_SMALL).add(
                NorthstarItems.MARTIAN_STEEL_HELMET.get(),
                NorthstarItems.MARTIAN_STEEL_BOOTS.get()
        );
        // Iron Space Suit (Northstar)
        tag(AllTags.ItemTags.ARMOR_IRON_SPACE_SUIT_LARGE).add(
                NorthstarItems.IRON_SPACE_SUIT_CHESTPIECE.get(),
                NorthstarItems.IRON_SPACE_SUIT_LEGGINGS.get()
        );
        tag(AllTags.ItemTags.ARMOR_IRON_SPACE_SUIT_SMALL).add(
                NorthstarItems.IRON_SPACE_SUIT_HELMET.get(),
                NorthstarItems.IRON_SPACE_SUIT_BOOTS.get()
        );
        // Martian Steel Spacesuit (Northstar)
        tag(AllTags.ItemTags.ARMOR_MARTIAN_STEEL_SPACE_SUIT_LARGE).add(
                NorthstarItems.MARTIAN_STEEL_SPACE_SUIT_CHESTPIECE.get(),
                NorthstarItems.MARTIAN_STEEL_SPACE_SUIT_LEGGINGS.get()
        );
        tag(AllTags.ItemTags.ARMOR_MARTIAN_STEEL_SPACE_SUIT_SMALL).add(
                NorthstarItems.MARTIAN_STEEL_SPACE_SUIT_HELMET.get(),
                NorthstarItems.MARTIAN_STEEL_SPACE_SUIT_BOOTS.get()
        );
        // Andesite Jetpack (Stuffs & Additions)
        tag(AllTags.ItemTags.ARMOR_ANDESITE_JETPACK).add(
                CreateSaModItems.ANDESITE_JETPACK_CHESTPLATE.get()
        );
        // Brass Jetpack (Stuffs & Additions)
        tag(AllTags.ItemTags.ARMOR_BRASS_JETPACK).add(
                CreateSaModItems.BRASS_JETPACK_CHESTPLATE.get()
        );
        // Copper Jetpack (Stuffs & Additions)
        tag(AllTags.ItemTags.ARMOR_COPPER_JETPACK).add(
                CreateSaModItems.COPPER_JETPACK_CHESTPLATE.get()
        );
        // Netherite Jetpack (Stuffs & Additions)
        tag(AllTags.ItemTags.ARMOR_NETHERITE_JETPACK).add(
                CreateSaModItems.NETHERITE_JETPACK_CHESTPLATE.get()
        );
        // Andesite Exoskeleton (Stuffs & Additions)
        tag(AllTags.ItemTags.ARMOR_ANDESITE_EXOSKELETON).add(
                CreateSaModItems.ANDESITE_EXOSKELETON_CHESTPLATE.get()
        );
        // Brass Exoskeleton (Stuffs & Additions)
        tag(AllTags.ItemTags.ARMOR_BRASS_EXOSKELETON).add(
                CreateSaModItems.BRASS_EXOSKELETON_CHESTPLATE.get()
        );
        // Copper Exoskeleton (Stuffs & Additions)
        tag(AllTags.ItemTags.ARMOR_COPPER_EXOSKELETON).add(
                CreateSaModItems.COPPER_EXOSKELETON_CHESTPLATE.get()
        );
    }
}
