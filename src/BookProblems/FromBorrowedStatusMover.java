package BookProblems;

public class FromBorrowedStatusMover extends Bookover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED,AVILIABLE, OVERDUED -> book.setStatus(requestedStatus);
            default -> System.out.println("Переход книги из статуса " + book.getStatus().name() +
                    requestedStatus.name() + " невозможен " );
        }
    }
}
