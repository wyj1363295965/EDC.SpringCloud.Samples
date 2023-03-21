package com.mbps.cd.userservice.web;

import com.mbps.cd.userservice.domain.User;
import com.mbps.cd.userservice.domain.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EdisonZhou
 */
@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable Long id) {

        User result = userRepository.findOne(id);
        log.info("result:{}", result);
        return result;
    }
}
