package in.kahl;

public class Beutel {
    private BeutelElement firstElement;

    public void add(int number) {
        BeutelElement element = new BeutelElement(number);

        if (firstElement == null) {
            firstElement = element;
        } else {
            System.out.println(element.getValue());

            BeutelElement nextElement = firstElement;
            while (nextElement.getNextElement() != null) {
                System.out.println(nextElement.getValue());
                nextElement = nextElement.getNextElement();
            }
            nextElement.setNextElement(element);
        }
    }

    public int size() {
        int i = 0;
        BeutelElement nextElement = firstElement;
        while (nextElement.getNextElement() != null) {
            nextElement = nextElement.getNextElement();
            i++;
        }
        return i;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        BeutelElement nextElement = firstElement;
        while (nextElement.getNextElement() != null) {
            str.append(nextElement.getValue());
            nextElement = nextElement.getNextElement();
            if (nextElement.getNextElement() != null) {
                str.append(", ");
            }
        }
        return "Beutel{" +
                "[" + str +
                "]}";
    }
}
