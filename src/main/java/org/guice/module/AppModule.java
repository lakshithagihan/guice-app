package org.guice.module;

import com.google.inject.AbstractModule;
import org.guice.repository.UserRepository;
import org.guice.service.DefaultUserService;
import org.guice.service.UserService;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(UserService.class).to(DefaultUserService.class);
    }
}
