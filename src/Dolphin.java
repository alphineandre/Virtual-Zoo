public class Dolphin extends Animal implements Eat, Swim {
    private String color;
    private int swimmingSpeed;

    public Dolphin(String name, int weight, int height, int age, String color, int swimmingSpeed) {
        super(name);
        setWeight(weight);
        setHeight(height);
        setAge(age);
        this.color = color;
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("The Dolphin is eating fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("The Dolphin has finished eating.");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed + " km/h.");
    }

    public void displayDolphinDetails() {
        System.out.println("Dolphin Details:");
        System.out.println("Name: " + getNameOfAnimal());
        System.out.println("Weight: " + getWeight());
        System.out.println("Height: " + getHeight());
        System.out.println("Age: " + getAge());
        System.out.println("Color: " + color);
        System.out.println("Swimming Speed: " + swimmingSpeed + " km/h");
    }
}
