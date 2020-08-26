
package movieTicket;

public class PaymentSuccess extends AbstractEvent {

    private Long paymentId;
    private Long bookingId;
    private Double totalPrice;
    private String paymentStatus;
    private String paymentStatus;

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }
    public Long getBookingOd() {
        return bookingId;
    }

    public void setBookingOd(Long bookingId) {
        this.bookingId = bookingId;
    }
    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
