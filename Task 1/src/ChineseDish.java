class ChineseDish implements Dish {
    private String name;
    public ChineseDish(String name) {
        this.name = name;
    }
    @Override
    public String getKitchen() {
        return "Китайская";
    }
    @Override
    public String getName() {
        return name;
    }
}
