class Animal{
    void makesound(){
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal{
    @Override
    void makesound(){
        System.out.println("The dog barks: Woof Woof!");
    }
}

public class Main{
    public static void main(String args[]){
        Animal myanimal = new Animal();
        myanimal.makesound();

        Dog mydog = new Dog();
        mydog.makesound();
    }
}

