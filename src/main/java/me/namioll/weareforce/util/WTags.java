package me.namioll.weareforce.util;

import me.namioll.weareforce.Weareforce;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;



public class WTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_WXRU_TOOL = createTag("needs_wxru_tool");
        public static final TagKey<Block> INCORRECT_FOR_WXRU_TOOL = createTag("incorrect_for_wxru_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Weareforce.MODID, name));
        }
    }
}
