package madotrade.v2.domain.news.dto.response;

import lombok.Builder;
import madotrade.v2.domain.news.entity.News;
import madotrade.v2.domain.news.enums.NewsType;
import madotrade.v2.domain.news.enums.Race;

@Builder
public record NewsResponse(String title,
                           String content,
                           NewsType newsType,
                           Race race) {

    public static NewsResponse from(News news){

        return NewsResponse.builder()
                .title(news.getTitle())
                .content(news.getContent())
                .newsType(news.getNewsType())
                .race(news.getRace())
                .build();
    }

}
