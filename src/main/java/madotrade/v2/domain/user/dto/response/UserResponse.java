package madotrade.v2.domain.user.dto.response;

import lombok.Builder;
import madotrade.v2.domain.user.entity.User;
import madotrade.v2.domain.user.enums.UserRole;

@Builder
public record UserResponse(String email,
                           String password,
                           UserRole role,
                           Long balance) {

    //민감한 정보가 아닌 아이디와 회원 역할만 반환
    public static UserResponse of(User user){
        return UserResponse.builder()
                .email(user.getEmail())
                .role(user.getRole())
                .build();

    }
}
