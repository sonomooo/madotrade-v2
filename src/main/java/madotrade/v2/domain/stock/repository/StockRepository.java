package madotrade.v2.domain.stock.repository;

import madotrade.v2.domain.stock.dto.request.StockRequest;
import madotrade.v2.domain.stock.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {

}
