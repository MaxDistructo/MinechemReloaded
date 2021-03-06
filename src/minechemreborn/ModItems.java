package minechemreborn;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.registry.GameRegistry;
import minechemreborn.item.ItemChemical;
import minechemreborn.item.ModFood;
import minechemreborn.registry.Render;
import minechemreborn.item.EnumHandler;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

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
    public static ModFood methylene;
    public static ModFood permanganate;
    
    public static ModFood k_cyanite; //Wither 4, 40 sec. KCN
    public static ModFood psilocybin; //Night Vision 20 sec, Nausea V 10 sec. C12H17N2O4P
    public static ModFood ethyl_alcohol; // Nausea 30 sec
    public static ModFood aphetamine; // 4DMG, Nausea 5 40 sec, Speed 7 one min
    public static ModFood theobromine; //Speed 2 5 min

    //Haste 2, Jump 2, 1 hunger
    public static ModFood alinine;
    public static ModFood aspartic;
    public static ModFood glycine;
    public static ModFood serine;

    public static ModFood mescaline; //2 Damage,Nausea IV (1:00), Blindness IV (0:30)


    public static void init(){
        chemicals = new ItemChemical("chemical");
        cocaine = new ModFood("C17H21NO4", 0, 0.1f, false, new PotionEffect(MobEffects.SPEED, 60, 4), new PotionEffect(MobEffects.NAUSEA, 60, 1));
        meth = new ModFood("C10H15N", 0, 0.1f, false, new PotionEffect(MobEffects.INSTANTDAMAGE, 1, 1), new PotionEffect(MobEffects.NAUSEA,40,4), new PotionEffect(MobEffects.SPEED,60,6));
        water =  new ModFood("H2O", 1, 0.1f, false);
        k_cyanite = new ModFood("KCN",0,0.0f,false,new PotionEffect(MobEffects.WITHER,40,3));
        psilocybin = new ModFood("C12H17N2O4P",0,0.0f,false, new PotionEffect(MobEffects.NIGHTVISION,20,0), new PotionEffect(MobEffects.NAUSEA,10,4));
        ethyl_alcohol = new ModFood("C2H6O",0,0.0f,false,new PotionEffect(MobEffects.NAUSEA,30,0));
	aphetamine = new ModFood("C9H13N",0,0.0f,false,new PotionEffect(MobEffects.NAUSEA,40,4), new PotionEffect(MobEffects.SPEED,60,6));
	theobromine = new ModFood("C7H8N4O2",0,0.0f,false,new PotionEffect(MobEffects.SPEED,300,1));
	alinie = new ModFood("C3H7NO2",1,0.0f,false,new PotionEffect(MobEffects.HASTE,20,1), new PotionEffect(MobEffects.JUMPBOOST,20,1));
	aspartic = new ModFood("C4H7NO4",1,0.0f,false,new PotionEffect(MobEffects.HASTE,20,1), new PotionEffect(MobEffects.JUMPBOOST,20,1));
	glycine = new ModFood("C2H5NO2",1,0.0f,false,new PotionEffect(MobEffects.HASTE,20,1), new PotionEffect(MobEffects.JUMPBOOST,20,1));
	serine = new ModFood("C3H7NO3",1,0.0f,false,new PotionEffect(MobEffects.HASTE,20,1), new PotionEffect(MobEffects.JUMPBOOST,20,1));
    }
    public static void register(){
        GameRegistry.register(chemicals);
        GameRegistry.register(cocaine);
        GameRegistry.register(meth);
        GameRegistry.register(water);
        GameRegistry.register(k_cyanite);
        GameRegistry.register(psilocybin);
        GameRegistry.register(ethyl_alcohol);
    }
    public static void render(){
        for(int i = 0; i < EnumHandler.Chemicals.values().length; i++) {
			Render.registerRender(chemicals, i, "chemical_" + EnumHandler.Chemicals.values()[i].getName());
		}
		Render.registerRender(cocaine, 0, "C17H21NO4");
		Render.registerRender(meth,0,"C10H15N");
		Render.registerRender(water,0,"H2O");
		Render.registerRender(k_cyanite,0,"KCN");
		Render.registerRender(psilocybin,0,"C12H17N2O4P");
		Render.registerRender(ethyl_alcohol,0,"C2H6O");    }

    public static void crafting(){
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(water), new ItemStack(chemicals, 2, 1), new ItemStack(chemicals,1,8)));
    }
    public static void smelting(){
    }
    public static void oredict(){
        OreDictionary.registerOre("water",water);
        OreDictionary.registerOre("hydrogen", new ItemStack(chemicals,2,1));
        OreDictionary.registerOre("oxygen", new ItemStack(chemicals,1,8));

    }
    
    
   
}
