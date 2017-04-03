package minechemreborn.chemicals;

import maxdistructo.core.create.ItemBase;
import maxdistructo.core.oredict.ItemOre;
import maxdistructo.core.oredict.ItemOreDict;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Chemicals {
    public static ItemOre chemicals;
    public static String chemicalsString[] = {"h","he","li","be","b","c","n","o","f","ne","na","mg"};
    private static int i;
    public static void init(){
        while(i = 1, i++, i <= 118){
            if(chemicalsString[i] != null){
            chemicals = register(new ItemOre("chemical" + chemicalsString[i], "chemical" + chemicalsString[i]));
        }
        else{
                System.out.println("Ended Adding Chemicals");
            }
        }
    }
    // Must add item declaration for ore dict support.
    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
            ((ItemBase)item).registerItemModel();
        }
        if (item instanceof ItemOreDict) {
            ((ItemOreDict)item).initOreDict();
        }

        return item;
    }
}
