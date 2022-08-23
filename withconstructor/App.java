public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character giant = new Character(10, 5, 0, "giant");
        // Calls the sayMyName method
        giant.sayMyName();
        giant.sayMyStrength();
        giant.sayMyIntelligence();
        giant.sayMyAgility();

        // Creates a new object named "mage" from Character class
        Character princess = new Character(0, 5, 10, "princess");
        // Calls the sayMyName method
        princess.sayMyName();
        princess.sayMyStrength();
        princess.sayMyIntelligence();
        princess.sayMyAgility();


        // Creates a new object named "mage" from Character class
        Character witch = new Character(5, 10, 0, "witch");
        // Calls the sayMyName method
        witch.sayMyName();
        witch.sayMyStrength();
        witch.sayMyIntelligence();
        witch.sayMyAgility();

    }
}
