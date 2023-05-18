package BookProblems;

public class FromArchievedStatusMover extends Bookover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVILIABLE :
                    book.setStatus(requestedStatus);
                    break;
            default :
                System.out.println("Переход книги из статуса " + book.getStatus().name() +
                        requestedStatus.name() + " невозможен " );
        }
    }
}
