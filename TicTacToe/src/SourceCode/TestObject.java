package SourceCode;

import java.io.Serializable;

public class TestObject implements Serializable {
    String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
