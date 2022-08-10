
package de.aircraft.ironleafsword.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

public class IronLeafHoeItem extends HoeItem {
	public IronLeafHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 200;
			}

			public float getSpeed() {
				return 6.141f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OAK_LEAVES));
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
