package com.example;

import com.tersesystems.echopraxia.Logger;
import com.tersesystems.echopraxia.LoggerFactory;

public class Main {

  // Use JDK Mission Control to change this flag on the fly
  // https://github.com/openjdk/jmc#downloading-builds
  private static final Logger<?> logger = LoggerFactory.getLogger();

  public static void main(String[] args) throws Exception {
    while (true) {
      logger.info("This always logs");
      logger.debug("This only logs if testFlag is enabled");
    }
  }
}
