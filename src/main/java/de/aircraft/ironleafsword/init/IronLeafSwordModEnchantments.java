
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.aircraft.ironleafsword.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import de.aircraft.ironleafsword.enchantment.CutoftheleavesEnchantment;
import de.aircraft.ironleafsword.IronLeafSwordMod;

public class IronLeafSwordModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, IronLeafSwordMod.MODID);
	public static final RegistryObject<Enchantment> CUTOFTHELEAVES = REGISTRY.register("cutoftheleaves", () -> new CutoftheleavesEnchantment());
}
