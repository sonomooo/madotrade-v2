package madotrade.v2.domain.stock.entity;

import jakarta.persistence.*;
import lombok.Getter;
import madotrade.v2.common.entity.BaseEntity;
import madotrade.v2.common.entity.BaseIdEntity;
import madotrade.v2.domain.transaction.entity.Transaction;

@Entity(name = "stocks")
@Getter
public class Stock extends BaseIdEntity{

}
