package movieTicket;

import javax.persistence.*;

import lombok.Builder;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Booking_table")
public class Booking {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long bookingId;
    private Long customerId;
    private String seatIdList;
    private Long quantity;
    private Long price;
    private String orderStatus;

    @PostPersist
    public void onPostPersist(){
        Booked booked = new Booked();
        BeanUtils.copyProperties(this, booked);
        booked.publishAfterCommit();

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        movieTicket.external.PaymentHistory paymentHistory = new movieTicket.external.PaymentHistory();
        paymentHistory.setBookingId(this.getBookingId());
        if (this.getSeatIdList() != null) {
            paymentHistory.setTotalPrice((double) this.getSeatIdList().split(",").length);
        }
        // mappings goes here
        BookingApplication.applicationContext.getBean(movieTicket.external.PaymentHistoryService.class)
            .makePayment(paymentHistory);


    }

    @PreRemove
    public void onPreRemove(){
        Unbooked unbooked = new Unbooked();
        BeanUtils.copyProperties(this, unbooked);
        unbooked.publishAfterCommit();


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

    @Builder
    public Booking(Long customerId, String seatIdList, Long quantity, Long price, String orderStatus) {
        this.customerId = customerId;
        this.seatIdList = seatIdList;
        this.quantity = quantity;
        this.price = price;
        this.orderStatus = orderStatus;
    }

}
