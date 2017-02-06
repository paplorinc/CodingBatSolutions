package logic_1;

import spock.lang.Specification

class FizzString2Test extends Specification {
  def 'fizzString2'() {
    setup:
      def subject = new FizzString2()
    expect:
      subject.fizzString2(1) == "1!"
      subject.fizzString2(2) == "2!"
      subject.fizzString2(3) == "Fizz!"
      subject.fizzString2(4) == "4!"
      subject.fizzString2(5) == "Buzz!"
      subject.fizzString2(6) == "Fizz!"
      subject.fizzString2(7) == "7!"
      subject.fizzString2(8) == "8!"
      subject.fizzString2(9) == "Fizz!"
      subject.fizzString2(15) == "FizzBuzz!"
      subject.fizzString2(16) == "16!"
      subject.fizzString2(18) == "Fizz!"
      subject.fizzString2(19) == "19!"
      subject.fizzString2(21) == "Fizz!"
      subject.fizzString2(44) == "44!"
      subject.fizzString2(45) == "FizzBuzz!"
      subject.fizzString2(100) == "Buzz!"
  }
}

