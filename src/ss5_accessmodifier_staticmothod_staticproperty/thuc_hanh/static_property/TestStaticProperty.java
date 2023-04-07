package ss5_accessmodifier_staticmothod_staticproperty.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3", "Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "Skyactiv 6");

        System.out.println(Car.numberOfCars);
        System.out.println("Car 1 : " + car1.toString());
        System.out.println("Car 2 : " + car2.toString());

    }
}
