
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package de.aircraft.ironleafsword.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import de.aircraft.ironleafsword.potion.CutoftheleaveseffectMobEffect;
import de.aircraft.ironleafsword.IronLeafSwordMod;

public class IronLeafSwordModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, IronLeafSwordMod.MODID);
	public static final RegistryObject<MobEffect> CUTOFTHELEAVESEFFECT = REGISTRY.register("cutoftheleaveseffect",
			() -> new CutoftheleaveseffectMobEffect());
}
