package com.Ruby.RubyMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class RubySword extends ItemSword{

	public RubySword(int id, Item.ToolMaterial mat){
		super(mat);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("RubyMod:RubySword");
	}
	
}
