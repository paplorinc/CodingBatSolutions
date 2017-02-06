package logic_1;

import spock.lang.Specification

class FizzStringTest extends Specification {
  def 'fizzString'() {
    setup:
      def subject = new FizzString()
    expect:
      subject.fizzString('fig') == "Fizz"
      subject.fizzString('dib') == "Buzz"
      subject.fizzString('fib') == "FizzBuzz"
      subject.fizzString('abc') == "abc"
      subject.fizzString('fooo') == "Fizz"
      subject.fizzString('booo') == "booo"
      subject.fizzString('ooob') == "Buzz"
      subject.fizzString('fooob') == "FizzBuzz"
      subject.fizzString('f') == "Fizz"
      subject.fizzString('b') == "Buzz"
      subject.fizzString('abcb') == "Buzz"
      subject.fizzString('Hello') == "Hello"
      subject.fizzString('Hellob') == "Buzz"
      subject.fizzString('af') == "af"
      subject.fizzString('bf') == "bf"
      subject.fizzString('fb') == "FizzBuzz"
  }
}

