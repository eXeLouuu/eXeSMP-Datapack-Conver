
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.exesmp.exesmpdatapack.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.exesmp.exesmpdatapack.block.VulcanitMadeniBlock;
import net.exesmp.exesmpdatapack.block.NyxiumMadeniBlock;
import net.exesmp.exesmpdatapack.block.MistralitMadeniBlock;
import net.exesmp.exesmpdatapack.block.LuminitMadeniBlock;
import net.exesmp.exesmpdatapack.block.AlazMadeniBlock;
import net.exesmp.exesmpdatapack.ExesmpdatapackMod;

import java.util.function.Function;

public class ExesmpdatapackModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ExesmpdatapackMod.MODID);
	public static final DeferredBlock<Block> ALAZ_MADENI = register("alaz_madeni", AlazMadeniBlock::new);
	public static final DeferredBlock<Block> MISTRALIT_MADENI = register("mistralit_madeni", MistralitMadeniBlock::new);
	public static final DeferredBlock<Block> VULCANIT_MADENI = register("vulcanit_madeni", VulcanitMadeniBlock::new);
	public static final DeferredBlock<Block> NYXIUM_MADENI = register("nyxium_madeni", NyxiumMadeniBlock::new);
	public static final DeferredBlock<Block> LUMINIT_MADENI = register("luminit_madeni", LuminitMadeniBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
