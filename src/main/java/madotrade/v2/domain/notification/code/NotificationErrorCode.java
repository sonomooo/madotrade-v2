package madotrade.v2.domain.notification.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import madotrade.v2.common.code.ErrorCode;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum NotificationErrorCode implements ErrorCode {

    NOTIFICATION_NOT_FOUND(HttpStatus.NOT_FOUND,"존재하지 않는 알람입니다");

    private final HttpStatus httpStatus;
    private final String message;

}
