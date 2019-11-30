package challenge.abstractclasses;

public class SearchTree implements NodeList {
    ListItem root = null;
    private int count = 0;

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addNode(ListItem node) {
        boolean itemAdded = false;
        if (root == null) {
            root = node;
            count++;
            return true;
        }

        ListItem currentNode = root;
        while (currentNode != null) {
            int comparision = currentNode.compareTo(node);
            if (comparision < 0) {
                //Item node is greater than current node, Move right.
                if (currentNode.next() != null) {
                    currentNode = currentNode.next();
                } else {
                    currentNode.setNext(node);
                    itemAdded = true;
                    break;
                }
            } else if (comparision > 0) {
                //Item node is smaller than currentNode, move right
                if (currentNode.prev() != null) {
                    currentNode = currentNode.prev();
                } else {
                    currentNode.setPrev(node);
                    itemAdded = true;
                    break;
                }
            } else {
                System.out.println("Node already present.");
                itemAdded = false;
                break;
            }
        }

        if(itemAdded){
            count++;
        }

        return itemAdded;
    }

    @Override
    public void traverse() {
        if(root == null) {
            System.out.println("Tree is empty");
            return;
        }else{
            traverse(root);
        }
    }

    @Override
    public void traverse(ListItem rootNode) {
        if(rootNode == null){
            return;
        }

        //items have been added such that the smallest element will be at left most node
        traverse(rootNode.prev());
        System.out.println(rootNode.getValue()+" ,");
        traverse(rootNode.next());
    }

    @Override
    public boolean removeNode(ListItem node) {
        System.out.println("Not implemented citing the complexity of algorithm");
        return false;
    }

    @Override
    public ListItem searchNode(ListItem node) {
        System.out.println("Not implemented yet");
        return null;
    }

    @Override
    public int size() {
        return count;
    }


    @Override
    public String toString() {
        String output = "{";
        getTree(root, output);
        output += "}";
        return output;
    }

    public String getTree(ListItem node, String output) {
        if(node == null){
            return "";
        }

        //items have been added such that the smallest element will be at left most node
        traverse(node.prev());
        output += node.value+",";
        traverse(node.next());

        return output;
    }
}
