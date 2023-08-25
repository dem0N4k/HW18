public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog(25.5, 12, "Бобик");
        System.out.println(dog.getName() + " возрастом " + dog.getAge() + " весит " + dog.getWeight());
        dog.walk();
        dog.move();

        Animal duck = new Duck(3.4, 5, "Утка");
        duck.setName("Кря");
        System.out.println("\n" + duck.getName() + " возрастом " + duck.getAge() + " весит " + duck.getWeight());
        duck.walk();
        duck.move();
    }
}
