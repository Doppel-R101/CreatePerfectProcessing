package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.SequencedAssemblyRecipeGen;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.simibubi.create.content.fluids.transfer.FillingRecipe;
import com.simibubi.create.content.kinetics.deployer.DeployerApplicationRecipe;
import com.simibubi.create.content.kinetics.press.PressingRecipe;
import com.simibubi.create.content.kinetics.saw.CuttingRecipe;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class PerfectSequencedAssemblyRecipeGen extends SequencedAssemblyRecipeGen {
    public PerfectSequencedAssemblyRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }

    GeneratedRecipe

            REINFORCED_SHEET = create("content/diamond_assembly", b -> b.require(Tags.Items.OBSIDIANS_NORMAL)
            .transitionTo(AllItems.INCOMPLETE_REINFORCED_SHEET.get())
            .addOutput(Items.DIAMOND, 120)
            .addOutput(Items.OBSIDIAN, 5)
            .addOutput(AllPaletteStoneTypes.ASURINE.getBaseBlock().get(), 13)
            .addOutput(Items.GLASS, 2)
            .loops(1)
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(Tags.Items.STORAGE_BLOCKS_COAL))
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(Tags.Items.INGOTS_IRON))
            .addStep(FillingRecipe::new, rb -> rb.require(Tags.Fluids.LAVA, 500))
            .addStep(PressingRecipe::new, rb -> rb)
            .addStep(CuttingRecipe::new, rb -> rb));
}
