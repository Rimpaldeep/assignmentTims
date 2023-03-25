public class Bagel implements TimsConsumable{
    @Override
    public int getCalories() {
        return 210;
    }

    @Override
    public double getPrice() {
        return 3.15;
    }

    @Override
    public String toString() {
        return "Item: Bagel     Price: $3.15";
    }
}
