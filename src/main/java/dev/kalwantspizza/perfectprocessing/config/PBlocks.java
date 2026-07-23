package dev.kalwantspizza.perfectprocessing.config;

import net.createmod.catnip.config.ConfigBase;

public class PBlocks extends ConfigBase {
    public final ConfigBool crushingDeepslate = b(true, "crushDeepslate", Comments.crushingDeepslate, Comments.defaultTrue);
    public final ConfigBool compactResource = b(true, "compactResourceBlocks", Comments.compactResource, Comments.resourceList, Comments.defaultTrue);
    public final ConfigBool fillDecorative = b(true, "fillDecorativeBlocks", Comments.fillDecorative, Comments.decorativeList, Comments.defaultTrue);
    public final ConfigBool mixingProduce = b(true, "mixProductionalBlocks", Comments.mixingProduce, Comments.produceList, Comments.defaultTrue);
    public final ConfigBool spongeDupe = b(true, "duplicateSponges", Comments.spongeDupe, Comments.defaultTrue);

    @Override
    public String getName() {
        return "blocks";
    }

    private static class Comments {
        static String fillDecorative = "Whether the recipes for decorative blocks are enabled";
        static String compactResource = "Whether the compacting recipes for resource blocks are enabled";
        static String mixingProduce = "Whether the mixing recipes for productional blocks are enabled";
        static String spongeDupe = "Whether corals can be compacted into additional sponges";
        static String crushingDeepslate = "Whether deepslate can be crushed into cobbled deepslate";

        static String decorativeList = "§dDecorative: §dBasalt, §dCalcite, §dDeepslate, §dDripstone";
        static String resourceList = "§dResource: §dAsurine, §dCrimsite, §dOchrum, §dVeridium";
        static String produceList = "§dProductional: §dDiorite, §dNetherrack, §dTuff";

        static String defaultTrue = "§2Default: True";
    }
}
