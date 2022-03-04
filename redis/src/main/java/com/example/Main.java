package com.example;

import com.tersesystems.echopraxia.*;

public class Main {

  public static void main(String[] args) {
    Logger<?> logger = LoggerFactory.getLogger(Main.class);

    logger.error("logging an error");
    logger.warn("logging a warning");
    logger.info("logging info");
    logger.debug("logging debug");
    logger.trace("logging trace");
  }

}
