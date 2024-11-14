package implementation.springjpa;

import implementation.config.JwtUtil;
import implementation.entity.UserEntity;
import implementation.exceptions.userexceptions.UserApiException;
import implementation.exceptions.userexceptions.UserBadRequestException;
import implementation.model.LoginRequest;
import implementation.repository.UserRepository;
import implementation.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class TokenSpringJpa implements TokenService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private UserRepository userRepository;


    @Override
    public String getToken(LoginRequest loginRequest) {
        String token = null;
        try {
            Authentication authenticate = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
            String email = authenticate.getName();
            UserEntity userEntity = userRepository.getByEmail(email);
            userEntity.setPassword("");
            token = jwtUtil.createToken(userEntity);
        } catch (BadCredentialsException e) {
            throw new UserBadRequestException("Invalid username or password");
        } catch (Exception e) {
            throw new UserApiException("Problem occurred while creating token");
        }
        return token;
    }
}