public class mainclass {
    
     public static void main(String[] args) {
           itemmanager manager = new itemmanager();

        // Adding items
        manager.addItem(new item("enova", 2));
        manager.addItem(new item("tamaraw", 3));
        manager.addItem(new item("hilux", 5));
        manager.addItem(new item("navara", 20));
        manager.addItem(new item("lambhurghini", 5));

        // Listing items
        System.out.println("Items in cars:");
        manager.listItems();

        // Removing an item
        manager.removeItem("enova");

        // Listing items again
        System.out.println("Items after removal:");
        manager.listItems();
    }
}
    

