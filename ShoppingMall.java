import java.util.ArrayList;

public class ShoppingMall {
    
    private static ArrayList<Item> items = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }
    
    public void addDairy() {
        items.add(new Dairy());
    }

    public void addFruit() {
        items.add(new Fruit());
    }

    public void addTop() {
        items.add(new Top());
    }

    public void addTrousers() {
        items.add(new Trousers());
    }

    public void addUnderwear() {
        items.add(new Underwear());
    }

    public void addVegetable() {
        items.add(new Vegetable());
    }

    public void addArbitrary(Item item) {
        items.add(item);
    }

    //Calculates the total bill.
    public double bill() {
        double total = 0;
        for (Item item : items) {
            total += item.calculatePrice();
        }
        return total;
    }
}
