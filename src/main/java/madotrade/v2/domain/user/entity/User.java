package madotrade.v2.domain.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import madotrade.v2.domain.user.enums.UserRole;

@Getter
@Entity(name = "users")
public class User {

    String email;
    String password;

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    UserRole role;

    Long balance;

}
