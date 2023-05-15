package us.blueeyemods.blueeyecommons.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import us.blueeyemods.blueeyecommons.Main;

import java.util.function.Consumer;

import static net.minecraft.data.recipes.RecipeCategory.BUILDING_BLOCKS;
import static net.minecraft.world.level.block.Blocks.*;
import static us.blueeyemods.blueeyecommons.block.ModBlocks.*;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
	public ModRecipeProvider(PackOutput output) {
		super(output);
	}

	protected static void brickBuilder(Consumer<FinishedRecipe> consumer, RecipeCategory category, ItemLike output, ItemLike input) {
		ShapedRecipeBuilder.shaped(category, output, 4).define('#', input).pattern("##").pattern("##").unlockedBy(
				getHasName(input), has(input)).save(consumer, new ResourceLocation(Main.MODID, getItemName(output)));
	}

	protected static void pillarBuilder(Consumer<FinishedRecipe> consumer, RecipeCategory category, ItemLike output, ItemLike input) {
		ShapedRecipeBuilder.shaped(category, output, 2).define('#', input).pattern("#").pattern("#").unlockedBy(
				getHasName(input), has(input)).save(consumer, new ResourceLocation(Main.MODID, getItemName(output)));
	}

	protected static void slabBuilder(Consumer<FinishedRecipe> consumer, RecipeCategory category, ItemLike output, ItemLike input) {
		ShapedRecipeBuilder.shaped(category, output, 6).define('#', input).pattern("###").unlockedBy(getHasName(input),
				has(input)).save(consumer, new ResourceLocation(Main.MODID, getItemName(output)));
	}

	protected static void stairBuilder(Consumer<FinishedRecipe> consumer, RecipeCategory category, ItemLike output, ItemLike input) {
		ShapedRecipeBuilder.shaped(category, output, 4).define('#', input).pattern("#  ").pattern("## ").pattern("###")
				.unlockedBy(getHasName(input), has(input)).save(consumer,
						new ResourceLocation(Main.MODID, getItemName(output)));
	}

	// This compacts 4 of the same block/item into 1 storage block.
	protected static void twoByTwoStorageBuilder(Consumer<FinishedRecipe> consumer, RecipeCategory category, ItemLike output, RecipeCategory category2, ItemLike input) {
		ShapedRecipeBuilder.shaped(category, output).define('#', input).pattern("## ").pattern("## ").unlockedBy(
				getHasName(input), has(input)).save(consumer, new ResourceLocation(Main.MODID, getItemName(output)));
		ShapelessRecipeBuilder.shapeless(category2, input, 4).requires(output).unlockedBy(getHasName(output),
				has(output)).save(consumer, new ResourceLocation(Main.MODID, getItemName(input)));
	}

	protected static void wallBuilder(Consumer<FinishedRecipe> consumer, RecipeCategory category, ItemLike output, ItemLike input) {
		ShapedRecipeBuilder.shaped(category, output).define('#', input).pattern("###").pattern("###").unlockedBy(
				getHasName(input), has(input)).save(consumer, new ResourceLocation(Main.MODID, getItemName(output)));
	}

	// This compacts 9 of the same block/item into 1 storage block.
	protected static void threeByThreeStorageBuilder(Consumer<FinishedRecipe> consumer, RecipeCategory category, ItemLike output, RecipeCategory category2, ItemLike input) {
		ShapedRecipeBuilder.shaped(category, output).define('#', input).pattern("###").pattern("###").pattern("###")
				.unlockedBy(getHasName(input), has(input)).save(consumer,
						new ResourceLocation(Main.MODID, getItemName(output)));
		ShapelessRecipeBuilder.shapeless(category2, input, 9).requires(output).unlockedBy(getHasName(output),
				has(output)).save(consumer, new ResourceLocation(Main.MODID, getItemName(input)));
	}

	protected static void dyedBlockBuilderWithTags(Consumer<FinishedRecipe> consumer, ItemLike output, TagKey<Item> input, TagKey<Item> input2) {
		ShapelessRecipeBuilder.shapeless(BUILDING_BLOCKS, output).requires(input).requires(input2).group("dyed_blocks")
				.unlockedBy(String.valueOf(input), has(input)).save(consumer,
						new ResourceLocation(Main.MODID, getItemName(output)));
	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
       /* ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.SPAWNER, 1)
                .define('A', ItemTags.WOOL)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(String.valueOf(ItemTags.WOOL), has(ItemTags.WOOL))
                .save(consumer, new ResourceLocation(Main.MODID, getItemName(Blocks.SPONGE))); */
		pillarBuilder(consumer, BUILDING_BLOCKS, PACKED_SNOW_PILLAR.get(), PACKED_SNOW.get());
		pillarBuilder(consumer, BUILDING_BLOCKS, BLUE_ICE_PILLAR.get(), BLUE_ICE);
		pillarBuilder(consumer, BUILDING_BLOCKS, PACKED_ICE_PILLAR.get(), PACKED_ICE);
		brickBuilder(consumer, BUILDING_BLOCKS, PACKED_SNOW_BRICKS.get(), PACKED_SNOW.get());
		slabBuilder(consumer, BUILDING_BLOCKS, PACKED_SNOW_SLAB.get(), PACKED_SNOW.get());
		brickBuilder(consumer, BUILDING_BLOCKS, PACKED_SNOW_TILES.get(), PACKED_SNOW_BRICKS.get());
		brickBuilder(consumer, BUILDING_BLOCKS, PACKED_ICE_BRICKS.get(), PACKED_ICE);
		brickBuilder(consumer, BUILDING_BLOCKS, PACKED_ICE_TILES.get(), PACKED_ICE_BRICKS.get());
		brickBuilder(consumer, BUILDING_BLOCKS, BLUE_ICE_BRICKS.get(), BLUE_ICE);
		brickBuilder(consumer, BUILDING_BLOCKS, BLUE_ICE_TILES.get(), BLUE_ICE_BRICKS.get());
		slabBuilder(consumer, BUILDING_BLOCKS, BLUE_ICE_SLAB.get(), BLUE_ICE);
		slabBuilder(consumer, BUILDING_BLOCKS, PACKED_ICE_SLAB.get(), PACKED_ICE);
		stairBuilder(consumer, BUILDING_BLOCKS, BLUE_ICE_STAIRS.get(), BLUE_ICE);
		stairBuilder(consumer, BUILDING_BLOCKS, PACKED_ICE_STAIRS.get(), PACKED_ICE);
		stairBuilder(consumer, BUILDING_BLOCKS, PACKED_SNOW_STAIRS.get(), PACKED_SNOW.get());
		twoByTwoStorageBuilder(consumer, BUILDING_BLOCKS, PACKED_SNOW.get(), BUILDING_BLOCKS, SNOW_BLOCK);
		wallBuilder(consumer, BUILDING_BLOCKS, PACKED_SNOW_WALL.get(), PACKED_SNOW.get());
		wallBuilder(consumer, BUILDING_BLOCKS, PACKED_ICE_WALL.get(), PACKED_ICE);
		wallBuilder(consumer, BUILDING_BLOCKS, BLUE_ICE_WALL.get(), BLUE_ICE);
	}
}