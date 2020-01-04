package io.stockgeeks.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/api")
public class HelloSpringRest {

  @GetMapping("/hello")
  public String hello(@PathParam("name") String name) {
    return "Hello, " + name;
  }
}
