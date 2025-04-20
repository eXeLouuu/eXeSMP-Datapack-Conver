
package net.exesmp.exesmpdatapack.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class VulcanitMadeniBlock extends Block {
	public VulcanitMadeniBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NYLIUM).strength(5f, 8f).lightLevel(s -> 3));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
