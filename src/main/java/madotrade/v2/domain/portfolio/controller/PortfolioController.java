package madotrade.v2.domain.portfolio.controller;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import madotrade.v2.common.response.ApiResponse;
import madotrade.v2.domain.portfolio.dto.request.PortfolioRequest;
import madotrade.v2.domain.portfolio.dto.response.PortfolioResponse;
import madotrade.v2.domain.portfolio.service.PortfolioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class PortfolioController {

    private final PortfolioService portfolioService;

//    @GetMapping("/portfolios")
//    public ResponseEntity<ApiResponse<PortfolioResponse>> getPortfolio(@RequestBody PortfolioRequest portfolioRequest){
//
//        PortfolioResponse portfolio = portfolioService.getPortfolio(portfolioRequest);
//
//        return ApiResponse.success(portfolio);
//    }


}
