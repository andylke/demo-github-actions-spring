package io.github.andylke.demo.message;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MessageTests {

  @Test
  void text() {
    final Message message = new Message();
    message.setText("foo");
    assertThat(message.getText()).isEqualTo("foo");
  }
}
