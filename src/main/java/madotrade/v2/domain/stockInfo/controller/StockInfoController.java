package madotrade.v2.domain.stockInfo.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.common.response.ApiResponse;
import madotrade.v2.domain.stockInfo.dto.request.StockInfoRequest;
import madotrade.v2.domain.stockInfo.dto.response.StockInfoResponse;
import madotrade.v2.domain.stockInfo.service.StockInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@RestController
public class StockInfoController {

    private final StockInfoService stockInfoService;

    //TODO: stock과 연결되어서 생성해야함 -> stock id로 연결짓기?
    @PostMapping("/stockInfo")
    public ResponseEntity<ApiResponse<StockInfoResponse>> createStockInfo(@RequestBody StockInfoRequest stockInfoRequest) {

        StockInfoResponse stockInfoResponse = stockInfoService.createStockInfo(stockInfoRequest);

        return ApiResponse.created(stockInfoResponse);
    }

}
