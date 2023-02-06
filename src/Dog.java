public class Dog extends Animal{
    public Dog(String name, int numOfLegs, boolean isMammal) {
        super(name, numOfLegs, isMammal);
    }
    @Override
    public void makeSound() {
        System.out.println("Vuf");
    }
}