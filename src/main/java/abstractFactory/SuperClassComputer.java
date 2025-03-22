package abstractFactory;

public abstract class SuperClassComputer {
    public abstract String getRam();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "Ram= "+this.getRam()+", HDD= "+this.getHDD()+", CPU= "+this.getCPU();
    }
}

