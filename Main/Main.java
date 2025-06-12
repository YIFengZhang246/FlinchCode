import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Finch bird = new Finch();

    while (true) {

      System.out.println("\nOptions:");
      System.out.println("1: Start the Robot");
      System.out.println("2: stop the Robot");
      System.out.println("3: System Data");
      System.out.println("4: Auto Drive until obstacle");
      System.out.println("5: Exit");
      System.out.println("Choose an option: ");

      int option = scanner.nextInt();
      scanner.nextLine()l

        switch (option) {
        case 1: 
          STirng direction 
            int distance;
          int speed;

          while (true) {

            System.out.print("Enter direction (F/B):");
            direction = scanner.nextLine().trim().toUpperCase();
            if (direction.equals("F") || direction.equals("B")) {
              break;
            }
            System.out.println("Invalid input. Please enter 'F' or 'B'.");
          }
          System.out.print("Enter distance: ");
          distance = scanner.nextInt();

          while (true) {
            System.out.print("Enter speed (1-100):");

            speed = scanner.nextInt();
            if (speed = scanner.nextInt();
            if (speed >= 1 && speed <= 100) {
              break;
            }
            System.out.println("Invalid speed. Must be between 1 and 100.");
          }
          bird.setMove(direction, distance, speed);

          scanner.nextLine();
          break;

        case 2:
          bird.stop();
          break;

        case 3:

          System.out.println("Distance from objects: " + bird.getDistance());
          System.out.println("Compass direction: " + bird.getCompass());
          break;

        case 4:
          
