package madotrade.v2.domain.news.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.news.service.NewsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class NewsController {

    private final NewsService newsServcie;

    public NewsResponse createNews(@RequestBody NewsRequest newsRequest){


    }


}
