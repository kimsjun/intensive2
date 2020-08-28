package movieTicket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

 @RestController
 public class PaymentHistoryController {

  @Autowired
  PaymentService paymentService;

  @PostMapping("/paymentHistories")
  public String makePayment(@RequestBody PaymentHistory paymentHistory) {
   Long paymentId = paymentService.paySuccess(paymentHistory);
   return "payment : " + paymentId +  "성공하였습니다 ";
  }


 }
