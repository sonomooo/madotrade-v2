package madotrade.v2.domain.review.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.common.response.ApiPageResponse;
import madotrade.v2.common.response.ApiResponse;
import madotrade.v2.domain.review.dto.request.ReviewRequest;
import madotrade.v2.domain.review.dto.response.ReviewResponse;
import madotrade.v2.domain.review.service.ReviewService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping("/reviews")
    public ResponseEntity<ApiResponse<ReviewResponse>> createReview(@RequestBody ReviewRequest reviewRequest){
        ReviewResponse review = reviewService.createReview(reviewRequest);

        return ApiResponse.created(review);
    }

    @GetMapping("/reviews")
    public ResponseEntity<ApiPageResponse<ReviewResponse>> getAllReview(@RequestParam(defaultValue = "0")int page, @RequestParam(defaultValue = "10")int size){
        Pageable pageable = PageRequest.of(page, size);
        Page<ReviewResponse> allReview = reviewService.getAllReview(pageable);

        return ApiPageResponse.success(allReview);
    }

    //TODO: 리뷰리스트를 불러올때 필터링 기능추가된 리스트 불러오는 메서드 만들기 주식기준? 작성자 기준?
    @GetMapping("/reviews/{reviewId}")
    public ResponseEntity<ApiResponse<ReviewResponse>> getReviewDetail(@PathVariable Long reviewId){
        ReviewResponse review = reviewService.getReview(reviewId);

        return ApiResponse.success(review);
    }

    @DeleteMapping("/reviews/{reviewId}")
    public ResponseEntity<ApiResponse<Void>> deleteReview(@PathVariable Long reviewId){
        reviewService.deleteReviewById(reviewId);

        return ApiResponse.noContent();
    }

    //TODO: 작성자만 수정가능하도록 수정
    @PutMapping("/reviews/{reviewId}")
    public ResponseEntity<ApiResponse<ReviewResponse>> updateReview(@PathVariable Long reviewId,@RequestBody ReviewRequest reviewRequest){
        ReviewResponse reviewResponse = reviewService.updateReview(reviewId, reviewRequest);

        return ApiResponse.success(reviewResponse);
    }



}
