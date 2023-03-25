public class Donut implements TimsConsumable{
    @Override
    public int getCalories() {
        return 250;
    }

    @Override
    public String toString() {
        return "Item: Donut     Price: $4.49";
    }

    @Override
    public double getPrice() {
        return 4.49;


    }
}
