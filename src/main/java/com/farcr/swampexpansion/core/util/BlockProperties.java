package com.farcr.swampexpansion.core.util;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class BlockProperties {
    public static final Block.Properties WILLOW_PLANKS = Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD);
    public static final Block.Properties WILLOW_DOORS = Block.Properties.create(Material.WOOD, MaterialColor.WOOD).notSolid().hardnessAndResistance(3.0F).sound(SoundType.WOOD);
    public static final Block.Properties WILLOW_BUTTON = Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD);
    public static final Block.Properties WILLOW_PRESSURE_PLATE = Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD);
    public static final Block.Properties FLOWER_POT = Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0F);
    public static final Block.Properties LADDER = Block.Properties.create(Material.MISCELLANEOUS).notSolid().harvestTool(ToolType.AXE).hardnessAndResistance(0.4F).sound(SoundType.LADDER);
    public static final Block.Properties BOOKSHELF = Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F).sound(SoundType.WOOD);
    public static final Block.Properties LEAVES = Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).notSolid().tickRandomly().sound(SoundType.PLANT);
    public static final Block.Properties LOG = Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F).sound(SoundType.WOOD);
    public static final Block.Properties SAPLING = Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT);
    public static final Block.Properties MUD_BRICKS = Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(1.5F, 2.5F).sound(SoundType.STONE);
    public static final Block.Properties CATTAIL = Block.Properties.create(Material.TALL_PLANTS).hardnessAndResistance(0.0F).doesNotBlockMovement().tickRandomly().sound(SoundType.WET_GRASS);
    public static final Block.Properties RICE = Block.Properties.create(Material.TALL_PLANTS).hardnessAndResistance(0.0F).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP);
    public static final Block.Properties DUCKWEED = Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).doesNotBlockMovement().sound(SoundType.CROP);
    public static final Block.Properties THATCH = Block.Properties.create(Material.ORGANIC, MaterialColor.GREEN).hardnessAndResistance(0.5F).sound(SoundType.PLANT).harvestTool(ToolType.AXE);
}