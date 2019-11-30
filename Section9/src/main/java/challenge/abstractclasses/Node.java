package challenge.abstractclasses;


/**
 * A general node of LinkedList
 */
public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    public void setNext(ListItem node) {
        next = node;
    }

    @Override
    public ListItem next() {
            return next;
    }

    @Override
    public void setPrev(ListItem node) {
        prev = node;
    }

    @Override
    public ListItem prev() {
        return prev;
    }

    @Override
    public int compareTo(ListItem node) {
        if(node == null){
            return -1;
        }else {
            return ((String)this.value).compareTo((String)node.value);
        }
    }
}
