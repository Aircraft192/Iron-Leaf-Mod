
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.aircraft.ironleafsword.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import de.aircraft.ironleafsword.item.IronLeafSwordItem;
import de.aircraft.ironleafsword.item.IronLeafShovelItem;
import de.aircraft.ironleafsword.item.IronLeafScytheItem;
import de.aircraft.ironleafsword.item.IronLeafPickaxeItem;
import de.aircraft.ironleafsword.item.IronLeafHoeItem;
import de.aircraft.ironleafsword.item.IronLeafAxeItem;
import de.aircraft.ironleafsword.IronLeafSwordMod;

public class IronLeafSwordModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IronLeafSwordMod.MODID);
	public static final RegistryObject<Item> IRON_LEAF_SWORD = REGISTRY.register("iron_leaf_sword", () -> new IronLeafSwordItem());
	public static final RegistryObject<Item> IRON_LEAF_PICKAXE = REGISTRY.register("iron_leaf_pickaxe", () -> new IronLeafPickaxeItem());
	public static final RegistryObject<Item> IRON_LEAF_AXE = REGISTRY.register("iron_leaf_axe", () -> new IronLeafAxeItem());
	public static final RegistryObject<Item> IRON_LEAF_SHOVEL = REGISTRY.register("iron_leaf_shovel", () -> new IronLeafShovelItem());
	public static final RegistryObject<Item> IRON_LEAF_HOE = REGISTRY.register("iron_leaf_hoe", () -> new IronLeafHoeItem());
	public static final RegistryObject<Item> IRON_LEAF_SCYTHE = REGISTRY.register("iron_leaf_scythe", () -> new IronLeafScytheItem());
}
