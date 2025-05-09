package abstractFactory;

public class SubClassPC extends SuperClassComputer {
    private String ram;
    private String hdd;
    private String cpu;

    public SubClassPC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
