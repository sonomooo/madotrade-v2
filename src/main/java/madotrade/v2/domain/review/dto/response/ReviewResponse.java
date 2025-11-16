package madotrade.v2.domain.review.dto.response;

import lombok.Builder;
import madotrade.v2.domain.news.entity.News;
import madotrade.v2.domain.review.entity.Review;
import madotrade.v2.domain.user.entity.User;

@Builder
public record ReviewResponse (User user,
                              News news,
                              String title,
                              String content){

    public static ReviewResponse from(Review review){

        return ReviewResponse.builder()
                .user(review.getUser())
                .news(review.getNews())
                .title(review.getTitle())
                .content(review.getContent())
                .build();
    }

}
