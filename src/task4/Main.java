package task4;

public class Main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        Eating humanEating = new HumanWorker();
        Worker robot = new RobotWorker();

        human.work(); // Output: Человек работает
        humanEating.eat(); // Output: Человек ест
        robot.work(); // Output: Робот работает
    }
}
