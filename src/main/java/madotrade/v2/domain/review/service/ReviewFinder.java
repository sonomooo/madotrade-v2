package madotrade.v2.domain.review.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.review.exception.ReviewNotFoundException;
import madotrade.v2.domain.review.entity.Review;
import madotrade.v2.domain.review.repository.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewFinder {

    private final ReviewRepository reviewRepository;

    public Review getReviewByReviewId(Long reviewId){
        Review review = reviewRepository.findById(reviewId)
                .orElseThrow(ReviewNotFoundException::new);

        return  review;
    }
}
