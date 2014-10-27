package com.Ruby.RubyMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RubyMod.MODID, version = RubyMod.VERSION)
public class RubyMod
{
    public static final String MODID = "Ruby Mod";
    public static final String VERSION = "1.7.2";
    
    public static ToolMaterial enumToolMaterialRuby = EnumHelper.addToolMaterial("RUBY", 5, 10000000, 0.1F, 40.0F, 1000000);
    public static ArmorMaterial enumArmorMaterialRuby = EnumHelper.addArmorMaterial("RUBY", 1000000, new int[]{5, 10, 8, 3}, 1000000);
    
    @Metadata
    public static ModMetadata meta;
    
    public static Block RubyOre;
    
    int RubyOreID = 500;
    
    public static Item RubyIngot;
    
    int RubyIngotID = 501;
    
    public static Item RubySword;
    
    int RubySwordID = 502;
    
    public static Item RubyPickaxe;
    
    int RubyPickaxeID = 503;
    
    public static Item RubyShovel;
    
    int RubyShovelID = 504;
    
    public static Item RubyAxe;
    
    int RubyAxeID = 505;
    
    public static Item RubyHoe;
    
    int RubyHoeID = 506;
    
    public static Item HelmetRuby;
    
    int HelmetRubyID = 507;
    
    public static Item ChestplateRuby;
    
    int ChestplateRubyID = 508;
    
    public static Item LegsRuby;
    
    int LegsRubyID = 509;
    
    public static Item BootsRuby;
    
    int BootsRubyID = 510;
    
    public static CreativeTabs RubyTab = new CreativeTabs("Ruby"){
    	public Item getTabIconItem(){
    		return RubyIngot;
    	}
    };
    
    
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    
    	RubyIngot = new RubyIngot(RubyIngotID).setUnlocalizedName("Ruby Ingot");
    	RubyOre = new RubyOre(RubyOreID, Material.rock).setHardness(5.5F).setBlockName("Ruby Ore");	
    	
    	Smelting.register();
    	WorldGenRuby.register();
    	
    	
    	RenderingRegistry.addNewArmourRendererPrefix("5");

    	RubySword = new RubySword(RubySwordID, enumToolMaterialRuby).setUnlocalizedName("Ruby Sword").setCreativeTab(RubyTab);
    	RubyShovel = new RubyShovel(RubyShovelID, enumToolMaterialRuby).setUnlocalizedName("Ruby Shovel").setCreativeTab(RubyTab);
    	RubyAxe = new RubyAxe(RubyAxeID, enumToolMaterialRuby).setUnlocalizedName("Ruby Axe").setCreativeTab(RubyTab);;
    	RubyPickaxe = new RubyPickaxe(RubyPickaxeID, enumToolMaterialRuby).setUnlocalizedName("Ruby Pickaxe").setCreativeTab(RubyTab);
    	RubyHoe= new RubyHoe(RubyHoeID, enumToolMaterialRuby).setUnlocalizedName("Ruby Hoe").setCreativeTab(RubyTab);
    	HelmetRuby = new RubyArmor(RubyMod.enumArmorMaterialRuby, 5, 0).setUnlocalizedName("Ruby Helmet").setCreativeTab(RubyTab);
    	ChestplateRuby = new RubyArmor(RubyMod.enumArmorMaterialRuby, 5, 1).setUnlocalizedName("Ruby Chestplate").setCreativeTab(RubyTab);
    	LegsRuby = new RubyArmor(RubyMod.enumArmorMaterialRuby, 5, 2).setUnlocalizedName("Ruby Legs").setCreativeTab(RubyTab);
    	BootsRuby = new RubyArmor(RubyMod.enumArmorMaterialRuby, 5, 3).setUnlocalizedName("Ruby Boots").setCreativeTab(RubyTab);
    	
    	GameRegistry.registerBlock(RubyOre, "RubyOre");
    	GameRegistry.registerItem(RubyIngot, "RubyIngot");
    	GameRegistry.registerItem(RubySword, "RubySword");
    	GameRegistry.registerItem(RubyPickaxe, "RubyPickaxe");
    	GameRegistry.registerItem(RubyShovel, "RubyShovel");
    	GameRegistry.registerItem(RubyAxe, "RubyAxe");
    	GameRegistry.registerItem(RubyHoe, "Rubyhoe");
    	GameRegistry.registerItem(HelmetRuby, "HelmetRuby");
    	GameRegistry.registerItem(ChestplateRuby, "ChestplateRuby");
    	GameRegistry.registerItem(LegsRuby, "LegsRuby");
    	GameRegistry.registerItem(BootsRuby, "BootsRuby");
    }
}
