package minechemreborn.proxy;

import minechemreborn.ModBlocks;
import minechemreborn.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {
    }
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    ModBlocks.init();
    ModItems.init();
    }
}
