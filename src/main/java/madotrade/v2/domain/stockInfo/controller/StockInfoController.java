package madotrade.v2.domain.stockInfo.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.stockInfo.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@RestController
public class StockInfoController {

    private final StockService stockService;

    public 
}
