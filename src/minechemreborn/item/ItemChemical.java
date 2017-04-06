package minechemreborn.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.shadowfacts.shadowmc.item.OreDictItem;

import java.util.List;

class ItemChemical extends Item implements OreDictItem {
    private final String oreDict;

    public ItemChemical(String name, String oredict){
        this.oreDict = oredict;
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHasSubtypes(true);
    }
    public ItemChemical(String name){
        this.oreDict = name;
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHasSubtypes(true);
    }
    public void registerOreDict(){
        OreDictionary.registerOre(this.oreDict, this);
    }
    @Override
    public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> subItems){
        for(int i = 0; i < EnumHandler.Chemicals.values().length; i++){
            subItems.add(new ItemStack(item,1, i));
        }

    }
    @Override
    public String getUnlocalizedName(ItemStack stack){
        for(int i = 0; i < EnumHandler.Chemicals.values().length; i++){
            if(stack.getItemDamage() == i){
                return this.getUnlocalizedName() + "." + EnumHandler.Chemicals.values()[i].getName();
            }
            else{
            }
        }
        return this.getUnlocalizedName();
    }

}
