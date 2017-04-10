package minechemreborn.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemChemical extends Item{
    private String name;
    public ItemChemical(String name){
        this.name = name;
        this.setRegistryName(name);
        this.setHasSubtypes(true);
        this.setUnlocalizedName(name);

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
