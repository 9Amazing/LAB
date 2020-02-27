package LAB5;
import java.util.Arrays;
public class Arraylist {
    private Object[] elementData = new Object[1];
    private int size = 0;

    public void add(int i, Object e) {
        if (i > size) {
            ensureCapacity(i + 1);
        } else {
            ensureCapacity(size + 1);
        }

        for (int j = size - 1; j >= i; j--) {
            elementData[j + 1] = elementData[j];
        }
        elementData[i] = e;
        size++;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > size) {
            Object[] arr = new Object[capacity];
            for (int i = 0; i <size; i++) {
                arr[i] = elementData[i];
            }
            elementData = arr;
        }
    }

    public void remove(int i) {
        for (int j = i; j <size - 1; j++) {
            elementData[j] = elementData[j + 1 ];
        }
        elementData[size - 1] = null;
        size--;
    }

    public String toString() {
        return Arrays.toString(elementData);
    }
}
