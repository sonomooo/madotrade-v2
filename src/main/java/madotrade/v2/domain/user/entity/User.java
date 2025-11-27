package madotrade.v2.domain.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import madotrade.v2.common.entity.BaseIdEntity;
import madotrade.v2.domain.user.enums.UserRole;

@Getter
@Entity(name = "users")
public class User extends BaseIdEntity {

    String email;
    String password;

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    UserRole role;

    Long balance;

    protected User() {}

    public User(Long balance, String email, String password, UserRole role) {
        this.balance = balance;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public static User of(Long balance,String email,String password,UserRole userRole){
        return new User(balance,email,password,userRole);
    }
}
