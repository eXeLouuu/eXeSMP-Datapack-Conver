
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.exesmp.exesmpdatapack.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.exesmp.exesmpdatapack.item.VulcanitParcasiItem;
import net.exesmp.exesmpdatapack.item.VulcanitKulcesiItem;
import net.exesmp.exesmpdatapack.item.NyxiumParcasiItem;
import net.exesmp.exesmpdatapack.item.NyxiumKulcesiItem;
import net.exesmp.exesmpdatapack.item.MistralitParcasiItem;
import net.exesmp.exesmpdatapack.item.MistralitKulcesiItem;
import net.exesmp.exesmpdatapack.item.LuminitParcasiItem;
import net.exesmp.exesmpdatapack.item.LuminitKulcesiItem;
import net.exesmp.exesmpdatapack.item.AlazParcasiItem;
import net.exesmp.exesmpdatapack.item.AlazKulcesiItem;
import net.exesmp.exesmpdatapack.item.AethriumKulcesiItem;
import net.exesmp.exesmpdatapack.ExesmpdatapackMod;

import java.util.function.Function;

public class ExesmpdatapackModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ExesmpdatapackMod.MODID);
	public static final DeferredItem<Item> ALAZ_MADENI = block(ExesmpdatapackModBlocks.ALAZ_MADENI);
	public static final DeferredItem<Item> ALAZ_PARCASI = register("alaz_parcasi", AlazParcasiItem::new);
	public static final DeferredItem<Item> ALAZ_KULCESI = register("alaz_kulcesi", AlazKulcesiItem::new);
	public static final DeferredItem<Item> MISTRALIT_MADENI = block(ExesmpdatapackModBlocks.MISTRALIT_MADENI);
	public static final DeferredItem<Item> MISTRALIT_PARCASI = register("mistralit_parcasi", MistralitParcasiItem::new);
	public static final DeferredItem<Item> MISTRALIT_KULCESI = register("mistralit_kulcesi", MistralitKulcesiItem::new);
	public static final DeferredItem<Item> VULCANIT_MADENI = block(ExesmpdatapackModBlocks.VULCANIT_MADENI);
	public static final DeferredItem<Item> VULCANIT_PARCASI = register("vulcanit_parcasi", VulcanitParcasiItem::new);
	public static final DeferredItem<Item> VULCANIT_KULCESI = register("vulcanit_kulcesi", VulcanitKulcesiItem::new);
	public static final DeferredItem<Item> NYXIUM_MADENI = block(ExesmpdatapackModBlocks.NYXIUM_MADENI);
	public static final DeferredItem<Item> NYXIUM_PARCASI = register("nyxium_parcasi", NyxiumParcasiItem::new);
	public static final DeferredItem<Item> NYXIUM_KULCESI = register("nyxium_kulcesi", NyxiumKulcesiItem::new);
	public static final DeferredItem<Item> LUMINIT_MADENI = block(ExesmpdatapackModBlocks.LUMINIT_MADENI);
	public static final DeferredItem<Item> LUMINIT_PARCASI = register("luminit_parcasi", LuminitParcasiItem::new);
	public static final DeferredItem<Item> LUMINIT_KULCESI = register("luminit_kulcesi", LuminitKulcesiItem::new);
	public static final DeferredItem<Item> AETHRIUM_KULCESI = register("aethrium_kulcesi", AethriumKulcesiItem::new);
	public static final DeferredItem<Item> AETHRIUM_KILIC = register("aethrium_kilic", AethriumKilicItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
