package com.Ruby.RubyMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Smelting {
	
	public static void register() {
		GameRegistry.addSmelting(new ItemStack(Items.rotten_flesh), new ItemStack(
				Items.leather, 1), 500000F);
	}

}
