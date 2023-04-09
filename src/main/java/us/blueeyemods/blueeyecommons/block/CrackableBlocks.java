package us.blueeyemods.blueeyecommons.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CrackableBlocks extends Block {
	private final Block block;

	public CrackableBlocks(Properties pProperties, Block block) {
		super(pProperties);
		this.block = block;
	}

	@Override
	public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
		if (pLevel instanceof ServerLevel server) {
			ItemStack itemstack = pPlayer.getItemInHand(pHand);
			if (itemstack.is(ItemTags.PICKAXES)) {
				if (!pPlayer.isCreative()) { itemstack.getItem().setDamage(itemstack, 1); }
				server.setBlockAndUpdate(pPos,block.defaultBlockState());
				server.playSound(null, pPlayer.blockPosition(), SoundEvents.ANCIENT_DEBRIS_BREAK, SoundSource.BLOCKS,
						1.0F, (float) (0.8F + (Math.random() * 0.2D)));
				return InteractionResult.SUCCESS;
			}
			else {
				return InteractionResult.PASS;
			}
		}
		return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
	}
}
