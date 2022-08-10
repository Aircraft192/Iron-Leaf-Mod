package de.aircraft.ironleafsword.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import de.aircraft.ironleafsword.init.IronLeafSwordModMobEffects;

public class CutoftheleaveseffectOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource("cut_of_the_leaves").bypassArmor(),
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(IronLeafSwordModMobEffects.CUTOFTHELEAVESEFFECT.get())
							? _livEnt.getEffect(IronLeafSwordModMobEffects.CUTOFTHELEAVESEFFECT.get()).getAmplifier()
							: 0);
	}
}
