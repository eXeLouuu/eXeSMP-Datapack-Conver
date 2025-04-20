
package net.exesmp.exesmpdatapack.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class NyxiumMadeniBlock extends Block {
	public NyxiumMadeniBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DEEPSLATE).strength(55f, 9f).lightLevel(s -> 4));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
