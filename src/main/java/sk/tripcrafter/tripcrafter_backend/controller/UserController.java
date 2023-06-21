package sk.tripcrafter.tripcrafter_backend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/users")
@RestController
public class UserController {
    @GetMapping({"/users"})
    @PreAuthorize("hasRole('ADMIN')")
    public String getUsers() {
        return "GIVE ME MA USERS";
    }

    @GetMapping({"/user"})
    @PreAuthorize("hasRole('ADMIN')")
    public String getUser() {
        return "GIVE ME MA USERS";
    }
}

