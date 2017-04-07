package minechemreborn.registry;

import minechemreborn.Main;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class Render {
    public static void registerRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Main.MODID + "/" + fileName));

	}
}
