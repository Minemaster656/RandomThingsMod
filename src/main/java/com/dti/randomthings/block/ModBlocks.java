package com.dti.randomthings.block;

import com.dti.randomthings.RandomThings;
import com.dti.randomthings.item.ModItems;
import com.dti.randomthings.utils.ModItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.block.AbstractBlock.Properties.*;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomThings.MOD_ID);


    public static final RegistryObject<Block> WARP_CRYSTAL_ORE = registerBlock("warp_crystal_ore",
            () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(4) )
            );
    //TODO: руда драконьих €иц


    private static <T extends  Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn);


        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
        new Item.Properties().tab(ModItemGroups.MOD_MAIN_TAB)

                ));
    }




    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
