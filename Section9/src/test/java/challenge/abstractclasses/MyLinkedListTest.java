package challenge.abstractclasses;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    String[] listItems = {"o", "m", "p", "r", "a", "k", "a", "s", "h"};
    String[] orderedUniqueListItems = {"a", "h", "k", "m", "o", "p", "r", "s"};
    MyLinkedList linkedList;

    @BeforeEach
    public void setup() {
        linkedList = new MyLinkedList();

        //populate
        for (String s : listItems) {
            linkedList.addNode(new Node(s));
        }
    }

    @Test
    public void onlyUniqueItemsAreStoredInList() {
        assert orderedUniqueListItems.length == linkedList.size();
    }


    @Test
    public void itemsAreAddedInOrder() {
        ListItem current = linkedList.getRoot();
        for (String s : orderedUniqueListItems) {
            Assertions.assertEquals(s, current.getValue());
            current = current.next();
        }
    }

    @Test
    public void removeFirstItem() {
        linkedList.removeNode(new Node("a"));
        Assertions.assertEquals("[h,k,m,o,p,r,s]", linkedList.toString());
    }

    @Test
    public void removeLastItem() {
        linkedList.removeNode(new Node("s"));
        Assertions.assertEquals("[a,h,k,m,o,p,r]", linkedList.toString());
    }

    @Test
    public void removeAnyItem() {
        linkedList.removeNode(new Node("k"));
        Assertions.assertEquals("[a,h,m,o,p,r,s]", linkedList.toString());
    }

    @Test
    public void searchReturnsNode() {
        ListItem item = linkedList.searchNode(new Node("h"));
        assert item.getValue() == "h";
    }

    @Test public void smallestNodeShouldAddToBeginning(){
        MyLinkedList anotherList = new MyLinkedList();

        anotherList.addNode(new Node("c"));
        anotherList.addNode(new Node("d"));
        anotherList.addNode(new Node("e"));

        assert "[c,d,e]".equals(anotherList.toString());

        anotherList.addNode(new Node("a"));
        assert "[a,c,d,e]".equals(anotherList.toString());
    }

    @Test public void largestNodeShouldAppendToList(){
        MyLinkedList anotherList = new MyLinkedList();

        anotherList.addNode(new Node("c"));
        anotherList.addNode(new Node("d"));
        anotherList.addNode(new Node("e"));

        assert "[c,d,e]".equals(anotherList.toString());

        anotherList.addNode(new Node("f"));
        assert "[c,d,e,f]".equals(anotherList.toString());
    }

}