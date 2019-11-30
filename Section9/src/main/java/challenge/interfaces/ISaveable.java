package challenge.interfaces;

import java.util.List;

public interface ISaveable {
    void read(List<String> savedObject);

    List<String> write();
}
