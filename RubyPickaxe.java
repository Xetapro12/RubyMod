package com.Ruby.RubyMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class RubyPickaxe extends ItemPickaxe {

	public RubyPickaxe(int id, Item.ToolMaterial mat){
		super(mat);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("RubyMod:RubyPickaxe");
	}
	
}
