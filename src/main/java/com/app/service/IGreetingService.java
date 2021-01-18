package com.app.service;

import com.app.model.Greeting;
import com.app.model.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
