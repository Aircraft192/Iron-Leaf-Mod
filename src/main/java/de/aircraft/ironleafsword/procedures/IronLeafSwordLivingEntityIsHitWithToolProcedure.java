package de.aircraft.ironleafsword.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import de.aircraft.ironleafsword.init.IronLeafSwordModMobEffects;
import de.aircraft.ironleafsword.init.IronLeafSwordModEnchantments;

public class IronLeafSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(IronLeafSwordModEnchantments.CUTOFTHELEAVES.get(), itemstack) != 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(IronLeafSwordModMobEffects.CUTOFTHELEAVESEFFECT.get(), 20,
						EnchantmentHelper.getItemEnchantmentLevel(IronLeafSwordModEnchantments.CUTOFTHELEAVES.get(), itemstack), (false), (true)));
		}
	}
}
