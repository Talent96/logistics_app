package logisticsAppShita.data.utils;

import logisticsAppShita.data.model.User;
import logisticsAppShita.data.dto.requests.RegisterUserRequest;
import logisticsAppShita.data.dto.responses.RegisterUserResponse;

public class Mapper {

        public static User map(RegisterUserRequest request){
            User newUser = new User();
            newUser.setFirstName(request.getFirstName());
            newUser.setLastName(request.getLastName());
            newUser.setEmail(request.getEmail());
            newUser.setPhoneNumber(request.getPhoneNumber());
            newUser.setAddress(request.getAddress());
            return  newUser;
        }

        public static RegisterUserResponse map(User savedUser){
            RegisterUserResponse response = new RegisterUserResponse();
            response.setId(savedUser.getId());
            response.setFirstName(savedUser.getFirstName());
            return response;
        }
    }

