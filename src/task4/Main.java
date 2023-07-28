package task4;

public class Main {
    public static void main(String[] args) {
        Worker worker = new RobotWorker() {


            public void eat() {

            }
        };
        worker.work();
        worker.eat(); // Здесь возникнет исключение UnsupportedOperationException
    }
}