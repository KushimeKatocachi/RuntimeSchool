package DSandA;

public class DynamicArray {
    int size;
    int capacity;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if(size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
        }


  //  public void insert(int index, Object data) {
  //      if (size >= capacity) {
    //        grow();
   //     }
    //    for (int i = size; i > index; i++) {
   //         array = array[i - 1 ];
    //    }
   // }

    public void shrink() {

    }
    private void grow() {

    }
    private boolean isEmpty() {
        return size ==0;
    }
    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            string = array[i] + " , "; }
        if(string != "") {
            string = "[" + string.substring(0, string.length()) + "]";
        }
        return string;
    }


}
