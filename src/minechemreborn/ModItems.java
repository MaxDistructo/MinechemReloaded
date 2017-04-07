package minechemreborn;

import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.registry.GameRegistry;
import minechemreborn.item.ItemChemical;
import minechemreborn.item.ModFood;
import minechemreborn.registry.Render;
import minechemreborn.item.EnumHandler;

public class ModItems { //Effects of Minechem Chemicals http://minechem2.wikia.com/wiki/Molecules
    public static Item chemicals;
    public static ModFood cocaine;
    public static ModFood meth;
    public static ModFood water;
    // 5 Damage A Piece Chemicals;
    public static ModFood peroxide;
    public static ModFood potasium_oxide;
    public static ModFood dioxide;
    public static ModFood pyrite;
    public static ModFood hydronium;
    
    public static ModFood k_cyanite; //Wither 4, 40 sec. KCN
    public static ModFood psilocybin; //Night Vision 20 sec, Nausea V 10 sec. C12H17N2O4P
    public static void init(){
        chemicals = new ItemChemical("chemical");
        cocaine = new ModFood("C17H21NO4", 1, 0.1f, false, new PotionEffect(Potion.getPotionById(1), 60, 4), new PotionEffect(Potion.getPotionById(9), 60, 1));
        meth = new ModFood("C10H15N", 1, 0.1f, false, new PotionEffect(Potion.getPotionById(7), 1, 1), new PotionEffect(Potion.getPotionById(9),40,4), new PotionEffect(Potion.getPotionById(1),60,6));
        water =  new ModFood("H2O", 1, 0.1f, false);
        
        
        
    }
    public static void register(){
        GameRegistry.register(chemicals);
        GameRegistry.register(cocaine);
        GameRegistry.register(meth);
    }
    public static void render(){
        for(int i = 0; i < EnumHandler.Chemicals.values().length; i++) {
			Render.registerRender(chemicals, i, "chemical_" + EnumHandler.Chemicals.values()[i].getName());
		}
		Render.registerRender(cocaine, 0, "C17H21NO4");
		Render.registerRender(meth,0,"C10H15N");
    }
    
    
   
}
