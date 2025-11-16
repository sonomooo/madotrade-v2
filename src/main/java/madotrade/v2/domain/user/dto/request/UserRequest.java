package madotrade.v2.domain.user.dto.request;

import madotrade.v2.domain.user.enums.UserRole;

public record UserRequest (String email,
                           String password,
                           UserRole role) {
}
