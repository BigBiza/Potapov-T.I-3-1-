class ItalianDish implements Dish {
    private String name;

    public ItalianDish(String name) {
        this.name = name;
    }

    @Override
    public String getKitchen() {
        return "Итальянская";
    }

    @Override
    public String getName() {
        return name;
    }
}
