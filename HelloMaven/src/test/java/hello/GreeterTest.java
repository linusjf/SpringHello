/**
 * @author      : Linus Fernandes (linusfernandes at gmail dot com)
 * @file        : GreeterTest
 * @created     : Saturday May 13, 2023 21:10:27 IST
 */
package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {
  private Greeter greeter = new Greeter();

  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }
}
