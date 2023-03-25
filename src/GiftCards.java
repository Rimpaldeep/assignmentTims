public class GiftCards implements TimsMerchandise{
    @Override
    public String getFeature() {
        return "Amazon gift card";
    }

    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String toString() {
        return "Item: Gift Card     Price: $50";
    }
}
