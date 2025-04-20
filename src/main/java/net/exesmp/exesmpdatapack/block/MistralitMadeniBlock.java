
package net.exesmp.exesmpdatapack.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MistralitMadeniBlock extends Block {
	public MistralitMadeniBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.STONE).strength(2f, 3f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
