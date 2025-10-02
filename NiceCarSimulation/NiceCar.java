package OOPs.Interface.NiceCarSimulation;

public class NiceCar {
    private Engine engine;
    private Media player;
    private Break b1;

    // Default Constructor : awake when any object is created of NiceCar
    public NiceCar(){
        this.engine=new PowerEngine();
        this.player=new CDmedia();
        this.b1=new PowerBreak();
    }

    //Parametrized Constructor   : it takes Engine type, Media type , Break type
    public NiceCar(Engine engine, Media player, Break b1){
        this.engine=engine;
        this.player=player;
        this.b1=b1;
    }

   public void start(){
        engine.start();
   }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }


    public void applyBrake(){
        b1.brake();
    }

}
