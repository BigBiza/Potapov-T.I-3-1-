public class Main {

    public static void main(String[] args) {
        Order order = new Order();

        order.addDish(DishFactory.createDish("Итальянская", "Пицца Маргарита"));
        order.addDish(DishFactory.createDish("Китайская", "Цзяоцзы"));
        order.addDish(DishFactory.createDish("Мексиканская", "Буррито"));

        System.out.println("Ваш заказ:");
        for (Dish dish : order.getDishes()) {
            System.out.println(dish.getKitchen() + " - " + dish.getName());
        }
    }
}

