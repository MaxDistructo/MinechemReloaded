package minechemreborn;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import minechemreborn.item.ItemChemical;
import minechemreborn.registry.Render;
import minechemreborn.item.EnumHandler;

public class ModItems {
    public static Item chemicals;
    public static void init(){
        chemicals = new ItemChemical("chemical");
        
    }
    public static void register(){
        GameRegistry.register(chemicals);
    }
    public static void render(){
        for(int i = 0; i < EnumHandler.Chemicals.values().length; i++) {
			Render.registerRender(chemicals, i, "chemical_" + EnumHandler.Chemicals.values()[i].getName());
		}
    }
    
    
   
}
