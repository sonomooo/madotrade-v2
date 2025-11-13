package madotrade.v2.domain.notification.entity;

import jakarta.persistence.*;
import lombok.Getter;
import madotrade.v2.domain.notification.enums.NotificationType;
import madotrade.v2.domain.user.entity.User;

@Getter
@Entity
public class Notification {

    @JoinColumn(name = "user_id",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    User user;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    NotificationType notificationType;

    String identify;

    String isValid;

}
