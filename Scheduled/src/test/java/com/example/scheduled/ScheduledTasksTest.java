/**
 * @author      : Linus Fernandes (linusfernandes at gmail dot com)
 * @file        : ScheduledTasksTest
 * @created     : Saturday May 13, 2023 11:15:47 IST
 */
package com.example.scheduled;

import org.awaitility.Durations;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class ScheduledTasksTest {

  @SpyBean
  ScheduledTasks tasks;

  @Test
  public void reportCurrentTime() {
    await().atMost(Durations.TEN_SECONDS).untilAsserted(() -> {
      verify(tasks, atLeast(2)).reportCurrentTime();
    });
  }
}
