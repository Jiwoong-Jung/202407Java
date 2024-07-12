package java0712;

public class ExampleObject implements java.io.Serializable {

	private String name;
    private int value;

    public ExampleObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
