
package de.aircraft.ironleafsword.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;

import de.aircraft.ironleafsword.procedures.IronLeafSwordLivingEntityIsHitWithToolProcedure;

public class IronLeafScytheItem extends HoeItem {
	public IronLeafScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 200;
			}

			public float getSpeed() {
				return 6.141f;
			}

			public float getAttackDamageBonus() {
				return 5.141f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		IronLeafSwordLivingEntityIsHitWithToolProcedure.execute(entity, itemstack);
		return retval;
	}
}
