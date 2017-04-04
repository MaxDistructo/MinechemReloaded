package minechemreborn.chemicals;

import maxdistructo.core.create.ItemBase;
import maxdistructo.core.oredict.ItemOre;
import maxdistructo.core.oredict.ItemOreDict;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Chemicals {
    public static ItemOre chemicals;
    private static String chemicalsString[] = {"h","he","li","be","b","c","n","o","f","ne","na","mg","al","si","p","s","cl","ar","k","ca","sc","ti","v","cr","mn","fe","co","ni","cu","zn","ga","ge","as","se","br","kr","rb","sr","y","zr","nb","mo","tc","ru","rh","pd","ag","cd","in","sn","sb","te","i","xe","cs","ba","hf","ta","w","re","os","ir","pt","au","hg","ti","pb","bi","po","at","rn","fr","ra","la","ce","pr","nd","pm","sm","eu","gd","tb","dy","ho","er","tm","yb","lu","ac","th","pa","u","np","pu","am","cm","bk","cf","es","fm","md","no","lr"};
    private static int i;
    public static void init() {
        do {
            i = 1;
            if (chemicalsString[i] != null) {
                if (chemicalsString[i].equals("c")) {
                    chemicals = register(new ItemOre("carbon", "nuggetCoal"));
                } else if (chemicalsString[i].equals("al")) {
                    chemicals = register(new ItemOre("aluminum", "nuggetAluminum"));
                } else if (chemicalsString[i].equals("fe")) {
                    chemicals = register(new ItemOre("iron", "nuggetIron"));
                } else if (chemicalsString[i].equals("si")) {
                    chemicals = register(new ItemOre("silicon", "silicon"));
                } else if (chemicalsString[i].equals("co")) {
                    chemicals = register(new ItemOre("cobalt", "nuggetCobalt"));
                } else if (chemicalsString[i].equals("mg")) {
                    chemicals = register(new ItemOre("magnesium", "nuggetMagnesium"));
                } else if (chemicalsString[i].equals("ni")) {
                    chemicals = register(new ItemOre("nickel", "nuggetNickel"));
                } else if (chemicalsString[i].equals("cu")) {
                    chemicals = register(new ItemOre("copper", "nuggetCopper"));
                } else if (chemicalsString[i].equals("ti")) {
                    chemicals = register(new ItemOre("titanium", "nuggetTitanium"));
                } else if (chemicalsString[i].equals("ag")) {
                    chemicals = register(new ItemOre("silver", "nuggetSilver"));
                } else if (chemicalsString[i].equals("sn")) {
                    chemicals = register(new ItemOre("tin", "nuggetTin"));
                } else if (chemicalsString[i].equals("w")) {
                    chemicals = register(new ItemOre("tungsten", "nuggetTungsten"));
                } else if (chemicalsString[i].equals("os")) {
                    chemicals = register(new ItemOre("osmium", "nuggetOsmium"));
                } else if (chemicalsString[i].equals("ir")) {
                    chemicals = register(new ItemOre("iridium", "nuggetIridium"));
                } else if (chemicalsString[i].equals("pt")) {
                    chemicals = register(new ItemOre("platinum", "nuggetPlatinum"));
                } else if (chemicalsString[i].equals("au")) {
                    chemicals = register(new ItemOre("gold", "nuggetGold"));
                } else if (chemicalsString[i].equals("pb")) {
                    chemicals = register(new ItemOre("lead", "nuggetLead"));
                } else if (chemicalsString[i].equals("u")) {
                    chemicals = register(new ItemOre("uranium", "nuggetUranium"));
                } else {
                    chemicals = register(new ItemOre("chemical" + chemicalsString[i], "chemical" + chemicalsString[i]));
                }
            } else {
                System.out.println("Ended Adding Chemicals");
            }
            i++;

        }
        while (i <= 118);
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
