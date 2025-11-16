package madotrade.v2.domain.stockprice.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.common.response.ApiResponse;
import madotrade.v2.domain.stockprice.dto.request.StockPriceRequest;
import madotrade.v2.domain.stockprice.dto.response.StockPriceResponse;
import madotrade.v2.domain.stockprice.entity.StockPrice;
import madotrade.v2.domain.stockprice.service.StockPriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class StockPriceController {

    private final StockPriceService stockPriceService;

    @PostMapping("/stockPrice")
    public ResponseEntity<ApiResponse<StockPriceResponse>> createStockPrice(@RequestBody StockPriceRequest stockPriceRequest){
        StockPriceResponse stockPriceResponse = stockPriceService.createStockPrice(stockPriceRequest);

        return ApiResponse.created(stockPriceResponse);
    }

}
