package madotrade.v2.domain.stockprice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import madotrade.v2.common.entity.BaseIdEntity;
import madotrade.v2.domain.stock.Stock;

@Entity
@Getter
public class StockPrice extends BaseIdEntity {

    @JoinColumn(name = "stocks_id",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    Stock stock;

    Long quantity;

    int price;

    public StockPrice(int price, Long quantity, Stock stock) {
        this.price = price;
        this.quantity = quantity;
        this.stock = stock;
    }

    public static StockPrice of(int price, Long quantity, Stock stock){

        return new StockPrice(price,quantity,stock);
    }
}
