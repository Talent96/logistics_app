package logisticsAppShita.data.service;

import logisticsAppShita.data.model.User;
import logisticsAppShita.data.repository.UserRepository;
import logisticsAppShita.data.dto.requests.RegisterUserRequest;
import logisticsAppShita.data.dto.responses.RegisterUserResponse;
import logisticsAppShita.data.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService{

  @Autowired
  private UserRepository userRepository;

    @Override
    public RegisterUserResponse registerNewUser(RegisterUserRequest request) {
        User user = Mapper.map(request);
        User savedUser = userRepository.save(user);


        return Mapper.map(savedUser);
    }

    @Override
    public User findUser(String id) {
        return userRepository.findById(id).get();

    }

//    private User map(RegisterUserRequest request){
//        User newUser = new User();
//        newUser.setFirstName(request.getFirstName());
//        newUser.setLastName(request.getLastName());
//        newUser.setEmail(request.getEmail());
//        newUser.setAddress(request.getAddress());
//        newUser.setPhoneNumber(request.getPhoneNumber());
//        return newUser;
//    }
}
