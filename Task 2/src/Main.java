public class Main {
    public static void main(String[] args) {
        Building building = new BuildingFactory();
        Industrial industrial = building.addIndustrial();
        Commercial commercial = building.addCommercial();
        Residential residential = building.addResidential();

        System.out.println("Строим здания...");
        industrial.built();
        commercial.built();
        residential.built();
    }
}

