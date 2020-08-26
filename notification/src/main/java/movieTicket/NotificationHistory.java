package movieTicket;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="NotificationHistory_table")
public class NotificationHistory {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long notificationid;
    private Long bookingId;
    private String phoneNumber;
    private String notificationStatus;


    public Long getNotificationid() {
        return notificationid;
    }

    public void setNotificationid(Long notificationid) {
        this.notificationid = notificationid;
    }
    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(String notificationStatus) {
        this.notificationStatus = notificationStatus;
    }




}
