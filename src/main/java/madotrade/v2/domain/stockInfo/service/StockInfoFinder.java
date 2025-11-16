package madotrade.v2.domain.stockInfo.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.stockInfo.entity.StockInfo;
import madotrade.v2.domain.stockInfo.exception.StockInfoNotFoundException;
import madotrade.v2.domain.stockInfo.repository.StockInfoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Transactional
public class StockInfoFinder {

    private final StockInfoRepository stockInfoRepository;

    public StockInfo getStockInfoByStockInfoId(Long stockInfoId){
        return stockInfoRepository.findById(stockInfoId)
                .orElseThrow(StockInfoNotFoundException::new);
    }
}
