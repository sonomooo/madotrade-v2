package madotrade.v2.domain.review.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import madotrade.v2.domain.user.entity.User;

@Getter
@Entity(name = "reviews")
public class Review {

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    User user;


    @JoinColumn(name = "news_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    News news;

    String title;

    String content;


}
