package madotrade.v2.domain.stockprice.dto.request;

import madotrade.v2.domain.stock.entity.Stock;

public record StockPriceRequest (Stock stock,
                                 Long quantity,
                                 int price) {
}
