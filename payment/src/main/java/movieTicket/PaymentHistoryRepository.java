package movieTicket;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaymentHistoryRepository extends PagingAndSortingRepository<PaymentHistory, Long>{


}