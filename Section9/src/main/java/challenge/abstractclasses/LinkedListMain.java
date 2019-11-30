package challenge.abstractclasses;

public class LinkedListMain {

    public static void main(String[] args) {
        SearchTree linkedList = new SearchTree();
        String[] unionTerritories = {"Delhi", "Goa", "Andaman & Nikobar", "Puducherry", "Daman and Diu",
                 "Chandigarh", "Lakshadweep", "Dadra and Nagar Haveli"}; //All Union Territories

        //traverse empty list
        linkedList.traverse();

        for(String ut: unionTerritories){
            System.out.println("Adding UT "+ut+" in List.");
            linkedList.addNode(new Node(ut));
        }
        System.out.println(linkedList.toString());
        System.out.println("Total UTs : "+linkedList.size());
    }
}
