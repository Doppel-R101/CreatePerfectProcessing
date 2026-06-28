package dev.kalwantspizza.perfectprocessing;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@SuppressWarnings("deprecated")
@EventBusSubscriber(modid = PerfectProcessing.MODID, bus = EventBusSubscriber.Bus.MOD)
public class PerfectConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue RECYCLE_ARMOR = BUILDER
            .comment("Whether armor recycling is active")
            .translation("PerfectProcessing.config.armor_recycling")
            .define("recycleArmor", true);
    private static final ModConfigSpec.BooleanValue RECYCLE_TOOLS = BUILDER
            .comment("Whether tool recycling is active")
            .define("recycleTools", true);
    private static final ModConfigSpec.BooleanValue RECYCLE_COPYCATS = BUILDER
            .comment("Whether tool recycling is active")
            .define("recycleCopycats", true);
    private static final ModConfigSpec.BooleanValue RECYCLE_BACKPACKS = BUILDER
            .comment("Whether tool recycling is active")
            .define("recycleBackpacks", true);

    /* Todo: config setup
    *  - configs for all relevant things
    *  - relevant being: diamond recipes, netherite recipe, resource blocks recipes, etc - all recipes could just get their own toggle I guess
    *  - possible re-adding of chunk-loader restrictions?
    *
    *  - turn all config related things into translatable string
    *  - group configs by type (normal, recycling, valuables, ...)
    * */

    static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean recycleArmor;
    public static boolean recycleTools;
    public static boolean recycleCopycats;
    public static boolean recycleBackpacks;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        recycleArmor = RECYCLE_ARMOR.get();
        recycleTools = RECYCLE_TOOLS.get();
        recycleArmor = RECYCLE_COPYCATS.get();
        recycleTools = RECYCLE_BACKPACKS.get();
    }
}
