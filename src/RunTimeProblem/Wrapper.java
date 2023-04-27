package RunTimeProblem;

public class Wrapper {
    public static void main(String[] args) {
        int x =13; //можно менять обертку в int и Integer туда и обратно
        printNumber(x);
    }
    public static void printNumber(Integer i) {
        System.out.println("Add number: " + i);
    }
    //int value = 71;
    //String arg1 = Integer.toString(value);
}
