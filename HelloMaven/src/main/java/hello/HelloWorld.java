/**
 * @author      : Linus Fernandes (linusfernandes at gmail dot com)
 * @file        : Hello
 * @created     : Saturday May 13, 2023 20:40:03 IST
 */

package hello;
import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
