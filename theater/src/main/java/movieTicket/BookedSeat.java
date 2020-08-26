package movieTicket;

public class BookedSeat extends AbstractEvent {

    private Long id;

    public BookedSeat(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
