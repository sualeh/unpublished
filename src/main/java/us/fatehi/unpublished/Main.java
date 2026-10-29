/*
 * Unpublished
 * https://github.com/sualeh/unpublished
 * Copyright (c) 2026, Sualeh Fatehi.
 */

package us.fatehi.unpublished;

/**
 * Main entry point for the Unpublished application. This class is not meant to be instantiated and
 * serves as the application's entry point for the main method.
 */
public final class Main {

  /** Private constructor to prevent instantiation of this utility class. */
  private Main() {
    // Private constructor
  }

  /**
   * Main method - entry point for the application. Throws an UnknownError indicating that the
   * application is unpublished.
   *
   * @param args command-line arguments (not used)
   * @throws UnknownError always thrown to indicate unpublished status
   */
  public static void main(final String[] args) {
    throw new UnknownError("Unpublished");
  }
}
