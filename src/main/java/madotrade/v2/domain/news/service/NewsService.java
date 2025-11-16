package madotrade.v2.domain.news.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.news.dto.request.NewsRequest;
import madotrade.v2.domain.news.dto.response.NewsResponse;
import madotrade.v2.domain.news.entity.News;
import madotrade.v2.domain.news.exception.NewsNotFoundException;
import madotrade.v2.domain.news.repository.NewsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class NewsService {

    private final NewsRepository newsRepository;
    private final NewsEntityFinder newsEntityFinder;

    @Transactional
    public NewsResponse createNews(@RequestBody NewsRequest newsRequest){
        News news = News.of(newsRequest.content(), newsRequest.newsType(), newsRequest.race(), newsRequest.title());
        newsRepository.save(news);

        return NewsResponse.from(news);
    }

    public Page<NewsResponse> getAllNewsResponse(Pageable pageable) {

        Page<News> news =newsRepository.findAll(pageable);

        return news.map(NewsResponse::from);
    }

    public NewsResponse getNewsDetail(Long newsId) {
        News newsByNewsId = newsEntityFinder.getNewsByNewsId(newsId);
        return NewsResponse.from(newsByNewsId);
    }

    public NewsResponse updateNews(Long newsId, NewsRequest newsRequest) {
        News newsByNewsId = newsEntityFinder.getNewsByNewsId(newsId);
        newsByNewsId.updateShop(newsRequest.title(),newsRequest.content(),newsRequest.newsType(),newsRequest.race());

        return NewsResponse.from(newsByNewsId);
    }

    public void deleteNews(Long newsId){
        News newsByNewsId = newsEntityFinder.getNewsByNewsId(newsId);

        newsRepository.delete(newsByNewsId);
    }

}
