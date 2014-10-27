package com.Ruby.RubyMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class RubyAxe extends ItemAxe {

	public RubyAxe(int id, Item.ToolMaterial mat){
		super(mat);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("RubyMod:RubyAxe");
	}
	
}
