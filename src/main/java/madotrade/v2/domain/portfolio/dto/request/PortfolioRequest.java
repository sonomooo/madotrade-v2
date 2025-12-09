package madotrade.v2.domain.portfolio.dto.request;

import madotrade.v2.domain.stock.entity.Stock;
import madotrade.v2.domain.user.entity.User;

public record PortfolioRequest(User user,
                               Stock stock,
                               int price,
                               int quantity) {

}
