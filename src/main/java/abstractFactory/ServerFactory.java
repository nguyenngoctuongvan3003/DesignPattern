package abstractFactory;

import factory.SubClassServer;
import factory.SuperClassComputer;

public class ServerFactory implements ComputerAbstractFactory {
    public String ram;
    public String hdd;
    public String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    @Override
    public SuperClassComputer createComputer() {
        return new SubClassServer(ram, hdd, cpu);
    }
}
