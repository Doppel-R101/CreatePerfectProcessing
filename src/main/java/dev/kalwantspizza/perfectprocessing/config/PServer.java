package dev.kalwantspizza.perfectprocessing.config;

import net.createmod.catnip.config.ConfigBase;

public class PServer extends ConfigBase {
    public final PBlocks blocks = nested(0, PBlocks::new, Comments.blocks);
    public final PCasings casings = nested(0, PCasings::new, Comments.casings);
    public final PGems gems = nested(0, PGems::new, Comments.gems);
    public final PItems items = nested(0, PItems::new, Comments.items);
    public final PRecycling recycling = nested(0, PRecycling::new, Comments.recycling);

    @Override
    public String getName() {
        return "server";
    }

    private static class Comments {
        static String blocks = "All recipes producing blocks";
        static String casings = "All recipes related to casings";
        static String gems = "All recipes that produce gems, such as diamonds";
        static String items = "All recipes that produce items which aren't gems";
        static String recycling = "All recipes related to recycling items, tools and blocks";
    }
}
