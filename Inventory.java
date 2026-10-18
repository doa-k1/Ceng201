package game.inventory;

public class Inventory {

    private Item[] items;
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    public void addItem(Item item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        } else {
            System.out.println("Inventory is full. Cannot add item.");
        }
    }

    public void displayAll() {
        System.out.println("--- Inventory Listing ---");

        for (int i = 0; i < count; i++) {
            Item item = items[i];

            System.out.printf(
                    "%-15s | %-9s | Stock: %d%n",
                    item.getName(),
                    item.getGenre(),
                    item.getStockCount()
            );
        }
    }

    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");

        for (int i = 0; i < count; i++) {
            Item item = items[i];

            System.out.printf(
                    "%-15s -> %s%n",
                    item.getName(),
                    item.getSerialCode()
            );
        }
    }
}
