package madotrade.v2.domain.stock.dto.response;

import lombok.Builder;
import madotrade.v2.domain.stock.entity.Stock;

@Builder
public record StockResponse(Long id) {

}
