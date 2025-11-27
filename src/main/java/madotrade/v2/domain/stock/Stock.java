package madotrade.v2.domain.stock;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import madotrade.v2.common.entity.BaseIdEntity;
import madotrade.v2.domain.transaction.entity.Transaction;

@Entity(name = "stocks")
@Getter
public class Stock extends BaseIdEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    Transaction transaction;

}
