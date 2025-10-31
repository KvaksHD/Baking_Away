package jaiz.bakingaway.item;


import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DONUT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.35f).build();
    public static final FoodComponent UNICED_DONUT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3f).build();
    public static final FoodComponent BURNT_DONUT = new FoodComponent.Builder().nutrition(1).saturationModifier(0.01f).build();
    public static final FoodComponent UNCOOKED_DONUT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3f).build();
    public static final FoodComponent SWEET_DOUGH = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3f).build();

    public static final FoodComponent EXTRA_FOOD = new FoodComponent.Builder().nutrition(4).saturationModifier(0.35f).build();

    public static final FoodComponent ICING = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();

}
