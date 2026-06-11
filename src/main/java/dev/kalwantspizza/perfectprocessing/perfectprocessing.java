package dev.kalwantspizza.perfectprocessing;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.common.Mod;

@Mod(perfectprocessing.MODID)
public class perfectprocessing {
    public static final String MODID = "perfectprocessing";

    public static ResourceLocation rl(String path){
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
