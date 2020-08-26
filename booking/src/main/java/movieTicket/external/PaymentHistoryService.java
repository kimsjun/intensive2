
package movieTicket.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="payment", url="http://payment:8080")
public interface PaymentHistoryService {

    @RequestMapping(method= RequestMethod.GET, path="/paymentHistories")
    public void makePayment(@RequestBody PaymentHistory paymentHistory);

}