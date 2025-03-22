package abstractFactory;

public class ComputerFactory {
    public static SuperClassComputer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            return new SubClassPC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new SubClassServer(ram, hdd, cpu);
        }
        return null;
    }
}
