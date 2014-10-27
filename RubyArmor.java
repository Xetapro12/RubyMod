package com.Ruby.RubyMod;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;

public class RubyArmor extends ItemArmor{
private String [] armourTypes = new String [] {"HelmetRuby", "ChestplateRuby", "LegsRuby", "BootsRuby"};

public RubyArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
super(armorMaterial, renderIndex, armourType);
}

@Override
public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
if(stack.getItem().equals(RubyMod.HelmetRuby)|| stack.getItem().equals(RubyMod.ChestplateRuby)|| stack.getItem().equals(RubyMod.BootsRuby)){
return "RubyMod:textures/armor/Ruby_1.png";
}
if(stack.getItem().equals(RubyMod.LegsRuby)){
return "RubyMod:textures/armor/Ruby_2.png";
}

else return null;

}
 @Override
public void registerIcons(IIconRegister reg){
	 if(this == RubyMod.HelmetRuby)
		 this.itemIcon = reg.registerIcon("RubyMod:HelmetRuby");
	 if(this == RubyMod.ChestplateRuby)
		 this.itemIcon = reg.registerIcon("RubyMod:ChestplateRuby");
	 if(this == RubyMod.LegsRuby)
		 this.itemIcon = reg.registerIcon("RubyMod:LegsRuby");
	 if(this == RubyMod.BootsRuby)
		 this.itemIcon = reg.registerIcon("RubyMod:BootsRuby");
 }

}