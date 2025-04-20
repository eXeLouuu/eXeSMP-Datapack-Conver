
package net.exesmp.exesmpdatapack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LuminitParcasiItem extends Item {
	public LuminitParcasiItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
