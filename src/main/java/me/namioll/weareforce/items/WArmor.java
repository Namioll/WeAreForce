package me.namioll.weareforce.items;

import me.namioll.weareforce.Weareforce;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WArmor {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Weareforce.MODID);

    public static final DeferredItem<ArmorItem> W_HELMET = ITEMS.register("w_helmet",
            () -> new WArmorItem(WArmorMaterials.W_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(37))));
    public static final DeferredItem<ArmorItem> W_CHESTPLATE = ITEMS.register("w_chestplate",
            () -> new WArmorItem(WArmorMaterials.W_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(37))));
    public static final DeferredItem<ArmorItem> W_LEGGINGS = ITEMS.register("w_leggings",
            () -> new WArmorItem(WArmorMaterials.W_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(37))));
    public static final DeferredItem<ArmorItem> W_BOOTS = ITEMS.register("w_boots",
            () -> new WArmorItem(WArmorMaterials.W_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(37))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
