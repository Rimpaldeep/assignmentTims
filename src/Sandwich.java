public class Sandwich implements TimsConsumable{
    @Override
    public int getCalories() {
        return 300;
    }

    @Override
    public double getPrice() {
        return 6.15;
    }
    @Override
    public String toString() {
        return "Item: Sandwich     Price: $6.15";
    }

}
