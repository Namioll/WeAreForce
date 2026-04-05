package me.namioll.weareforce.items;

import me.namioll.weareforce.Weareforce;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Weareforce.MODID);

    public static final Supplier<CreativeModeTab> WEAREFORCE_TAB = CREATIVE_MODE_TAB.register("we_are_force_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Weapon.KATANA.get()))
                    .title(Component.translatable("creativetab.weareforce.weareforce_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Weapon.KATANA);
                        output.accept(Weapon.W_BOW);
                        output.accept(WArmor.W_HELMET);
                        output.accept(WArmor.W_CHESTPLATE);
                        output.accept(WArmor.W_LEGGINGS);
                        output.accept(WArmor.W_BOOTS);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
