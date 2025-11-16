package madotrade.v2.domain.news.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import madotrade.v2.domain.news.enums.NewsType;
import madotrade.v2.domain.news.enums.Race;

@Entity
@Getter
public class News {

    String title;

    String content;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    NewsType newsType;

    @Column(name = "races")
    @Enumerated(value = EnumType.STRING)
    Race race;

    public News(String content, NewsType newsType, Race race, String title) {
        this.content = content;
        this.newsType = newsType;
        this.race = race;
        this.title = title;
    }

    public static News of(String content, NewsType newsType, Race race,String title){

        return new News(content,newsType,race,title);
    }

    public void updateShop(String title, String content, NewsType newsType, Race race){

        this.title = title;
        this.content = content;
        this.newsType = newsType;
        this.race = race;
    }

}
