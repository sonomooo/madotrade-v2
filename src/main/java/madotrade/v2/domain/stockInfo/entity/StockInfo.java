package madotrade.v2.domain.stockInfo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import madotrade.v2.common.entity.BaseIdEntity;
import madotrade.v2.domain.news.enums.Race;
import madotrade.v2.domain.stock.Stock;
import madotrade.v2.domain.stockInfo.enums.Field;

@Entity
@Getter
public class StockInfo extends BaseIdEntity {

    String name;

    String description;

    String stockImage;

    @JoinColumn(name = "stock_id", nullable = false)
    @OneToOne(fetch = FetchType.LAZY)
    Stock stock;

    @Column(name = "races")
    @Enumerated(value = EnumType.STRING)
    Race race;

    @Column(name = "fields")
    @Enumerated(value = EnumType.STRING)
    Field field;
}
