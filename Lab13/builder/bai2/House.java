package designpattern.builder.bai2;

public class House {
    private final HouseType houseType;
    private final GarageType garageType;
    private final GardenType gardenType;
    private final SwimmingPoolType swimmingPoolType;

    public House(HouseType houseType, GardenType gardenType, GarageType garageType, SwimmingPoolType swimmingPoolType) {
        this.houseType = houseType;
        this.garageType = garageType;
        this.gardenType = gardenType;
        this.swimmingPoolType = swimmingPoolType;
    }

    public SwimmingPoolType getSwimmingPoolType() {
        return swimmingPoolType;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public GarageType getGarageType() {
        return garageType;
    }

    public GardenType getGardenType() {
        return gardenType;
    }

}
