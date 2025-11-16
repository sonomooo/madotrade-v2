package madotrade.v2.domain.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import madotrade.v2.common.entity.BaseIdEntity;
import madotrade.v2.domain.stock.Stock;
import madotrade.v2.domain.user.entity.User;

@Getter
@Entity
public class Portfolio extends BaseIdEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_id", nullable = false)
    Stock stock;

    int price;

    int quantity;

    public Portfolio(int price, int quantity, Stock stock, User user) {
        this.price = price;
        this.quantity = quantity;
        this.stock = stock;
        this.user = user;
    }

    public static Portfolio of(int price, int quantity, Stock stock, User user){

        return new Portfolio(price,quantity,stock,user);
    }
}
