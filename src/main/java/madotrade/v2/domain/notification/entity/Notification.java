package madotrade.v2.domain.notification.entity;

import jakarta.persistence.*;
import lombok.Getter;
import madotrade.v2.common.entity.BaseIdEntity;
import madotrade.v2.domain.notification.enums.NotificationType;
import madotrade.v2.domain.user.entity.User;

@Getter
@Entity
public class Notification extends BaseIdEntity {

    @JoinColumn(name = "user_id",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    User user;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    NotificationType notificationType;

    String identify;

    boolean isValid;

    public Notification(String identify, boolean isValid, NotificationType notificationType, User user) {
        this.identify = identify;
        this.isValid = isValid;
        this.notificationType = notificationType;
        this.user = user;
    }

    public static Notification of(String identify, boolean isValid, NotificationType notificationType, User user){

        return new Notification(identify,isValid,notificationType,user);
    }

}
