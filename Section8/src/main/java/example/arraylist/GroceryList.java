package example.arraylist;

import java.util.ArrayList;

public class GroceryList {
    ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        System.out.println(item + " added to list");
        groceryList.add(item);
    }

    //position starts from 1 for accessors hence all adjustment is done inside the class
    private void removeItem(int position) {
        groceryList.remove(position);
    }

    public void removeItem(String item) {
        int index = groceryList.indexOf(item);
        if (index >= 0) {
            removeItem(index);
        } else {
            System.out.println("Item not found in the list");
        }
    }

    //position starts from 1 fro accessors hence all adjustment is done inside the class
    private void modifyItem(int position, String newItem) {
        System.out.println("Updating item " + groceryList.get(position) + " to " + newItem);
        groceryList.set(position, newItem);
    }


    //position starts from 1 fro accessors hence all adjustment is done inside the class
    public void modifyItem(String currentItem, String newItem) {
        int currentItemIndex = groceryList.indexOf(currentItem);
        if (currentItemIndex >= 0) {
            modifyItem(currentItemIndex, newItem);
        } else {
            System.out.println("Item " + currentItem + " not found in the list");
        }
    }

    public String findItem(String item) {
        int index = groceryList.indexOf(item);
        if (index >= 0) {
            return groceryList.get(index);
        }
        return null;
    }

    public void printGroceryItems() {
        System.out.println("Your grocery list have " + groceryList.size() + " items");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }
}
