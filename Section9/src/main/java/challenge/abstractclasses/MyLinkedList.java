package challenge.abstractclasses;

public class MyLinkedList implements NodeList {
    ListItem head = null;

    @Override
    public ListItem getRoot() {
        return head;
    }

    public boolean addNode(ListItem node) {
        boolean result = false;
        if (node == null) {
            throw new NullPointerException("Cannot add NULL node to list");
        }

        if (head == null) {
            head = node;
            return true;
        }

        ListItem currentNode = head;

        while (currentNode != null) {
            //Item already exists
            if (currentNode.compareTo(node) == 0) {
                System.out.println("Item already present");
                break;
            } else if (currentNode.compareTo(node) < 0) { // Item is greater than
                currentNode = currentNode.next();
            } else {
                //New item is less than current item. add before this element
                if (currentNode == head) {
                    node.setNext(head);
                    head.setPrev(node);
                    head = node;
                } else {
                    // x <- newNode ->  z(current)
                    // x ->  newNode <-  z(current)
                    node.setPrev(currentNode.prev());
                    node.setNext(currentNode);
                    currentNode.prev().setNext(node);
                    currentNode.setPrev(node);
                }
                result = true;
                break;
            }
        }

        if (currentNode == null) {
            appendNode(node);
            result = true;
        }

        return result;
    }

    private void appendNode(ListItem newNode) {
        if (head == null) {
            head = newNode;
            return;
        }

        ListItem current = head;
        while (current.next() != null) {
            current = current.next();
        }

        current.setNext(newNode);
        newNode.setPrev(current);

        System.out.println("Added node at the end of list");
    }

    @Override
    public void traverse() {
        traverse(head);
    }

    @Override
    public void traverse(ListItem root) {
        ListItem current = root;
        if (root == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            System.out.print(current.getValue() + ", ");
            current = current.next();
        }
        System.out.println();
    }

    @Override
    public ListItem searchNode(ListItem node) {
        ListItem current = head;
        while (current != null) {
            if (current.compareTo(node) == 0) {
                return current;
            }
            current = current.next();
        }

        System.out.println("SEARCH: Node " + node.getValue() + " not found");
        return null;
    }

    @Override
    public int size() {
        int count = 0;
        ListItem current = head;
        while (current != null) {
            count++;
            current = current.next();
        }
        return count;
    }

    public boolean removeNode(ListItem node) {
        ListItem nodeFound = searchNode(node);

        if (nodeFound == null) {
            System.out.println("REMOVE: Node " + node.value + "does not exist");
            return false;
        }

        if (nodeFound == head && this.size() == 1) { //only node
            head = null;
        } else if (nodeFound == head) { //first node
            head = head.next();
        } else if (nodeFound.next() == null) { //last node
            nodeFound.prev().setNext(null);
        } else {
            nodeFound.prev().setNext(nodeFound.next());
            nodeFound.next().setPrev(nodeFound.prev());
        }
        return true;
    }

    @Override
    public String toString() {
        ListItem currentItem = head;
        StringBuilder printValue = new StringBuilder();
        printValue.append("[");
        while(currentItem.next() != null){
            printValue.append(currentItem.getValue()+",");
            currentItem = currentItem.next();
        }

        printValue.append(currentItem.getValue());
        printValue.append("]");
        return String.valueOf(printValue);
    }
}
