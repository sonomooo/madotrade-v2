package madotrade.v2.domain.notification.exception;

import madotrade.v2.common.exception.GlobalException;
import madotrade.v2.domain.notification.code.NotificationErrorCode;

public class NotificationNotFoundException extends GlobalException {

    public NotificationNotFoundException(){
        super(NotificationErrorCode.NOTIFICATION_NOT_FOUND);
    }
}
