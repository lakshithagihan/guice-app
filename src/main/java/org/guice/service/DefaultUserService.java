package org.guice.service;

import com.google.inject.Inject;
import org.guice.repository.UserRepository;

public class DefaultUserService implements UserService{

    private UserRepository userRepository;

    @Inject
    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(String username) {
        userRepository.saveUser(username);
    }
}
