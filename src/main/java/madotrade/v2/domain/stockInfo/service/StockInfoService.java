package madotrade.v2.domain.stockInfo.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.stockInfo.dto.request.StockInfoRequest;
import madotrade.v2.domain.stockInfo.dto.response.StockInfoResponse;
import madotrade.v2.domain.stockInfo.entity.StockInfo;
import madotrade.v2.domain.stockInfo.repository.StockInfoRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class StockInfoService {

    private final StockInfoRepository stockInfoRepository;
    private final StockInfoFinder stockInfoFinder;

    public StockInfoResponse createStockInfo(StockInfoRequest stockInfoRequest) {
        StockInfo stockInfo = StockInfo.of(stockInfoRequest.description(), stockInfoRequest.field(), stockInfoRequest.name(), stockInfoRequest.race(), stockInfoRequest.stock(), stockInfoRequest.stockImage());
        stockInfoRepository.save(stockInfo);

        return StockInfoResponse.from(stockInfo);
    }



}
