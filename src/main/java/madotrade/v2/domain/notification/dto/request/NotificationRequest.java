package madotrade.v2.domain.notification.dto.request;

import madotrade.v2.domain.notification.enums.NotificationType;
import madotrade.v2.domain.user.entity.User;

public record NotificationRequest(User user, NotificationType notificationType, String identify, boolean isValid) {
}
