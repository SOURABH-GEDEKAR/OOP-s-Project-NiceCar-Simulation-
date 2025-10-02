package OOPs.Interface.NiceCarSimulation;

public class PowerBreak implements Break {
    @Override
    public void brake() {
        System.out.println("Car stops using power brake.");
    }
}
