package dev.kalwantspizza.perfectprocessing;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = PerfectProcessing.MODID, bus = EventBusSubscriber.Bus.MOD)
public class PerfectConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue RECYCLE_ARMOR = BUILDER
            .comment("Whether armor recycling is active")
            .define("recycleArmor", true);

    static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean recycleArmor;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        recycleArmor = RECYCLE_ARMOR.get();
    }
}
