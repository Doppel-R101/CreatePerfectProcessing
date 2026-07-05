package dev.kalwantspizza.perfectprocessing.datagen;

import dev.kalwantspizza.perfectprocessing.datagen.recipes.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class PerfectDataGenerators {
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new PerfectItemTagProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new PerfectCrushingRecipeGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new PerfectHauntingRecipeGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new PerfectCompactingRecipeGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new PerfectMixingRecipeGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new PerfectItemApplicationRecipeGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new PerfectDeployingRecipeGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new PerfectStandardRecipeGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new PerfectFillingRecipeGen(packOutput, lookupProvider));

        if (event.includeServer()) {
            PerfectProcessingRecipeGen.registerAllProcessing(generator, packOutput, lookupProvider);
        }
    }
}