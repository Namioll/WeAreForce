package me.namioll.weareforce.items;

import me.namioll.weareforce.Weareforce;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Weapon {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Weareforce.MODID);

    public static final DeferredItem<SwordItem> KATANA = ITEMS.register("katana",
            () -> new SwordItem(WTiers.WXRU, new Item.Properties()
                    .fireResistant()
                    .attributes(SwordItem.createAttributes(WTiers.WXRU, 10, -2.4F))));

    public static final DeferredItem<BowItem> W_BOW = ITEMS.register("w_bow",
            () -> new BowItem(new Item.Properties().durability(450).fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
