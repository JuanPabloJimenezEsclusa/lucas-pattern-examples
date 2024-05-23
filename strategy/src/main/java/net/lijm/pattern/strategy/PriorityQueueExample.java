package net.lijm.pattern.strategy;

import java.io.IOException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class PriorityQueueExample {
  private static final Logger logger = Logger.getLogger(PriorityQueueExample.class.getName());

  public static void main(String[] args) throws IOException {
    LogManager.getLogManager()
      .readConfiguration(Objects
        .requireNonNull(PriorityQueueExample.class.getClassLoader().getResource("logging.properties"))
        .openStream());

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b) -> {
      logger.info("a:" + a + ",b:" + b + ",compare:" + a.compareTo(b));
      return a.compareTo(b);
    });

    priorityQueue.offer(5);
    priorityQueue.offer(2);
    priorityQueue.offer(8);
    priorityQueue.offer(1);
    priorityQueue.offer(3);

    logger.info("Priority Queue: " + priorityQueue);

    while (!priorityQueue.isEmpty()) {
      logger.info("Item deleted: " + priorityQueue.poll());
      logger.info("Priority Queue updated: " + priorityQueue);
    }
  }
}
