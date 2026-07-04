package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.api.data.recipe.CompactingRecipeGen;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.simibubi.create.foundation.data.recipe.CommonMetal;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import dev.kalwantspizza.perfectprocessing.PerfectTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class PerfectCompactingRecipeGen extends CompactingRecipeGen {
    public PerfectCompactingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }

    GeneratedRecipe

            ASURINE_FROM_PRESSING = create("content/asurine_from_pressing", b -> b
                .require(Tags.Items.GRAVELS)
                .require(Tags.Items.GRAVELS)
                .require(CommonMetal.ZINC.nuggets)
                .require(CommonMetal.ZINC.nuggets)
                .require(CommonMetal.ZINC.nuggets)
                .require(CommonMetal.ZINC.nuggets)
                .require(FluidTags.LAVA, 100)
                .output(AllPaletteStoneTypes.ASURINE.baseBlock.get(), 2)

    ),
            CRIMSITE_FROM_PRESSING = create("content/crimsite_from_pressing", b -> b
                .require(Tags.Items.GRAVELS)
                .require(Tags.Items.GRAVELS)
                .require(Tags.Items.NUGGETS_IRON)
                .require(Tags.Items.NUGGETS_IRON)
                .require(Tags.Items.NUGGETS_IRON)
                .require(Tags.Items.NUGGETS_IRON)
                .require(Tags.Items.NUGGETS_IRON)
                .require(FluidTags.LAVA, 100)
                .output(AllPaletteStoneTypes.CRIMSITE.baseBlock.get(), 2)

    ),
            OCHRUM_FROM_PRESSING = create("content/ochrum_from_pressing", b -> b
                .require(Tags.Items.GRAVELS)
                .require(Tags.Items.GRAVELS)
                .require(Tags.Items.NUGGETS_GOLD)
                .require(Tags.Items.NUGGETS_GOLD)
                .require(Tags.Items.NUGGETS_GOLD)
                .require(FluidTags.LAVA, 100)
                .output(AllPaletteStoneTypes.OCHRUM.baseBlock.get(), 2)

    ),
            VERIDIUM_FROM_PRESSING = create("content/veridium_from_pressing", b -> b
                .require(Tags.Items.GRAVELS)
                .require(CommonMetal.COPPER.nuggets)
                .require(CommonMetal.COPPER.nuggets)
                .require(CommonMetal.COPPER.nuggets)
                .require(CommonMetal.COPPER.nuggets)
                .require(CommonMetal.COPPER.nuggets)
                .require(CommonMetal.COPPER.nuggets)
                .require(CommonMetal.COPPER.nuggets)
                .require(FluidTags.LAVA, 100)
                .output(AllPaletteStoneTypes.VERIDIUM.baseBlock.get(), 2)

    ),
            SPONGE_DUPLICATION_FROM_CORALS = create("content/sponge_duplication_from_corals", b -> b
                .require(Items.SPONGE)
                .require(PerfectTags.ItemTags.ALL_CORAL_TYPES)
                .require(PerfectTags.ItemTags.ALL_CORAL_TYPES)
                .require(PerfectTags.ItemTags.ALL_CORAL_TYPES)
                .require(PerfectTags.ItemTags.ALL_CORAL_TYPES)
                .output(Items.SPONGE, 2)
                .output(0.25f, Items.SPONGE)

    ),
            SPONGE_DUPLICATION_FROM_DEAD_CORALS = create("content/sponge_duplication_from_dead_corals", b -> b
                .require(Items.SPONGE)
                .require(PerfectTags.ItemTags.ALL_DRIED_CORAL_TYPES)
                .require(PerfectTags.ItemTags.ALL_DRIED_CORAL_TYPES)
                .require(PerfectTags.ItemTags.ALL_DRIED_CORAL_TYPES)
                .require(PerfectTags.ItemTags.ALL_DRIED_CORAL_TYPES)
                .require(Items.BONE_MEAL)
                .require(Items.BONE_MEAL)
                .require(FluidTags.WATER, 250)
                .output(Items.SPONGE, 2)
                .output(0.25f, Items.SPONGE)

    ),
            COAL_FROM_CHARCOAL_COMPACTING = create("content/coal_from_charcoal_compacting", b -> b
                .require(Items.CHARCOAL)
                .require(Items.CHARCOAL)
                .require(Items.CHARCOAL)
                .require(Items.CHARCOAL)
                .output(Items.COAL)
                .output(0.125f, Items.COAL)

    ),
            BASALT_FROM_PRESSING = create("content/basalt_from_pressing", b -> b
                .require(Items.BLUE_ICE)
                .require(Items.SOUL_SOIL)
                .require(FluidTags.LAVA, 500)
                .output(Items.COAL)
                .output(Items.BASALT, 2)
                .output(Items.BLUE_ICE)
                .output(Items.SOUL_SOIL)

    );
}
