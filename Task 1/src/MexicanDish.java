class MexicanDish implements Dish {
    private String name;

    public MexicanDish(String name) {
        this.name = name;
    }

    @Override
    public String getKitchen() {
        return "Мексиканская";
    }

    @Override
    public String getName() {
        return name;
    }
}
