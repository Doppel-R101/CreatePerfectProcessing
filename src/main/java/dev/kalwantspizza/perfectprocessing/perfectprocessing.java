package dev.kalwantspizza.perfectprocessing;

import dev.kalwantspizza.perfectprocessing.datagen.DataGenerators;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(perfectprocessing.MODID)
public class perfectprocessing {
    public static final String MODID = "perfectprocessing";

    public perfectprocessing(IEventBus modEventBus, ModContainer modContainer) {
        AllTags.init();
        modEventBus.addListener(DataGenerators::gatherData);
    }

    public static ResourceLocation rl(String path){
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
