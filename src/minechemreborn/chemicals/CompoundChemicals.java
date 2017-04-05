package minechemreborn.chemicals;

import minechemreborn.chemicals.Chemicals;
import net.shadowfacts.shadowmc.item.ItemOreDict;
import net.shadowfacts.shadowmc.item.ModItems;

public class CompoundChemicals extends ModItems{
    public static String compounds[] = {"h2o","c10h15n","c17h21no4","no4"};
    static ItemOreDict compound;
    private static int i;
public void init(){
    i = 1;
    do{ //Register Compouned Chemicals. AKA Carbon 2-10 are created here. Will eventually be converted to a metadata setup.
        if(Chemicals.chemicalsString[i] != null){
            compound = register((ItemOreDict)new ItemOreDict (Chemicals.chemicalsString[i] + "2"));
            compound = register((ItemOreDict)new ItemOreDict (Chemicals.chemicalsString[i] + "3"));
            compound = register((ItemOreDict)new ItemOreDict (Chemicals.chemicalsString[i] + "4"));
            compound = register((ItemOreDict)new ItemOreDict (Chemicals.chemicalsString[i] + "5"));
            compound = register((ItemOreDict)new ItemOreDict (Chemicals.chemicalsString[i] + "6"));
            compound = register((ItemOreDict)new ItemOreDict (Chemicals.chemicalsString[i] + "7"));
            compound = register((ItemOreDict)new ItemOreDict (Chemicals.chemicalsString[i] + "8"));
            compound = register((ItemOreDict)new ItemOreDict (Chemicals.chemicalsString[i] + "9"));
            compound = register((ItemOreDict)new ItemOreDict (Chemicals.chemicalsString[i] + "10"));
        }
        else{
            i = 100;
            System.out.println("Finished Creating Stacked Chemicals");
        }
        if(compounds[i] != null){
            compound = register((ItemOreDict)new ItemOreDict (compounds[i]));
        }
        else{
            System.out.println("[minechemreborn] Finished Creating Chemical Compounds");
        }
        
    }
    while(i < 100);
    
}
}
