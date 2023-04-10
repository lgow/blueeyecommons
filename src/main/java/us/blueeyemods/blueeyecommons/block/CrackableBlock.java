package us.blueeyemods.blueeyecommons.block;

import net.minecraft.core.BlockPos;
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
import org.jetbrains.annotations.NotNull;

public class CrackableBlock extends Block {
	private final Block block;

	public CrackableBlock(Properties pProperties, Block block) {
		super(pProperties);
		this.block = block;
	}

	@Override
	public @NotNull InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		if (!level.isClientSide()) {
			ItemStack stack = player.getItemInHand(hand);
			if (stack.is(ItemTags.PICKAXES)) {
				if (!player.isCreative()) {
					stack.getItem().setDamage(stack, 1);
				}
					level.setBlockAndUpdate(pos, block.defaultBlockState());
					level.playSound(null, player.blockPosition(), SoundEvents.ANCIENT_DEBRIS_BREAK, SoundSource.BLOCKS,
							1.0F, (float) (0.8F + (Math.random() + 0.2D)));
					return InteractionResult.SUCCESS;
				} else {
					return InteractionResult.PASS;
				}
			}
		return super.use(state, level, pos, player, hand, hit);
	}
}
