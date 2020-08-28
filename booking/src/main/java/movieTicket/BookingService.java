package movieTicket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public Long save(Booked booked) {
        return bookingRepository.save(booked.toEntity()).getBookingId();
    }


}
