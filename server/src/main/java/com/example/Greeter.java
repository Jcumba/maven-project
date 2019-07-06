package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

    /**
   * @param el nombre del parametro
   * @return retorna el String
   */
  public final String greet(final String someone) {
    return String.format("Hola, %s!", someone);
  }
}
