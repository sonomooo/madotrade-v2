package madotrade.v2.domain.stockInfo.dto.request;

import madotrade.v2.domain.news.enums.Race;
import madotrade.v2.domain.stock.Stock;
import madotrade.v2.domain.stockInfo.enums.Field;

public record StockInfoRequest (String name,
                                String description,
                                String stockImage,
                                Stock stock,
                                Race race,
                                Field field) {
}
