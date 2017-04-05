package minechemreborn.chemicals;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.shadowfacts.shadowmc.item.ItemOreDict;
import net.shadowfacts.shadowmc.item.ModItems;

public class Chemicals {
    static ItemOreDict chemicals;
    public static String chemicalsString[] = {"h","he","li","be","b","c","n","o","f","ne","na","mg","al","si","p","s","cl","ar","k","ca","sc","ti","v","cr","mn","fe","co","ni","cu","zn","ga","ge","as","se","br","kr","rb","sr","y","zr","nb","mo","tc","ru","rh","pd","ag","cd","in","sn","sb","te","i","xe","cs","ba","hf","ta","w","re","os","ir","pt","au","hg","ti","pb","bi","po","at","rn","fr","ra","la","ce","pr","nd","pm","sm","eu","gd","tb","dy","ho","er","tm","yb","lu","ac","th","pa","u","np","pu","am","cm","bk","cf","es","fm","md","no","lr"};
    private static int i;
    public static void init() {
         i = 1;
        do {
           
            if (chemicalsString[i] != null) {
                if (chemicalsString[i].equals("c")) {
                    chemicals = register((ItemOreDict)new ItemOreDict ("carbon"));
                } else if (chemicalsString[i].equals("al")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("aluminum", "nuggetAluminum"));
                } else if (chemicalsString[i].equals("fe")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("iron", "nuggetIron"));
                } else if (chemicalsString[i].equals("si")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("silicon", "silicon"));
                } else if (chemicalsString[i].equals("co")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("cobalt", "nuggetCobalt"));
                } else if (chemicalsString[i].equals("mg")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("magnesium", "nuggetMagnesium"));
                } else if (chemicalsString[i].equals("ni")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("nickel", "nuggetNickel"));
                } else if (chemicalsString[i].equals("cu")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("copper", "nuggetCopper"));
                } else if (chemicalsString[i].equals("ti")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("titanium", "nuggetTitanium"));
                } else if (chemicalsString[i].equals("ag")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("silver", "nuggetSilver"));
                } else if (chemicalsString[i].equals("sn")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("tin", "nuggetTin"));
                } else if (chemicalsString[i].equals("w")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("tungsten", "nuggetTungsten"));
                } else if (chemicalsString[i].equals("os")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("osmium", "nuggetOsmium"));
                } else if (chemicalsString[i].equals("ir")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("iridium", "nuggetIridium"));
                } else if (chemicalsString[i].equals("pt")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("platinum", "nuggetPlatinum"));
                } else if (chemicalsString[i].equals("au")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("gold", "nuggetGold"));
                } else if (chemicalsString[i].equals("pb")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("lead", "nuggetLead"));
                } else if (chemicalsString[i].equals("u")) {
                    chemicals = register((ItemOreDict)new ItemOreDict("uranium", "nuggetUranium"));
                } else {
                    chemicals = register((ItemOreDict)new ItemOreDict("chemical" + chemicalsString[i], "chemical" + chemicalsString[i]));
                }
            } else {
                System.out.println("Ended Adding Chemicals");
            }
            i++;

        }
        while (i <= 118);
    }
}


