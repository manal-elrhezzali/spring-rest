package com.manal.springrest.controller;

import com.manal.springrest.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

  //this tells Spring that we are returning a response body
  //and spring will convert our message object into a
  //JSON message
  @ResponseBody
  @GetMapping("/message")
  //to return a JSON message with the content we need a model class for that
  Message send() {
    return new Message("first message");
  }

}
