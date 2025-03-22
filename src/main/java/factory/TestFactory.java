package factory;

public class TestFactory {
    public static void main(String[] args) {
        SuperClassComputer pc=ComputerFactory.getComputer("pc","2 gb","500 gb","2.4 hz");
        SuperClassComputer server=ComputerFactory.getComputer("server","16 gb","1 tb","2.9 hz");
        System.out.println("Factory pc config: "+pc);
        System.out.println("Factory Server config: "+server);
    }
}
