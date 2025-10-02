package OOPs.Interface.NiceCarSimulation;

public class CDmedia implements Media{
    @Override
    public void start() {
        System.out.println("CD media starts playing...");
    }

    @Override
    public void stop() {
        System.out.println("CD media stop playing.");
    }
}
