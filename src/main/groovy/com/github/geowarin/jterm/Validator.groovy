package com.github.geowarin.jterm

interface Validator {

  /**
   * @param input The input to validate
   * @return null if input is valid, an error message otherwise
   */
  String validate(String input)
}
