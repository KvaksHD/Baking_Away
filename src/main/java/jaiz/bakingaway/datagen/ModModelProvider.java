package jaiz.bakingaway.datagen;

import jaiz.bakingaway.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.FLOUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MILL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURNT_DONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RISEN_SWEET_DOUGH, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICED_SPOON, Models.HANDHELD);
        itemModelGenerator.register(ModItems.UNCOOKED_DONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNICED_DONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_DOUGH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPOON, Models.HANDHELD);


    }
}
