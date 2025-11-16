package madotrade.v2.domain.review.exception;

import madotrade.v2.common.exception.GlobalException;
import madotrade.v2.domain.review.code.ReviewErrorCode;

public class ReviewNotFoundException extends GlobalException {

    public ReviewNotFoundException(){super(ReviewErrorCode.REVIEW_NOT_FOUND);}
}
