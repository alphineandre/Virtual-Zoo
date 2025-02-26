public class Penguin extends Animal implements Walk, Swim, Eat {
    private String featherColor;
    private int walkingSpeed;
    private int swimmingSpeed;

    public Penguin(String name, int weight, int height, int age, String featherColor, int walkingSpeed, int swimmingSpeed) {
        super(name);
        setWeight(weight);
        setHeight(height);
        setAge(age);
        this.featherColor = featherColor;
        this.walkingSpeed = walkingSpeed;
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("The Penguin is eating fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("The Penguin has finished eating.");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkingSpeed + " km/h.");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimmingSpeed + " km/h.");
    }

    public void displayPenguinDetails() {
        System.out.println("Penguin Details:");
        System.out.println("Name: " + getNameOfAnimal());
        System.out.println("Weight: " + getWeight());
        System.out.println("Height: " + getHeight());
        System.out.println("Age: " + getAge());
        System.out.println("Feather Color: " + featherColor);
        System.out.println("Walking Speed: " + walkingSpeed + " km/h");
        System.out.println("Swimming Speed: " + swimmingSpeed + " km/h");
    }
}