package minechemreborn.proxy;

import minechemreborn.ModBlocks;
import minechemreborn.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {
    }
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {


    }
    public void init(FMLInitializationEvent event){

    }
    public void postInit(FMLPostInitializationEvent event){
        ModBlocks.init();
        ModItems.init();
        ModItems.register();
        ModItems.render();
        ModItems.oredict();
        ModItems.crafting();
    }
}
