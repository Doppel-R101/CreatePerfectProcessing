package dev.kalwantspizza.perfectprocessing;

import dev.kalwantspizza.perfectprocessing.datagen.PerfectDataGenerators;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(PerfectProcessing.MODID)
public class PerfectProcessing {
    public static final String MODID = "perfectprocessing";

    public PerfectProcessing(IEventBus modEventBus, ModContainer modContainer) {
        PerfectTags.init();
        modEventBus.addListener(PerfectDataGenerators::gatherData);

        modContainer.registerConfig(ModConfig.Type.COMMON, PerfectConfig.SPEC);
    }

    public static ResourceLocation rl(String path){
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
