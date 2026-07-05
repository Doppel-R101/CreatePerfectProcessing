package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.api.data.recipe.FillingRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import net.mehvahdjukaar.supplementaries.Supplementaries;
import net.mehvahdjukaar.supplementaries.reg.ModRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class PerfectFillingRecipeGen extends FillingRecipeGen {
    public PerfectFillingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }

    GeneratedRecipe

            CALCITE_FROM_FILLING_DIORITE = create("content/calcite_from_filling_diorite", b -> b
                    .require(Tags.Fluids.WATER, 100)
                    .require(Items.DIORITE)
                    .output(Items.CALCITE)
    ),

            DEEPSLATE_FROM_FILLING_FLINT_BLOCK = create("content/deepslate_from_filling_flint_block", b -> b
                    .require(Tags.Fluids.LAVA, 100)
                    .require(ModRegistry.FLINT_BLOCK.get())
                    .output(Items.DEEPSLATE)
                    .whenModLoaded(Supplementaries.MOD_ID)

    ),

            DRIPSTONE_FROM_FILLING_GRANITE = create("content/dripstone_from_filling_granite", b -> b
                    .require(Tags.Fluids.WATER, 100)
                    .require(Items.GRANITE)
                    .output(Items.DRIPSTONE_BLOCK)

    );
}
