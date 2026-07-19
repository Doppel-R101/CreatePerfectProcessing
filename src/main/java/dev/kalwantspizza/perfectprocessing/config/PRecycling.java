package dev.kalwantspizza.perfectprocessing.config;

import net.createmod.catnip.config.ConfigBase;

public class PRecycling extends ConfigBase {
    public final ConfigBool armour = b(true, "recycleArmour", Comments.armour, Comments.variousModIntegrated, Comments.defaultTrue);
    public final ConfigBool copycats = b(true, "recycleCopycats", Comments.copycats, Comments.requiresCopycats, Comments.defaultTrue);
    public final ConfigBool sophisticatedBackpacks = b(true, "recycleSophisticatedBackpacks", Comments.sophisticatedBackpacks, Comments.requiresBackpacks, Comments.defaultTrue);
    public final ConfigBool tools = b(true, "recycleTools", Comments.tools, Comments.variousModIntegrated, Comments.defaultTrue);

    @Override
    public String getName() {
        return "recycling";
    }

    private static class Comments {
        static String armour = "Whether armour can be recycled";
        static String copycats = "Whether copycats can be recycled";
        static String sophisticatedBackpacks = "Whether backpacks can be recycled";
        static String tools = "Whether tools can be recycled";


        static String requiresCopycats = "§eRequires§e mod§e 'Create:§e Copycats+'";
        static String requiresBackpacks = "§eRequires§e mod§e 'Sophisticated§e Backpack'";
        static String variousModIntegrated = "§aIncludes §acorresponding §aitems §aof §avarious §amods";

        static String defaultTrue = "§2Default: True";
    }
}
