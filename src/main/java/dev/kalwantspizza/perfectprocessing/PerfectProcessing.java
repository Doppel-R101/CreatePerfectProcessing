package dev.kalwantspizza.perfectprocessing;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.AllItems;
import dev.kalwantspizza.perfectprocessing.datagen.PerfectDataGenerators;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(PerfectProcessing.MODID)
public class PerfectProcessing {
    public static final String MODID = "perfectprocessing";

    public PerfectProcessing(IEventBus modEventBus, ModContainer modContainer) {
        PerfectTags.init();
        modEventBus.addListener(PerfectDataGenerators::gatherData);

        modEventBus.addListener(this::addCreative);

        modContainer.registerConfig(ModConfig.Type.COMMON, PerfectConfig.SPEC);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        // Re-adds chromatic compound and relatives to the base Create tab
        if (event.getTabKey() == AllCreativeModeTabs.BASE_CREATIVE_TAB.getKey()) {
            event.insertAfter(AllItems.BRASS_INGOT.asStack(), AllItems.CHROMATIC_COMPOUND.asStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(AllItems.CHROMATIC_COMPOUND.asStack(), AllItems.SHADOW_STEEL.asStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(AllItems.SHADOW_STEEL.asStack(), AllItems.REFINED_RADIANCE.asStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(AllBlocks.COPPER_CASING.asStack(), AllBlocks.SHADOW_STEEL_CASING.asStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(AllBlocks.SHADOW_STEEL_CASING.asStack(), AllBlocks.REFINED_RADIANCE_CASING.asStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

    }

    public static ResourceLocation rl(String path){
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}