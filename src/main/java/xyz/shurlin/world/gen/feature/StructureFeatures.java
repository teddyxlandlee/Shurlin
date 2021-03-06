package xyz.shurlin.world.gen.feature;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import xyz.shurlin.structure.AncientTreeData;

import java.util.Locale;

public class StructureFeatures {
    public static final StructureFeature<DefaultFeatureConfig> ANCIENT_OAK_TREE;
    public static final StructureFeature<DefaultFeatureConfig> ANCIENT_BIRCH_TREE;
    public static final StructureFeature<DefaultFeatureConfig> ANCIENT_DARK_OAK_TREE;
    public static final StructureFeature<DefaultFeatureConfig> ANCIENT_ACACIA_TREE;
    public static final StructureFeature<DefaultFeatureConfig> ANCIENT_SPRUCE_TREE;
    public static final StructureFeature<DefaultFeatureConfig> ANCIENT_JUNGLE_TREE;
    public static final StructureFeature<DefaultFeatureConfig> ANCIENT_PEAR_TREE;

    private static <F extends StructureFeature<?>> F register(String name, F structureFeature) {
        return Registry.register(Registry.STRUCTURE_FEATURE, name.toLowerCase(Locale.ROOT), structureFeature);
    }

    static {
        ANCIENT_OAK_TREE = register("ancient_oak_tree", new AncientTreeStructureFeature(DefaultFeatureConfig.CODEC, AncientTreeData.OAK));
        ANCIENT_BIRCH_TREE = register("ancient_birch_tree", new AncientTreeStructureFeature(DefaultFeatureConfig.CODEC, AncientTreeData.BIRCH));
        ANCIENT_DARK_OAK_TREE = register("ancient_dark_oak_tree", new AncientTreeStructureFeature(DefaultFeatureConfig.CODEC, AncientTreeData.DARK_OAK));
        ANCIENT_ACACIA_TREE = register("ancient_acacia_tree", new AncientTreeStructureFeature(DefaultFeatureConfig.CODEC, AncientTreeData.ACACIA));
        ANCIENT_SPRUCE_TREE = register("ancient_spruce_tree", new AncientTreeStructureFeature(DefaultFeatureConfig.CODEC, AncientTreeData.SPRUCE));
        ANCIENT_JUNGLE_TREE = register("ancient_jungle_tree", new AncientTreeStructureFeature(DefaultFeatureConfig.CODEC, AncientTreeData.JUNGLE));
        ANCIENT_PEAR_TREE = register("ancient_pear_tree", new AncientTreeStructureFeature(DefaultFeatureConfig.CODEC, AncientTreeData.PEAR));
    }
}
