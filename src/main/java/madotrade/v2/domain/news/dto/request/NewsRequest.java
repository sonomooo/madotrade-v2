package madotrade.v2.domain.news.dto.request;

import madotrade.v2.domain.news.enums.NewsType;
import madotrade.v2.domain.news.enums.Race;

public record NewsRequest(String title,
                          String content,
                          NewsType newsType,
                          Race race) {


}
