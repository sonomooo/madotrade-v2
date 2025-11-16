package madotrade.v2.domain.transaction.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import madotrade.v2.common.entity.BaseIdEntity;
import madotrade.v2.domain.transaction.enums.TransactionStatus;
import madotrade.v2.domain.user.entity.User;

@Getter
@Entity(name = "transactions")
public class Transaction extends BaseIdEntity {

    @JoinColumn(name = "user_id",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    User user;

    TransactionStatus transactionStatus;

    Long stockQuantity;

}
