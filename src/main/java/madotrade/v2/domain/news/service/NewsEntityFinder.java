package madotrade.v2.domain.news.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.news.entity.News;
import madotrade.v2.domain.news.exception.NewsNotFoundException;
import madotrade.v2.domain.news.repository.NewsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Transactional(readOnly = true)
public class NewsEntityFinder {

    private final NewsRepository newsRepository;

    public News getNewsByNewsId(Long id){
        return newsRepository.findById(id)
                .orElseThrow(NewsNotFoundException::new);
    }


}
