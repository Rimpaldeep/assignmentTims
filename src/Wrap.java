public class Wrap implements TimsConsumable{
    @Override
    public int getCalories() {
        return 450;
    }

    @Override
    public double getPrice() {
        return 7.89;
    }
    @Override
    public String toString() {
        return "Item: Wrap     Price: $7.89";
    }

}
