package io.github.andylke.demo.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/messages")
public class MessageRestController {

  @GetMapping
  public Message getMessage(@RequestParam final String text) {
    final Message message = new Message();
    message.setText(text);
    return message;
  }
}
