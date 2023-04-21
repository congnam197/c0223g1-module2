package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_array_list;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    private java.util.Arrays Arrays;

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index:" + index + ", Size" + index);
        }
        return (E) elements[index];
    }

    public E remove(int index) {
        E e = (E) elements[index];
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index" + index + "out of bounds");
        } else {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
        }
        return e;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }
        return result.toString() + "]";
    }
}

