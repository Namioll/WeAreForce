/*package me.namioll.weareforce.mobs;

import me.namioll.weareforce.Weareforce;
import me.namioll.weareforce.mobs.custom.WShrek;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class WMob {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Weareforce.MODID);

    public static final Supplier<EntityType<WShrek>> SHREK =
            ENTITY_TYPES.register("shrek", () -> EntityType.Builder.of(WShrek::new, MobCategory.MONSTER)
                    .sized(1.5f, 3f).build("shrek"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
*/