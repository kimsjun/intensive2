package movieTicket;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentHistoryRepository paymentHistoryRepository;

    public Long paySuccess(PaymentHistory paymentHistory) {
        paymentHistory.setPaymentStatus("Success");
        Long id = paymentHistoryRepository.save(paymentHistory).getPaymentId();
        PaymentSuccess paymentSuccess = new PaymentSuccess();
        BeanUtils.copyProperties(paymentHistory, paymentSuccess);
        return paymentSuccess.getPaymentId();
    }

}
