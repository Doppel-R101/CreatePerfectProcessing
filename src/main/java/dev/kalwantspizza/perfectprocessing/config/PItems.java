package dev.kalwantspizza.perfectprocessing.config;

import net.createmod.catnip.config.ConfigBase;

public class PItems extends ConfigBase {
    public final ConfigBool enderEyePolishing = b(true, "enderEyePolishing", Comments.enderEyePolishing, Comments.defaultTrue);
    public final ConfigBool magmaCreamHaunting = b(true, "magmaCreamHaunting", Comments.magmaCreamHaunting, Comments.defaultTrue);
    public final ConfigBool phantomMembraneHaunting = b(true, "phantomMembraneHaunting", Comments.phantomMembraneHaunting, Comments.optionalCritters, Comments.defaultTrue);
    public final ConfigBool powderedObsidianCrushing = b(true, "powderedObsidianCrushing", Comments.powderedObsidianCrushing, Comments.defaultTrue);
    public final ConfigBool powderedSnowBucketDeploying = b(true, "powderedSnowBucketDeploying", Comments.powderedSnowBucketDeploying, Comments.defaultTrue);
    public final ConfigBool rutileConcentrateCrushing = b(true, "rutileConcentrateCrushing", Comments.rutileConcentrateCrushing, Comments.requiresNorthstar, Comments.defaultTrue);

    @Override
    public String getName() {
        return "items";
    }

    private static class Comments {
        static String enderEyePolishing = "Whether crying obsidian can be polished into eyes of ender";
        static String magmaCreamHaunting = "Whether slime balls can be haunted into magma cream";
        static String phantomMembraneHaunting = "Whether feathers can be haunted into phantom membranes";
        static String powderedObsidianCrushing = "Whether crying obsidian can be crushed into powdered obsidian";
        static String powderedSnowBucketDeploying = "Whether snow blocks can be turned into powder snow buckets";
        static String rutileConcentrateCrushing = "Whether limestone can be crushed into rutile concentrate";

        static String requiresNorthstar = "§eRequires§e mod§e 'Create:§e Northstar'";
        static String optionalCritters = "§aOptional §arecipe §ainclusion §afor §a'Critters §a& §aCompanions'";

        static String defaultTrue = "§2Default: True";
    }
}
