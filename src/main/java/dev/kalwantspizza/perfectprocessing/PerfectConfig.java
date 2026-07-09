package dev.kalwantspizza.perfectprocessing;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@SuppressWarnings("removal")
@EventBusSubscriber(modid = PerfectProcessing.MODID, bus = EventBusSubscriber.Bus.MOD)
public class PerfectConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue RECYCLE_GENERAL = BUILDER
            .comment("Whether overall recycling is active")
            .define("recycle Overall", true);


    private static final ModConfigSpec.BooleanValue RECYCLE_ARMOUR = BUILDER
            .comment("Whether armour recycling is active")
            .define("recycle.Armour", true);
    private static final ModConfigSpec.BooleanValue RECYCLE_TOOLS = BUILDER
            .comment("Whether tool recycling is active")
            .define("recycle.Tools", true);
    private static final ModConfigSpec.BooleanValue RECYCLE_COPYCATS = BUILDER
            .comment("Whether copycat recycling is active")
            .define("recycle.Copycats", true);
    private static final ModConfigSpec.BooleanValue RECYCLE_BACKPACKS = BUILDER
            .comment("Whether backpack recycling is active")
            .define("recycle.Backpacks", true);

    /* Todo: config setup
    *  - configs for all relevant things
    *  - relevant being: diamond recipes, netherite recipe, resource blocks recipes, etc - all recipes could just get their own toggle I guess
    *  - possible re-adding of chunk-loader restrictions?
    *
    *  - turn all config related things into translatable string
    *  - group configs by type (normal, recycling, valuables, ...)
    * */

    static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean recycleGeneral;
    public static boolean recycleArmour;
    public static boolean recycleTools;
    public static boolean recycleCopycats;
    public static boolean recycleBackpacks;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        recycleGeneral = RECYCLE_GENERAL.get();
        recycleArmour = RECYCLE_ARMOUR.get();
        recycleTools = RECYCLE_TOOLS.get();
        recycleCopycats = RECYCLE_COPYCATS.get();
        recycleBackpacks = RECYCLE_BACKPACKS.get();
    }
}
