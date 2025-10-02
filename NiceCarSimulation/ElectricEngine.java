package OOPs.Interface.NiceCarSimulation;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine starts silently...");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stop.");
    }

    @Override
    public void acc() {
        System.out.println("ElectricEngine accelerate");
    }
}
