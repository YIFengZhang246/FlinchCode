public class Finch {
    private boolean isMoving = false;

    public void setMove(String direction, int distance, int speed) {
        isMoving = true;
        System.out.println("Moving " + direction + " for " + distance + " units at speed " + speed);
    }

    public void setMove(String direction, double distance, double speed) {
        isMoving = true;
        System.out.println("Moving " + direction + " for " + distance + " units at speed " + speed);
    }

    public void stop() {
        isMoving = false;
        System.out.println("Robot stopped.");
    }

    public double getDistance() {
        // decreasing distance every call to mimic approaching an object
        return Math.random() * 10; // Returns a number between 0 and 10
    }

    public String getCompass() {
        // Returns a fixed direction 
        return "North";
    }

    public boolean isShaking() {
        // 30% chance of shaking
        return Math.random() < 0.3;
    }

    public void setTurn(String direction, int angle, int speed) {
        System.out.println("Turning " + direction + " by " + angle + " degrees at speed " + speed);
    }
}
