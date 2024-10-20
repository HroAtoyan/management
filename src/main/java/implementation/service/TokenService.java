package implementation.service;


import implementation.model.LoginRequest;
import org.springframework.stereotype.Service;

@Service
public interface TokenService {
    String getToken(LoginRequest loginRequest);
}