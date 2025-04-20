
package net.exesmp.exesmpdatapack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LuminitKulcesiItem extends Item {
	public LuminitKulcesiItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(64));
	}
}
