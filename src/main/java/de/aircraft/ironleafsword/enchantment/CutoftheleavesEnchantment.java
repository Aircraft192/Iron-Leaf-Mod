
package de.aircraft.ironleafsword.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import de.aircraft.ironleafsword.init.IronLeafSwordModItems;

public class CutoftheleavesEnchantment extends Enchantment {
	public CutoftheleavesEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		if (ench == Enchantments.SHARPNESS)
			return true;
		if (ench == Enchantments.BINDING_CURSE)
			return true;
		if (ench == Enchantments.SMITE)
			return true;
		if (ench == Enchantments.BANE_OF_ARTHROPODS)
			return true;
		if (ench == Enchantments.KNOCKBACK)
			return true;
		if (ench == Enchantments.FIRE_ASPECT)
			return true;
		if (ench == Enchantments.MOB_LOOTING)
			return true;
		if (ench == Enchantments.SWEEPING_EDGE)
			return true;
		if (ench == Enchantments.UNBREAKING)
			return true;
		if (ench == Enchantments.MENDING)
			return true;
		if (ench == Enchantments.VANISHING_CURSE)
			return true;
		return false;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == IronLeafSwordModItems.IRON_LEAF_SWORD.get())
			return true;
		return false;
	}
}
