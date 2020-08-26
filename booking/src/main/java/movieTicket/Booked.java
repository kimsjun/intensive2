package movieTicket;

public class Booked extends AbstractEvent {

    private Long bookingId;
    private Long customerId;
    private String seatIdList;
    private Long quantity;
    private Long price;
    private String orderStatus;

    public Booked(){
        super();
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getSeatIdList() {
        return seatIdList;
    }

    public void setSeatIdList(String seatIdList) {
        this.seatIdList = seatIdList;
    }
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
