package madotrade.v2.domain.stock.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.common.response.ApiResponse;
import madotrade.v2.domain.stock.dto.request.StockRequest;
import madotrade.v2.domain.stock.dto.response.StockResponse;
import madotrade.v2.domain.stock.entity.Stock;
import madotrade.v2.domain.stock.service.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class StockController {

    private final StockService stockService;

    @PostMapping("/stock")
    public ResponseEntity<ApiResponse<Stock>> createStock(){
        Stock stock = stockService.createStock();

        return ApiResponse.created(stock);
    }
}
