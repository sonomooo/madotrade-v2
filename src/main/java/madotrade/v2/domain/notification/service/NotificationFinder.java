package madotrade.v2.domain.notification.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.notification.entity.Notification;
import madotrade.v2.domain.notification.exception.NotificationNotFoundException;
import madotrade.v2.domain.notification.repository.NotificationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Transactional(readOnly = true)
public class NotificationFinder {

    private final NotificationRepository notificationRepository;

    public Notification getNotificationByNotificationId(Long notificationId){
        Notification notification = notificationRepository.findById(notificationId)
                .orElseThrow(NotificationNotFoundException::new);

        return notification;
    }
}
