package structual_DecoratorPattern;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportCar=new SportsCar(new BasicCar());    
        sportCar.assemble();
        System.out.println("\n*****");

        Car luxuryCar=new SportsCar(new LuxuryCar(new BasicCar()));    
        luxuryCar.assemble();
    }
}
