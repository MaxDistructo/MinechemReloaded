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
    do{
        if(Chemicals.chemicalsString[i] != null){
            compound = register((ItemOreDict)new ItemOreDict (Chemicals.chemicalsString[i] + "2"));
        }
        else{
            i = 100;
        }
        
    }
    while(i < 100);
    
}
}
