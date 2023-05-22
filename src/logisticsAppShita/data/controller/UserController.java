package logisticsAppShita.data.controller;

import logisticsAppShita.data.dto.requests.ApiResponse;
import logisticsAppShita.data.model.User;
import logisticsAppShita.data.dto.requests.RegisterUserRequest;
import logisticsAppShita.data.dto.responses.RegisterUserResponse;
import logisticsAppShita.data.service.UserService;
import logisticsAppShita.data.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/user")
    public ResponseEntity<?> registerNewUser(@RequestBody RegisterUserRequest user) {
        return new ResponseEntity<>(userService.registerNewUser(user), HttpStatus.BAD_REQUEST);

    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> findUserById(@PathVariable String id) {
        try {
            return new ResponseEntity<>(new ApiResponse(true,
                    userService.findUser(id)), HttpStatus.FOUND);
        } catch (IllegalArgumentException ex) {
            return new ResponseEntity<>(new ApiResponse(false, ex.getMessage()),
                    HttpStatus.NOT_FOUND);
        }
    }
}

