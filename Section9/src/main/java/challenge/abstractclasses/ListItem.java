package challenge.abstractclasses;

public abstract class ListItem {
    ListItem prev;
    ListItem next;
    Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract void setNext(ListItem node);
    public abstract ListItem next();
    public abstract void setPrev(ListItem node);
    public abstract ListItem prev();
    public abstract int compareTo(ListItem node);

    public Object getValue() {
        return value;
    }
}
