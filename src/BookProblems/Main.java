package BookProblems;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("44", Status.AVILIABLE);
        Bookover fromAviliabledStatusMover = new FromAviliabledStatusMover();
        fromAviliabledStatusMover.moveToStatus(book1, Status.OVERDUED);

    }


}
