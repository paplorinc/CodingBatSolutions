package array_2;

import spock.lang.Specification

class Lucky13Test extends Specification {
  def 'lucky13'() {
    setup:
      def subject = new Lucky13()
    expect:
      subject.lucky13([0, 2, 4] as int[]) == true
      subject.lucky13([1, 2, 3] as int[]) == false
      subject.lucky13([1, 2, 4] as int[]) == false
      subject.lucky13([2, 7, 2, 8] as int[]) == true
      subject.lucky13([2, 7, 1, 8] as int[]) == false
      subject.lucky13([3, 7, 2, 8] as int[]) == false
      subject.lucky13([2, 7, 2, 1] as int[]) == false
      subject.lucky13([1, 2] as int[]) == false
      subject.lucky13([2, 2] as int[]) == true
      subject.lucky13([2] as int[]) == true
      subject.lucky13([3] as int[]) == false
      subject.lucky13([] as int[]) == true
  }
}

