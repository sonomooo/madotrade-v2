package madotrade.v2.domain.news.exception;

import madotrade.v2.common.exception.GlobalException;
import madotrade.v2.domain.news.code.NewsErrorCode;

public class NewsNotFoundException extends GlobalException {

public NewsNotFoundException(){
    super(NewsErrorCode.NEWS_NOT_FOUND);
}
}
