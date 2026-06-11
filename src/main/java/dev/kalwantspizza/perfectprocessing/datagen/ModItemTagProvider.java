package dev.kalwantspizza.perfectprocessing.datagen;

import dev.kalwantspizza.perfectprocessing.AllTags;
import dev.kalwantspizza.perfectprocessing.perfectprocessing;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> itemTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, itemTags, perfectprocessing.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(AllTags.ItemTags.COPYCAT_SCRAP_LARGE).add(
            
        )


    }
}
