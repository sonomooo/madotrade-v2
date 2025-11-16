package madotrade.v2.domain.stockInfo.repository;

import madotrade.v2.domain.stockInfo.entity.StockInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockInfoRepository extends JpaRepository<StockInfo,Long> {
}
