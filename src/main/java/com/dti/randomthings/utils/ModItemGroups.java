package com.dti.randomthings.utils;

import com.dti.randomthings.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;

public class ModItemGroups {
    public static ItemGroup createGroup(String id, RegistryObject<Item> icon){
        return new ItemGroup(id) {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(icon.get());
            }
        };
    }
    public static ItemGroup MOD_MAIN_TAB = createGroup("mod_main_tab", ModItems.WARP_CRYSTAL);
}
