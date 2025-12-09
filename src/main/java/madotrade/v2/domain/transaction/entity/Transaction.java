package madotrade.v2.domain.transaction.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import madotrade.v2.common.entity.BaseCreateEntity;
import madotrade.v2.common.entity.BaseIdEntity;
import madotrade.v2.domain.stock.entity.Stock;
import madotrade.v2.domain.transaction.enums.TransactionStatus;
import madotrade.v2.domain.user.entity.User;

@Getter
@Entity(name = "transactions")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Transaction extends BaseIdEntity {

    @JoinColumn(name = "user_id",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    User user;

    @JoinColumn(name = "stock_id",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    Stock stock;

    @Enumerated(EnumType.STRING)
    TransactionStatus transactionStatus;

    Long quantity;

    Long price;
}
