package madotrade.v2.domain.stockInfo.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import madotrade.v2.common.code.ErrorCode;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum StockInfoErrorCode implements ErrorCode {

    STOCKINFO_NOT_FOUND(HttpStatus.NOT_EXTENDED, "존재하지 않는 주식 정보입니다.");

    private final HttpStatus httpStatus;
    private final String message;

}
