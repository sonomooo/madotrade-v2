package madotrade.v2.domain.user.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import madotrade.v2.domain.user.dto.request.UserRequest;
import madotrade.v2.domain.user.dto.response.UserResponse;
import madotrade.v2.domain.user.entity.User;
import madotrade.v2.domain.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class UserService {

    private final UserRepository userRepository;

    //첫 회원가입시 잔액은 0 으로 설정, 훗날 이벤트시 변경 가능
    public UserResponse createUser(UserRequest userRequest) {
        User user = User.of(0L, userRequest.email(), userRequest.password(), userRequest.role());
        userRepository.save(user);

        return UserResponse.of(user);


    }
}
