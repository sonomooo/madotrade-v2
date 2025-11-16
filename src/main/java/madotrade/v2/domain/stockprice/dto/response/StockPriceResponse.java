package madotrade.v2.domain.stockprice.dto.response;

import lombok.Builder;
import madotrade.v2.domain.stock.Stock;
import madotrade.v2.domain.stockprice.entity.StockPrice;

@Builder
public record StockPriceResponse (Stock stock,
                                  Long quantity,
                                  int price) {

    public static StockPriceResponse from(StockPrice stockPrice){
        return StockPriceResponse.builder()
                .stock(stockPrice.getStock())
                .quantity(stockPrice.getQuantity())
                .price(stockPrice.getPrice())
                .build();
    }
}
