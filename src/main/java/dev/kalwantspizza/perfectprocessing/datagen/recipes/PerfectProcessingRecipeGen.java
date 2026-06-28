package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.api.data.recipe.ProcessingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class PerfectProcessingRecipeGen {
    public static void registerAllProcessing(DataGenerator gen, PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        final List<ProcessingRecipeGen<?, ?, ?>> GENERATORS = new ArrayList<>();

        GENERATORS.add(new PerfectCrushingRecipeProvider(output, registries));
    }
}
