package madotrade.v2.domain.review.dto.request;

import madotrade.v2.domain.news.entity.News;
import madotrade.v2.domain.user.entity.User;

public record ReviewRequest(User user,
                            News news,
                            String title,
                            String content) {
}
