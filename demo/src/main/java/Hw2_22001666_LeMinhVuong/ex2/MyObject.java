package Hw2_22001666_LeMinhVuong.ex2;

public class MyObject implements Comparable<MyObject> {
    private Object object;

    public MyObject(Object object) {
        this.object = object;
    }

    @Override
    public int compareTo(MyObject another) {
        if (object instanceof String) {
            return ((String) object).compareTo(another.toString());
        } else if (object instanceof Integer) {
            return ((Integer) object).compareTo(((Integer) another.object));
        } else if (object instanceof Double) {
            return ((Double) object).compareTo((Double) another.object);
        } else if (object instanceof Character) {
            return ((Character) object).compareTo((Character) another.object);
        } else if(object instanceof  Long){
            return ((Long) object).compareTo((Long) another.object);
        } else if (object instanceof Float) {
            return ((Float) object).compareTo((Float) another.object);
        }
        return -1;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
