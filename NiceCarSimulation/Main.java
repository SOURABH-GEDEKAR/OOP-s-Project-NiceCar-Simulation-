package OOPs.Interface.NiceCarSimulation;

public class Main {
    public static void main(String[] args) {
//        Car c1=new Car();
//        c1.start();
//        c1.stop();

// Here problem arises when object E1 and E2 call the start method ,
//same function is call , still both reference variable are diff , object type is same
        // to resolve this i use NiceCar example see that
//        Engine E1=new Car();
//        E1.start();
//        Media E2=new Car();
//        E1.start();


        //this will call default constructor that takes nothing
        NiceCar car1=new NiceCar();
        car1.start();
        car1.startMusic();
        car1.applyBrake();
        car1.stop();

        System.out.println("-----------------------------------------------------------------");


//        NiceCar electricCar = new NiceCar(new ElectricEngine(), new BluetoothMedia(), new DiscBrake());
//        NiceCar sportsCar = new NiceCar(new PowerEngine(), new CDMedia(), new PowerBrake());

        // this will call parametrized constructor
        NiceCar car2=new NiceCar(new ElectricEngine() ,new CDmedia() ,new PowerBreak() );
        car2.start();
        car2.startMusic();
        car2.applyBrake();
        car2.stop();
    }
}
