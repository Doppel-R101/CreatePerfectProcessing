package dev.kalwantspizza.perfectprocessing.config;

import net.createmod.catnip.config.ConfigBase;

public class PGems extends ConfigBase {

    public final ConfigEnum<RecipeTypeSetting> AncientDebrisRecipe =
            e(RecipeTypeSetting.ASSEMBLY, "ancientDebrisRecipe", Comments.recipeTypeNetherite, Comments.recipeTypeNetheriteAssembly, Comments.recipeTypeNetheriteLegacy, Comments.defaultAssembly);
    public final ConfigBool CoalCompacting = b(true, "compactCoal", Comments.coalCompact, Comments.defaultTrue);
    public final ConfigBool CopperCrushing = b(true, "copperCrushing", Comments.copperCrushing, Comments.defaultTrue);
    public final ConfigEnum<RecipeTypeSetting> DiamondRecipe =
            e(RecipeTypeSetting.ASSEMBLY, "diamondRecipe", Comments.recipeTypeDiamond, Comments.recipeTypeDiamondAssembly, Comments.recipeTypeDiamondLegacy, Comments.defaultAssembly);
    public final ConfigBool LapisHaunting = b(true, "lapisHaunting", Comments.lapisHaunting, Comments.defaultTrue);
    public final ConfigBool NickelCrushing = b(true, "nickelCrushing", Comments.nickelCrushing, Comments.requiresCreatingSpace, Comments.defaultTrue);
    public final ConfigBool ZincCrushing = b(true, "zincCrushing", Comments.zincCrushing, Comments.defaultTrue);


    @Override
    public String getName() {
        return "gems";
    }
    private static class Comments {
        static String recipeTypeDiamond = "Which type of recipe to use for diamonds";
        static String recipeTypeNetherite = "Which type of recipe to use for netherite";
        static String coalCompact = "Whether the coal compacting recipe is active";
        static String copperCrushing = "Whether limestone can be crushed into copper nuggets";
        static String lapisHaunting = "Whether diamonds can be haunted into lapislazuli";
        static String nickelCrushing = "Whether scorchia can be crushed into nickel nuggets";
        static String zincCrushing = "Whether scoria can be crushed into zinc nuggets";
        
        static String requiresNorthstar = "§eRequires§e mod§e 'Create:§e Northstar'";
        static String requiresCreatingSpace = "§eRequires§e mod§e 'Creating§e Space'";
        static String requiresCopycats = "§eRequires§e mod§e 'Create:§e Copycats+'";
        static String requiresBackpacks = "§eRequires§e mod§e 'Sophisticated§e Backpack'";
        
        static String recipeTypeDiamondAssembly = "§9Assembly: §9Carefully §9crafted §9sequenced §9assembly §9with §9multiple §9steps §9turning §9coal §9into §9diamonds";
        static String recipeTypeDiamondLegacy = "§bLegacy: §bCompacting §bcoal §bwith §blava, §bsimilar §bto §bwhat §busers §bmight §bknow §bfrom §b'Create: §bUltimate §bFactory' §b& §bsimilar §bmods";
        static String recipeTypeNetheriteAssembly = "§9Assembly: §9Carefully §9crafted §9sequenced §9assembly §9with §9multiple §9steps §9turning §9diamonds §9into §9ancient §9debris";
        static String recipeTypeNetheriteLegacy = "§bLegacy: §bHaunting §bdiamond §bblocks §binto §ba §bchance §bof §bancient §bdebris";

        static String defaultTrue = "§2Default: True";
        static String defaultAssembly = "§2Default: Assembly";
    }

    public enum RecipeTypeSetting {
        NONE, ASSEMBLY, LEGACY
    }
}
