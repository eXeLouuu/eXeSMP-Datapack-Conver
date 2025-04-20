
package net.exesmp.exesmpdatapack.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class VulcanitKulcesiItem extends Item {
	public VulcanitKulcesiItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(64));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
