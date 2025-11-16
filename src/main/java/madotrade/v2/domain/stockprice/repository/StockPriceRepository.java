package madotrade.v2.domain.stockprice.repository;

import madotrade.v2.domain.stockprice.entity.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice,Long> {


}
