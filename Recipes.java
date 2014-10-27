package com.Ruby.RubyMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void MainClass() {
		addCraftingRecipes();
		//addSmeltingRecipes();
	}
		
	private static void addCraftingRecipes() {
		
		GameRegistry.addRecipe(new ItemStack(RubyMod.RubyPickaxe), "iii", " s ", " s ", 'i', RubyMod.RubyIngot, 's', Items.stick);
		
		
		GameRegistry.addRecipe(new ItemStack(RubyMod.RubySword), " i ", " i ", " s ", 'i', RubyMod.RubyIngot, 's', Items.stick);
		
		
		GameRegistry.addRecipe(new ItemStack(Blocks.grass, 9),
				new Object[] { "XXX", "XXX", "XXX", 'X', Blocks.dirt });
		}
		
		
	}
	

