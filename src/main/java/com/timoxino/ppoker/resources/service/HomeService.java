package com.timoxino.ppoker.resources.service;

import com.timoxino.ppoker.resources.model.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class represents RESTful service to work with {@link Message} entity.
 *
 * @author Tsimafei Shchytkavets
 */
@RestController
public class HomeService
{
    @RequestMapping("/")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public Message home()
    {
        return new Message("Hello!");
    }
}
