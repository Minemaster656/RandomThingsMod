package com.dti.randomthings.item;

import com.dti.randomthings.RandomThings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RandomThings.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
    public static final RegistryObject<Item> WARP_CRYSTAL = ITEMS.register("warp_crystal",
            ()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

}
