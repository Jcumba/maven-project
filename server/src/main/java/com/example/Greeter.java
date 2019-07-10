package com.example;

/**
 * Esta es la clase.
 */
public class Greeter {

  /**
   * Este es el constructor.
   */
  public Greeter() {

  }

    /**
   * @param someone variable creada
   * @return retorna
   */
  public final String greet(final String someone) {
    return String.format("Hola, %s!", someone);
  }
}
