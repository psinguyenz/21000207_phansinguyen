package designpattern.builder.bai2;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();
        director.buildVilla(builder);
        House house = builder.getResult();
        System.out.println(house.getHouseType());
        System.out.println(house.getGarageType());
        System.out.println(house.getGardenType());
        System.out.println(house.getSwimmingPoolType());
    }
}
