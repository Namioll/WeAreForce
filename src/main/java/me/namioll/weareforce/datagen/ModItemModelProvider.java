package me.namioll.weareforce.datagen;

import me.namioll.weareforce.Weareforce;
import me.namioll.weareforce.items.Weapon;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Weareforce.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(Weapon.KATANA.getId());
    }
}
