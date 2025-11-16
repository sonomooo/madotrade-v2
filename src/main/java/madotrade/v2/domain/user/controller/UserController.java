package madotrade.v2.domain.user.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.common.response.ApiResponse;
import madotrade.v2.domain.user.dto.request.UserRequest;
import madotrade.v2.domain.user.dto.response.UserResponse;
import madotrade.v2.domain.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class UserController {
//회원 정보 생성만 제작함 -> 삭제 변경은 인증을 만든 후에 로그인된 아이디로 접속 가능하게 만들 생각

    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<ApiResponse<UserResponse>> createUser(@RequestBody UserRequest userRequest){
        UserResponse user = userService.createUser(userRequest);

        return ApiResponse.created(user);
    }

}
