package dev.kalwantspizza.perfectprocessing.config;

import net.createmod.catnip.config.ConfigBase;

public class PCasings extends ConfigBase {
    public final ConfigBool legacyCasings = b(true, "legacyCasings", Comments.legacyCasings, Comments.defaultTrue);

    @Override
    public String getName() {
        return "casings";
    }

    private static class Comments {
        static String legacyCasings = "Whether the refined radiance, shadow steel, chromatic compound and their casings can be made";

        static String defaultTrue = "§2Default: True";
    }
}
