package madotrade.v2.domain.review.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import madotrade.v2.common.entity.BaseIdEntity;
import madotrade.v2.domain.news.entity.News;
import madotrade.v2.domain.user.entity.User;

import java.awt.print.Pageable;

@Getter
@Entity(name = "reviews")
public class Review extends BaseIdEntity {

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    User user;

    @JoinColumn(name = "news_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    News news;

    String title;

    String content;

    public Review(String content, News news, String title, User user) {
        this.content = content;
        this.news = news;
        this.title = title;
        this.user = user;
    }

    public static Review of(String content, News news, String title, User user){
        return new Review(content, news, title, user);
    }

    public void update(String content, News news,String title,User user){
        this.content = content;
        this.news = news;
        this.title = title;
        this.user = user;
    }
}
