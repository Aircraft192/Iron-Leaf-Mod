
package de.aircraft.ironleafsword.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import de.aircraft.ironleafsword.procedures.CutoftheleaveseffectOnEffectActiveTickProcedure;

public class CutoftheleaveseffectMobEffect extends MobEffect {
	public CutoftheleaveseffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -11759612);
	}

	@Override
	public String getDescriptionId() {
		return "effect.iron_leaf_sword.cutoftheleaveseffect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CutoftheleaveseffectOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
