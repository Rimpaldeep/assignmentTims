public class Mugs implements TimsMerchandise{

    @Override
    public String getFeature() {
        return "Beautiful Red Mug";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public String toString() {
        return "Item: Mug     Price: $5";
    }
}
