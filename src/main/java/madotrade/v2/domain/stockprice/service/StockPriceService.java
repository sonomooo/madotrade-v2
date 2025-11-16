package madotrade.v2.domain.stockprice.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.stockprice.dto.request.StockPriceRequest;
import madotrade.v2.domain.stockprice.dto.response.StockPriceResponse;
import madotrade.v2.domain.stockprice.entity.StockPrice;
import madotrade.v2.domain.stockprice.repository.StockPriceRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class StockPriceService {

    private final StockPriceRepository stockPriceRepository;


    public StockPriceResponse createStockPrice(StockPriceRequest stockPriceRequest) {
        StockPrice stockPrice = StockPrice.of(stockPriceRequest.price(), stockPriceRequest.quantity(), stockPriceRequest.stock());
        stockPriceRepository.save(stockPrice);

        return StockPriceResponse.from(stockPrice);
    }
}
