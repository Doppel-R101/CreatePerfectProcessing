package dev.kalwantspizza.perfectprocessing;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class AllTags {
    public static class ItemTags {
        public static final TagKey<Item> COPYCAT_SCRAP_LARGE = createTag("copycat_scrap_large");
        public static final TagKey<Item> COPYCAT_SCRAP_MEDIUM = createTag("copycat_scrap_large");
        public static final TagKey<Item> COPYCAT_SCRAP_NORMAL = createTag("copycat_scrap_large");
        public static final TagKey<Item> COPYCAT_SCRAP_SMALL = createTag("copycat_scrap_large");
        public static final TagKey<Item> COPYCAT_SCRAP_MINI = createTag("copycat_scrap_large");
        public static final TagKey<Item> COPYCAT_SCRAP_TINY = createTag("copycat_scrap_large");
        public static final TagKey<Item> COPYCAT_SCRAP_COGWHEELS = createTag("copycat_scrap_cogwheels");
        public static final TagKey<Item> COPYCAT_SCRAP_PIPE = createTag("copycat_scrap_pipe");
        public static final TagKey<Item> COPYCAT_SCRAP_IRON_DOOR = createTag("copycat_scrap_iron_door");

        public static final TagKey<Item> SOPHISTICATED_NORMAL_UPGRADES = createTag("sophisticated_normal_upgrades");
        public static final TagKey<Item> SOPHISTICATED_ADVANCED_UPGRADES = createTag("sophisticated_advanced_upgrades");
        public static final TagKey<Item> SOPHISTICATED_SPECIAL_UPGRADES = createTag("sophisticated_special_upgrades");
        public static final TagKey<Item> SOPHISTICATED_BACKPACKS = createTag("sophisticated_backpacks");
        public static final TagKey<Item> SOPHISTICATED_BACKPACKS_VALUE = createTag("sophisticated_backpacks_value");

    }

    private static TagKey<Item> createTag(String name) {
        return net.minecraft.tags.ItemTags.create(perfectprocessing.rl(name));
    }
}
