package string_2;

import spock.lang.Specification

class CatDogTest extends Specification {
  def 'catDog'() {
    setup:
      def subject = new CatDog()
    expect:
      subject.catDog('catdog') == true
      subject.catDog('catcat') == false
      subject.catDog('1cat1cadodog') == true
      subject.catDog('catxxdogxxxdog') == false
      subject.catDog('catxdogxdogxcat') == true
      subject.catDog('catxdogxdogxca') == false
      subject.catDog('dogdogcat') == false
      subject.catDog('dogogcat') == true
      subject.catDog('dog') == false
      subject.catDog('cat') == false
      subject.catDog('ca') == true
      subject.catDog('c') == true
      subject.catDog('') == true
  }
}

