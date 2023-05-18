package BookProblems;

public class FromAviliabledStatusMover extends Bookover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case BORROWED, ARCHIVED -> book.setStatus(requestedStatus);
            default -> System.out.println("Переход книги из статуса " + book.getStatus().name() +
                    requestedStatus.name() + " невозможен " );
        }
    }
}
