package sk.tripcrafter.tripcrafter_backend.payload.response;

import java.util.List;

public class JwtResponse {
    private String token;
    private Long id;
    private String email;
    private String  role;

public JwtResponse(String accessToken, Long id, String email, String role) {
        this.token = accessToken;
        this.id = id;
        this.email = email;
        this.role = role;
        }

public String getAccessToken() {
        return token;
        }

public void setAccessToken(String accessToken) {
        this.token = accessToken;
        }

public Long getId() {
        return id;
        }

public void setId(Long id) {
        this.id = id;
        }

public String getEmail() {
        return email;
        }

public void setEmail(String email) {
        this.email = email;
        }

public String getRole() {
        return role;
        }
}
