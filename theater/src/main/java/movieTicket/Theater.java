package movieTicket;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Theater_table")
public class Theater {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @PrePersist
    public void onPrePersist(){
        BookedSeat bookedSeat = new BookedSeat();
        BeanUtils.copyProperties(this, bookedSeat);
        bookedSeat.publishAfterCommit();


          = new ();
        BeanUtils.copyProperties(this, );
        .publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
