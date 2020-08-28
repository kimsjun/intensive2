package movieTicket;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

 @RestController
 public class BookingController {

  @Autowired
  BookingService bookingService;

  @PostMapping
  public Long booking(@RequestBody Booked booked) {
   return bookingService.save(booked);
  }

 }
