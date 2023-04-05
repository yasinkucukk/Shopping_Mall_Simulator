// Yasin Kucuk - 150120062
/* This program that creates a ShoppingMall object and adds some items to it. 
Then, it prints the contents and washing instructions of the items. 
Finally, it prints the total bill of the ShoppingMall object. */

public class Test {

    public static void main(String[] args) {
        
        //Creates a new ShoppingMall object.
        ShoppingMall shoppingMall = new ShoppingMall();
        
        shoppingMall.addDairy();
        shoppingMall.addFruit();
        shoppingMall.addTop();
        shoppingMall.addTrousers();
        shoppingMall.addUnderwear();
        shoppingMall.addVegetable();
        
        //Adds a Top object with basePrice = 100
        shoppingMall.addArbitrary(new Top(100));

        //Prints the contents and washing instructions of the items.
        printContent(shoppingMall);
        printWashingInstructions(shoppingMall);

        //Prints the total bill of the ShoppingMall.
        System.out.println("Total bill: " + shoppingMall.bill());
        
    }

    public static void printContent(ShoppingMall shoppingMall) {
        for (Item item : shoppingMall.getItems()) {
            if (item instanceof Vegan) {
                ((Vegan) item).madeOf();
            }
        }
    }

    public static void printWashingInstructions(ShoppingMall shoppingMall) {
        for (Item item : shoppingMall.getItems()) {
            if (item instanceof Washable) {
                ((Washable) item).howToWash();
            }
        }
    }

}
