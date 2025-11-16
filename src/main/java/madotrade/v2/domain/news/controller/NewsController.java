package madotrade.v2.domain.news.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.common.response.ApiPageResponse;
import madotrade.v2.common.response.ApiResponse;
import madotrade.v2.domain.news.dto.request.NewsRequest;
import madotrade.v2.domain.news.dto.response.NewsResponse;
import madotrade.v2.domain.news.service.NewsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class NewsController {

    private final NewsService newsService;

    @PostMapping("/news")
    public ResponseEntity<ApiResponse<NewsResponse>> createNews(@RequestBody NewsRequest newsRequest){
        NewsResponse news = newsService.createNews(newsRequest);

        return ApiResponse.created(news);
    }

    @GetMapping("/news")
    public ResponseEntity<ApiPageResponse<NewsResponse>> getAllNews(@RequestParam(defaultValue = "0") int page,
                                                                     @RequestParam(defaultValue = "10") int size){
        Pageable pageable = PageRequest.of(page,size);
        Page<NewsResponse> responses = newsService.getAllNewsResponse(pageable);

        return ApiPageResponse.success(responses);
    }

    @GetMapping("/news/{newsId}")
    public ResponseEntity<ApiResponse<NewsResponse>> getNewsDetail(@PathVariable Long newsId){
        NewsResponse newsDetail = newsService.getNewsDetail(newsId);

        return ApiResponse.success(newsDetail);
    }

    @PutMapping("/news/{id}")
    public ResponseEntity<ApiResponse<NewsResponse>> updateNews(@PathVariable Long newsId, @RequestBody NewsRequest newsRequest){
        NewsResponse newsResponse = newsService.updateNews(newsId, newsRequest);

        return ApiResponse.success(newsResponse);
    }

    @DeleteMapping
    public ResponseEntity<ApiResponse<Void>> deleteNews(@PathVariable Long newsId){
        newsService.deleteNews(newsId);

        return ApiResponse.noContent();
    }


}
