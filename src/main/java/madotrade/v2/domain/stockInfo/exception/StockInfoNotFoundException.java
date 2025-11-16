package madotrade.v2.domain.stockInfo.exception;

import madotrade.v2.common.exception.GlobalException;
import madotrade.v2.domain.stockInfo.code.StockInfoErrorCode;

public class StockInfoNotFoundException extends GlobalException {

    public StockInfoNotFoundException(){super(StockInfoErrorCode.STOCKINFO_NOT_FOUND);}
}
