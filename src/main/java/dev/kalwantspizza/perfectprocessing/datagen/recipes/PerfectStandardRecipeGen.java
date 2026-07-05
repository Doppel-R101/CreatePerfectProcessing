package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.blackgear.vanillabackport.common.registries.ModBlocks;
import com.blackgear.vanillabackport.core.VanillaBackport;
import net.minecraft.advancements.critereon.PlayerTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import org.jetbrains.annotations.NotNull;
import org.violetmoon.quark.base.Quark;
import org.violetmoon.zeta.config.FlagCondition;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class PerfectStandardRecipeGen extends RecipeProvider {
    public PerfectStandardRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static FlagCondition zCond(String name){
        return new FlagCondition(name, Optional.empty());
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Items.CHEST)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .define('#', ModBlocks.PALE_OAK_PLANKS.get())
                .unlockedBy("test", PlayerTrigger.TriggerInstance.tick())
                .save(recipeOutput.withConditions(zCond("variant_chests"), new ModLoadedCondition(Quark.MOD_ID), new ModLoadedCondition(VanillaBackport.MOD_ID)), "perfectprocessing:shaped_crafting/compat/quark_vanilla_backport/chest_from_pale_oak");

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Items.CHEST, 4)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .define('#', ModBlocks.PALE_OAK_LOG.get())
                .unlockedBy("test", PlayerTrigger.TriggerInstance.tick())
                .save(recipeOutput.withConditions(zCond("variant_chests"), zCond("wood_to_chest_recipes"), new ModLoadedCondition(Quark.MOD_ID), new ModLoadedCondition(VanillaBackport.MOD_ID)), "perfectprocessing:shaped_crafting/compat/quark_vanilla_backport/chest_from_pale_oak_logs");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Items.CHEST, 4)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .define('#', ModBlocks.STRIPPED_PALE_OAK_LOG.get())
                .unlockedBy("test", PlayerTrigger.TriggerInstance.tick())
                .save(recipeOutput.withConditions(zCond("variant_chests"), zCond("wood_to_chest_recipes"), new ModLoadedCondition(Quark.MOD_ID), new ModLoadedCondition(VanillaBackport.MOD_ID)), "perfectprocessing:shaped_crafting/compat/quark_vanilla_backport/chest_from_stripped_pale_oak_logs");


    }
}
