package me.namioll.weareforce.items;

import me.namioll.weareforce.util.WTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class WTiers {
    public static final Tier WXRU= new SimpleTier(WTags.Blocks.INCORRECT_FOR_WXRU_TOOL,
            1750, 10f, 5f, 16, () -> Ingredient.of(Items.NETHERITE_INGOT));
}
