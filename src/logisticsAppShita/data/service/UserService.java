package logisticsAppShita.data.service;

import logisticsAppShita.data.model.User;
import logisticsAppShita.data.dto.requests.RegisterUserRequest;
import logisticsAppShita.data.dto.responses.RegisterUserResponse;

public interface UserService {

    RegisterUserResponse registerNewUser(RegisterUserRequest request);

    User findUser(String id);

}
