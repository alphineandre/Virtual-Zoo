public class Tiger extends Animal implements Eat, Walk {
    private int numberOfStripes;
    private int speed;
    private int roarLevel;

    public Tiger(String name, int weight, int height, int age, int numberOfStripes, int speed, int roarLevel) {
        super(name);
        setWeight(weight);
        setHeight(height);
        setAge(age);
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.roarLevel = roarLevel;
    }

    @Override
    public void eatingFood() {
        System.out.println("The Tiger is eating meat.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("The Tiger has finished eating.");
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed " + speed + " km/h.");
    }

    public void displayTigerDetails() {
        System.out.println("Tiger Details:");
        System.out.println("Name: " + getNameOfAnimal());
        System.out.println("Weight: " + getWeight());
        System.out.println("Height: " + getHeight());
        System.out.println("Age: " + getAge());
        System.out.println("Number of Stripes: " + numberOfStripes);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Roar Level: " + roarLevel);
    }
}