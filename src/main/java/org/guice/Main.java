package org.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.guice.module.AppModule;
import org.guice.service.UserService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create Guice injector with AppModule
        Injector injector = Guice.createInjector(new AppModule());

        // Get UserService instance from injector
        UserService userService = injector.getInstance(UserService.class);

        userService.createUser("LakshithaW");
    }
}