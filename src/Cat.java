public class Cat extends Animal {
    public Cat(String name, int numOfLegs, boolean isMammal){

        super(name, numOfLegs, isMammal);
    }

    @Override
    public void makeSound() {
        System.out.println("Miaw");
    }
}
