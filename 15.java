interface Drivable{
    void startEngine();
    void stopEngine();
}

class Car implements Drivable{
    @Override
    public void startEngine(){
        System.out.println("car engine starts");

    }

    @Override
    public void stopEngine(){
        System.out.println("car engine stop");
    }
}

public class Main{
    public static void main(String args[]){
        Drivable mycar= new Car();
        mycar.startEngine();
        mycar.stopEngine();
    }
}