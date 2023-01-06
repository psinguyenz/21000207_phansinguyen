package designpattern.builder.bai2;

public class Director {
    public void buildVilla(Builder builder) {
        builder.setHouseType(HouseType.VILLAS);
        builder.setGarageType(GarageType.WITH_GARAGE);
        builder.setGardenType(GardenType.BIG_GARDEN);
        builder.setSwimmingPoolType(SwimmingPoolType.ROUND_SWIMMINGPOOL);
    }

    public void buildApartment(Builder builder) {
        builder.setHouseType(HouseType.APARTMENT);
        builder.setGarageType(GarageType.NO_GARAGE);
        builder.setGardenType(GardenType.NO_GARDEN);
        builder.setSwimmingPoolType(SwimmingPoolType.NO_SWIMMINGPOOL);
    }

    public void buildStudio(Builder builder) {
        builder.setHouseType(HouseType.STUDIO);
        builder.setGarageType(GarageType.NO_GARAGE);
        builder.setGardenType(GardenType.SMALL_GARDEN);
        builder.setSwimmingPoolType(SwimmingPoolType.SQUARE_SWIMMINGPOOL);
    }
}
