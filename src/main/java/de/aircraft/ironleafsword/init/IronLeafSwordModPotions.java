
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.aircraft.ironleafsword.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import de.aircraft.ironleafsword.IronLeafSwordMod;

public class IronLeafSwordModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, IronLeafSwordMod.MODID);
	public static final RegistryObject<Potion> WINE = REGISTRY.register("wine",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.CONFUSION, 3600, 2, false, true),
					new MobEffectInstance(MobEffects.WEAKNESS, 3600, 2, false, true), new MobEffectInstance(MobEffects.HUNGER, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.LUCK, 3600, 0, false, true), new MobEffectInstance(MobEffects.UNLUCK, 3600, 0, false, true)));
}
