package abstractFactory;

import factory.SubClassPC;
import factory.SuperClassComputer;

public class PCFactory implements ComputerAbstractFactory {
    public String ram;
    public String hdd;
    public String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }


    @Override
    public SuperClassComputer createComputer() {
        return new SubClassPC(ram, hdd, cpu);
    }
}
