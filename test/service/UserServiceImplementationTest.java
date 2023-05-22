package service;

import logisticsAppShita.data.model.User;
import logisticsAppShita.data.dto.requests.RegisterUserRequest;
import logisticsAppShita.data.service.UserService;
import logisticsAppShita.data.service.UserServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplementationTest {
    private UserService userService;
    @BeforeEach
    public void setUp(){
        userService = new UserServiceImplementation();

    }
    @Test
    public void registerUserTest(){
        RegisterUserRequest request = new RegisterUserRequest();
        request.setPhoneNumber("phone Number");
        request.setLastName("lastName");
        request.setFirstName("firstName");
        request.setAddress("address");
        request.setEmail("email");
        User user = userService.registerNewUser(request);
        assertEquals(1, user.getId());
        User foundUser = userService.findUser(1);
        assertEquals(user, foundUser);

    }

}