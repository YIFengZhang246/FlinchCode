import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Finch bird = new Finch();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1: Start the Robot");
            System.out.println("2: Stop the Robot");
            System.out.println("3: System Data");
            System.out.println("4: Auto Drive Until Obstacle");
            System.out.println("5: Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (option) {
                case 1:
                    String direction;
                    int distance;
                    int speed;

                    while (true) {
                        System.out.print("Enter direction (F/B): ");
                        direction = scanner.nextLine().trim().toUpperCase();
                        if (direction.equals("F") || direction.equals("B")) {
                            break;
                        }
                        System.out.println("Invalid input. Please enter 'F' or 'B'.");
                    }

                    System.out.print("Enter distance: ");
                    distance = scanner.nextInt();

                    while (true) {
                        System.out.print("Enter speed (1-100): ");
                        speed = scanner.nextInt();
                        if (speed >= 1 && speed <= 100) {
                            break;
                        }
                        System.out.println("Invalid speed. Must be between 1 and 100.");
                    }

                    bird.setMove(direction, distance, speed);
                    scanner.nextLine(); // Consume newline
                    break;

                case 2:
                    bird.stop();
                    break;

                case 3:
                    System.out.println("Distance from object: " + bird.getDistance());
                    System.out.println("Compass direction: " + bird.getCompass());
                    break;

                case 4:
                    System.out.println("Starting auto-drive...");
                    while (bird.getDistance() > 5) {
                        bird.setMove("F", 10.0, 10.0);
                        System.out.println("Distance to object: " + bird.getDistance());
                        if (bird.isShaking()) {
                            System.out.println("Robot is shaking. Turning right...");
                            bird.setTurn("R", 90, 10);
                        }
                    }
                    System.out.println("Object detected nearby. Stopping.");
                    bird.stop();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Please choose between 1-5.");
            }
        }
    }
}
