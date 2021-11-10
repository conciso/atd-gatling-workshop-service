package de.conciso.atdgatlingwsservice;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GatlingController {

  private static final Random RANDOM = new Random();
  private static final int UPPER_BOUND = 1337;
  private static final Duration DELAY_WARMUP_SECONDS = Duration.ofSeconds(3);
  private static final Duration DELAY_SECONDS = Duration.ofSeconds(1);
  private static final int WARMUP_REQUEST_COUNT = 5;

  private AtomicInteger requestCount = new AtomicInteger();

  @GetMapping("/test")
  @ResponseBody
  public int getRandomNumber() throws InterruptedException {
    long delay = (requestCount.incrementAndGet() > WARMUP_REQUEST_COUNT) ? DELAY_SECONDS.toMillis() : DELAY_WARMUP_SECONDS.toMillis();
    Thread.sleep(delay);

    return RANDOM.nextInt(UPPER_BOUND);
  }
}
