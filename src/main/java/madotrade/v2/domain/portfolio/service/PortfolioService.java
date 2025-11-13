package madotrade.v2.domain.portfolio.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.portfolio.dto.request.PortfolioRequest;
import madotrade.v2.domain.portfolio.dto.response.PortfolioResponse;
import madotrade.v2.domain.portfolio.repository.PortfolioRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class PortfolioService {

    private final PortfolioRepository portfolioRepository;


}
