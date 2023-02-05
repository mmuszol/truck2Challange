public class Truck {
    String manufacturer;
    String model;
    int amountWheels;
    String color;
    final float TOP_SPEED = 100.0f;
    final float ACCELERATION;

    Truck(){
        this.manufacturer = "Freightliner";
        this.model= "9664";
        this.amountWheels =6;
        this.ACCELERATION = 60;
    }

    Truck(String color){
        this();
        this.color = color;
    }

    public void printInfo(){
        System.out.println(this.manufacturer + " "+ this.model + " "+ this.color);
    }
}
