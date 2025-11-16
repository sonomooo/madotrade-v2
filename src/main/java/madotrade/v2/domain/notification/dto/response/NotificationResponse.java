package madotrade.v2.domain.notification.dto.response;

import lombok.Builder;
import madotrade.v2.domain.notification.entity.Notification;
import madotrade.v2.domain.notification.enums.NotificationType;
import madotrade.v2.domain.user.entity.User;

@Builder
public record NotificationResponse (User user, NotificationType notificationType, String identify, boolean isValid){

    public static NotificationResponse from(Notification notification){

        return NotificationResponse.builder()
                .user(notification.getUser())
                .notificationType(notification.getNotificationType())
                .identify(notification.getIdentify())
                .isValid(notification.isValid())
                .build();
    }
}
