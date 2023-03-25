public class Coffee implements TimsConsumable{
    @Override
    public int getCalories() {
        return 110;
    }

    @Override
    public double getPrice() {
        return 1.79;
    }
    @Override
    public String toString() {
        return "Item: Coffee     Price: $1.79";
    }

}
