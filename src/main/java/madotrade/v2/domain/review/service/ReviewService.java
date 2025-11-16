package madotrade.v2.domain.review.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.review.dto.request.ReviewRequest;
import madotrade.v2.domain.review.dto.response.ReviewResponse;
import madotrade.v2.domain.review.entity.Review;
import madotrade.v2.domain.review.repository.ReviewRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final ReviewFinder reviewFinder;

    public ReviewResponse createReview(ReviewRequest reviewRequest){
        Review review = Review.of(reviewRequest.content(), reviewRequest.news(), reviewRequest.title(), reviewRequest.user());
        reviewRepository.save(review);

        return ReviewResponse.from(review);
    }

    public Page<ReviewResponse> getAllReview(Pageable pageable){
        Page<Review> reviews = reviewRepository.findAll(pageable);

        return reviews.map(ReviewResponse::from);
    }

    public ReviewResponse getReview(Long reviewId){
        Review reviewByReviewId = reviewFinder.getReviewByReviewId(reviewId);

        return ReviewResponse.from(reviewByReviewId);
    }

    public void deleteReviewById(Long reviewId) {
        Review reviewByReviewId = reviewFinder.getReviewByReviewId(reviewId);

        reviewRepository.delete(reviewByReviewId);
    }

    public ReviewResponse updateReview(Long reviewId, ReviewRequest reviewRequest) {
        Review reviewByReviewId = reviewFinder.getReviewByReviewId(reviewId);
        reviewByReviewId.update(reviewRequest.content(),reviewRequest.news(),reviewRequest.title(),reviewRequest.user());

        return ReviewResponse.from(reviewByReviewId);
    }
}
