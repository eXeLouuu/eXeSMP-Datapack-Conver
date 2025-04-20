
package net.exesmp.exesmpdatapack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NyxiumKulcesiItem extends Item {
	public NyxiumKulcesiItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(64));
	}
}
