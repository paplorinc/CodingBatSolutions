package array_2;

import spock.lang.Specification

class FizzBuzzTest extends Specification {
  def 'fizzBuzz'() {
    setup:
      def subject = new FizzBuzz()
    expect:
      subject.fizzBuzz(1, 6) == ["1", "2", "Fizz", "4", "Buzz"]
      subject.fizzBuzz(1, 8) == ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
      subject.fizzBuzz(1, 11) == ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
      subject.fizzBuzz(1, 16) == ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]
      subject.fizzBuzz(1, 4) == ["1", "2", "Fizz"]
      subject.fizzBuzz(1, 2) == ["1"]
      subject.fizzBuzz(50, 56) == ["Buzz", "Fizz", "52", "53", "Fizz", "Buzz"]
      subject.fizzBuzz(15, 17) == ["FizzBuzz", "16"]
      subject.fizzBuzz(30, 36) == ["FizzBuzz", "31", "32", "Fizz", "34", "Buzz"]
      subject.fizzBuzz(1000, 1006) == ["Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"]
      subject.fizzBuzz(99, 102) == ["Fizz", "Buzz", "101"]
      subject.fizzBuzz(14, 20) == ["14", "FizzBuzz", "16", "17", "Fizz", "19"]
  }
}

