 abstract class Animal {
    String name;
    int numOfLegs;
    boolean isMammal;

    public Animal(String name, int numOfLegs, boolean isMammal){
        this.name = name;
        this.numOfLegs = numOfLegs;
        this.isMammal = isMammal;
    }

    public abstract void makeSound();
}