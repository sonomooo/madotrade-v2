package madotrade.v2.domain.notification.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.common.response.ApiPageResponse;
import madotrade.v2.common.response.ApiResponse;
import madotrade.v2.domain.notification.dto.request.NotificationRequest;
import madotrade.v2.domain.notification.dto.response.NotificationResponse;
import madotrade.v2.domain.notification.service.NotificationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("/Notifications")
    public ResponseEntity<ApiResponse<NotificationResponse>> createNotification(@RequestBody NotificationRequest notificationRequest){
        NotificationResponse notification = notificationService.createNotification(notificationRequest);

        return ApiResponse.created(notification);
    }

    @GetMapping("/Notifications")
    public ResponseEntity<ApiPageResponse<NotificationResponse>> getAllNotification(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Pageable pageable = PageRequest.of(page,size);
        Page<NotificationResponse> allNotificationResponse = notificationService.getAllNotificationResponse(pageable);

        return ApiPageResponse.success(allNotificationResponse);
    }

    @GetMapping("/Notifications/{notificationId}")
    public ResponseEntity<ApiResponse<NotificationResponse>> getNotificationDetail(@PathVariable Long notificationId){
        NotificationResponse notificationById = notificationService.getNotificationById(notificationId);

        return ApiResponse.success(notificationById);
    }

}
