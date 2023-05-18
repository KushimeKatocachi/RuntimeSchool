package BookProblems;

public class FromOverduedStatusMover extends Bookover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED, AVILIABLE -> book.setStatus(requestedStatus);
            default -> System.out.println("Переход книги из статуса " + book.getStatus().name() +
                    requestedStatus.name() + " невозможен ");
        }
    }
}
