package designpattern.builder.bai2;

import designpattern.builder.bai1.Car;

public class HouseBuilder implements Builder{
    private HouseType houseType;
    private GardenType gardenType;
    private GarageType garageType;
    private SwimmingPoolType swimmingPoolType;

    public GarageType getGarageType() {
        return garageType;
    }

    public GardenType getGardenType() {
        return gardenType;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public SwimmingPoolType getSwimmingPoolType() {
        return swimmingPoolType;
    }

    @Override
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    @Override
    public void setGarageType(GarageType garageType) {
        this.garageType = garageType;
    }

    @Override
    public void setGardenType(GardenType gardenType) {
        this.gardenType = gardenType;
    }

    @Override
    public void setSwimmingPoolType(SwimmingPoolType swimmingPoolType) {
        this.swimmingPoolType = swimmingPoolType;
    }

    public House getResult() {
        return new House(houseType, gardenType, garageType, swimmingPoolType);
    }
}
