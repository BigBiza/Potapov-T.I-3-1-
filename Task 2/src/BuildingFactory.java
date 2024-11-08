public class BuildingFactory implements Building {
    @Override
    public Commercial addCommercial() {
        return new CommercialBuilding();
    }
    @Override
    public Residential addResidential() {
        return new ResidentialBuilding();
    }
    @Override
    public Industrial addIndustrial() {
        return new IndustrialBuilding();
    }
}
