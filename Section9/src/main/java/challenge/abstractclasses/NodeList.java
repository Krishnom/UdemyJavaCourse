package challenge.abstractclasses;

public interface NodeList {

    public ListItem getRoot();
    public boolean addNode(ListItem node);
    public void traverse();
    public void traverse(ListItem root);
    public boolean removeNode(ListItem node);
    ListItem searchNode(ListItem node);
    int size();
}
