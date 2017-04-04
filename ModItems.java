package minechemreborn;

import maxdistructo.core.create.ItemBase;
import maxdistructo.core.oredict.ItemOreDict;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import minechemreborn.chemicals.Chemicals;

public class ModItems {
    public static void init(){
        Chemicals.init();
    }
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
