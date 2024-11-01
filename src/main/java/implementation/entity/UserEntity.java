package implementation.entity;

import implementation.model.User;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User", schema = "Management")
public class UserEntity {
    @Id
    @Column(name = "user_id")
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    private UUID userId;
    @Column(name = "first_name")
    private String name;
    @Column(name = "last_name")
    private String surname;
    private String email;
    private String password;


    public User toUser() {
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }
    public UserEntity(User user){
        userId = user.getUserId();
        name = user.getName();
        surname = user.getSurname();
        email = user.getEmail();
        password = user.getPassword();
    }

}