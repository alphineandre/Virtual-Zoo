import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int continueOuterLoop = 1;
        int continueInnerLoop;
        int menuChoice;

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    Tiger tiger = new Tiger("Bengal Tiger", 200, 100, 10, 80, 60, 90);
                    do {
                        System.out.println("You chose a Tiger.");
                        menuChoice = animalDetailsManipulationMenu(keyboard, tiger);
                        handleAnimalMenuChoice(menuChoice, tiger);
                        System.out.println("Continue with this animal? (Enter 1 for yes / 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 2:
                    Dolphin dolphin = new Dolphin("Blue Dolphin", 150, 50, 8, "Blue", 40);
                    do {
                        System.out.println("You chose a Dolphin.");
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphin);
                        handleAnimalMenuChoice(menuChoice, dolphin);
                        System.out.println("Continue with this animal? (Enter 1 for yes / 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 3:
                    Penguin penguin = new Penguin("Emperor Penguin", 80, 40, 5, "Black & White", 10, 25);
                    do {
                        System.out.println("You chose a Penguin.");
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguin);
                        handleAnimalMenuChoice(menuChoice, penguin);
                        System.out.println("Continue with this animal? (Enter 1 for yes / 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry, no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes / 2 for no):");
            continueOuterLoop = keyboard.nextInt();
        } while (continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("******* ZOO ANIMAL Choice Menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("Enter choice of animal:");
        return keyboard.nextInt();
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        System.out.println("******* ANIMAL Details Menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Display properties");
        System.out.println("2. Display movement");
        System.out.println("3. Display eating");
        System.out.println("Enter choice (1-3):");
        return keyboard.nextInt();
    }

    private static void handleAnimalMenuChoice(int choice, Animal animal) {
        if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            if (choice == 1) tiger.displayTigerDetails();
            else if (choice == 2) tiger.walking();
            else if (choice == 3) tiger.eatingFood();
        } else if (animal instanceof Dolphin) {
            Dolphin dolphin = (Dolphin) animal;
            if (choice == 1) dolphin.displayDolphinDetails();
            else if (choice == 2) dolphin.swimming();
            else if (choice == 3) dolphin.eatingFood();
        } else if (animal instanceof Penguin) {
            Penguin penguin = (Penguin) animal;
            if (choice == 1) penguin.displayPenguinDetails();
            else if (choice == 2) penguin.walking();
            else if (choice == 3) penguin.eatingFood();
        }
    }
}