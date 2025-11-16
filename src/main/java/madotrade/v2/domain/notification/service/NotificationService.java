package madotrade.v2.domain.notification.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.notification.dto.request.NotificationRequest;
import madotrade.v2.domain.notification.dto.response.NotificationResponse;
import madotrade.v2.domain.notification.entity.Notification;
import madotrade.v2.domain.notification.repository.NotificationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class NotificationService {

    private final NotificationRepository notificationRepository;
    private final NotificationFinder notificationFinder;

    public NotificationResponse createNotification(NotificationRequest notificationRequest){
        Notification notification = Notification.of(notificationRequest.identify(), notificationRequest.isValid(), notificationRequest.notificationType(), notificationRequest.user());
        notificationRepository.save(notification);

        return NotificationResponse.from(notification);
    }

    public Page<NotificationResponse> getAllNotificationResponse(Pageable pageable) {
        Page<Notification> notifications = notificationRepository.findAll(pageable);

        return notifications.map(NotificationResponse::from);
    }


    public NotificationResponse getNotificationById(Long notificationId) {
        Notification notificationByNotificationId = notificationFinder.getNotificationByNotificationId(notificationId);

        return NotificationResponse.from(notificationByNotificationId);
    }
}
