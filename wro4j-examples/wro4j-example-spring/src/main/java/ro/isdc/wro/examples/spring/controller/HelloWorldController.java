package ro.isdc.wro.examples.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloWorldController {

  @RequestMapping("/spring")
  public String getHello() {
    return "hello/main";
  }
}
