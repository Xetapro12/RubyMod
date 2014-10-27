package com.Ruby.RubyMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RubyIngot extends Item{
	
	public RubyIngot(int id) {
		super();
		this.setCreativeTab(RubyMod.RubyTab);
		this.setMaxStackSize(64);
	}

	@SideOnly(Side.CLIENT)public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("RubyMod:Ruby");
	}
	
	
}
