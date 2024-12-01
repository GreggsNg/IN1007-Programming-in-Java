public class Car {

        String model;
        int speed;
        double miles;

        public Car(String model, int speed, double miles) {
            this.model = model;
            this.speed = speed;
            this.miles = miles;
        }

    // Method to update speed
    public void updateSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    // Method to update miles
    public void updateMiles(double newMiles) {
        this.miles = newMiles;
    }

    // Getters for displaying the model, speed, and miles
    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public double getMiles() {
        return miles;
    }

}
