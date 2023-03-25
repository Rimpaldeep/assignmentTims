public class CoffeePowder implements TimsMerchandise{
    @Override
    public String getFeature() {
        return "Roasted";
    }

    @Override
    public double getPrice() {
        return 4.69;
    }

    @Override
    public String toString() {
        return "Item: Coffee Powder     Price: $4.69";
    }
}
