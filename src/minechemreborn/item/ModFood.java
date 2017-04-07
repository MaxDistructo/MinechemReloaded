package minechemreborn.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ModFood extends ItemFood{
    private PotionEffect[] effects;
    public ModFood(String unlocalizedName, int hunger, float saturation, boolean wolfFood, PotionEffect... effects){
        super(hunger,saturation,wolfFood);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.effects = effects;
    }
    public ModFood(String unlocalizedName, int hunger, float saturation, boolean wolfFood){
        super(hunger,saturation,wolfFood);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
    }
@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		for (PotionEffect effect : effects) {
			player.addPotionEffect(new PotionEffect(effect));
		}
	}    
}