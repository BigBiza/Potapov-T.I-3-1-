import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Dish> dishes = new ArrayList<>();
    public void addDish(Dish dish) {
        dishes.add(dish);
    }
    public List<Dish> getDishes() {
        return dishes;
    }
}
