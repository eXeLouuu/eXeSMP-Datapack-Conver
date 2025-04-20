
package net.exesmp.exesmpdatapack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AethriumKulcesiItem extends Item {
	public AethriumKulcesiItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(16).fireResistant());
	}
}
