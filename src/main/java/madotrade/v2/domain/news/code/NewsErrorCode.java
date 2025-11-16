package madotrade.v2.domain.news.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import madotrade.v2.common.code.ErrorCode;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum NewsErrorCode implements ErrorCode {

    NEWS_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 뉴스입니다.");

    private final HttpStatus httpStatus;
    private final String message;




}
