package madotrade.v2.domain.stock.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.stock.dto.request.StockRequest;
import madotrade.v2.domain.stock.dto.response.StockResponse;
import madotrade.v2.domain.stock.entity.Stock;
import madotrade.v2.domain.stock.repository.StockRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class StockService {

    private final StockRepository stockRepository;

    public Stock createStock() {
        Stock stock = new Stock();
        Stock save = stockRepository.save(stock);

        return save;
    }
}
