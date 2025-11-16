package madotrade.v2.domain.stockInfo.dto.response;

import lombok.Builder;
import madotrade.v2.domain.news.enums.Race;
import madotrade.v2.domain.stock.Stock;
import madotrade.v2.domain.stockInfo.entity.StockInfo;
import madotrade.v2.domain.stockInfo.enums.Field;

@Builder
public record StockInfoResponse (String name,
                                 String description,
                                 String stockImage,
                                 Stock stock,
                                 Race race,
                                 Field field) {

    public static StockInfoResponse from(StockInfo stockInfo){

        return StockInfoResponse.builder()
                .name(stockInfo.getName())
                .description(stockInfo.getDescription())
                .stockImage(stockInfo.getStockImage())
                .stock(stockInfo.getStock())
                .race(stockInfo.getRace())
                .field(stockInfo.getField())
                .build();
    }

}
