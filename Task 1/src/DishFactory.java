class DishFactory {
    public static Dish createDish(String kitchen, String name) {
        return switch (kitchen) {
            case "Итальянская" -> new ItalianDish(name);
            case "Китайская" -> new ChineseDish(name);
            case "Мексиканская" -> new MexicanDish(name);
            default -> throw new IllegalArgumentException("Неизвестная кухня: " + kitchen);
        };
    }
}
