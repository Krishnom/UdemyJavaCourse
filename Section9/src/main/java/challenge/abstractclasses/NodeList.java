package challenge.abstractclasses;

public interface NodeList {

    ListItem getRoot();

    boolean addNode(ListItem node);

    void traverse();

    void traverse(ListItem root);

    boolean removeNode(ListItem node);
    ListItem searchNode(ListItem node);
    int size();
}
