package in.kahl;

public class BeutelElement {
    private BeutelElement nextElement = null;
    private int value;

    public BeutelElement(int value) {
        this.value = value;
    }

    public BeutelElement getNextElement() {
        return nextElement;
    }

    public void setNextElement(BeutelElement nextElement) {
        this.nextElement = nextElement;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
