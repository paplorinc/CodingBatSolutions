package array_2;

import spock.lang.Specification

class Has22Test extends Specification {
  def 'has22'() {
    setup:
      def subject = new Has22()
    expect:
      subject.has22([1, 2, 2] as int[]) == true
      subject.has22([1, 2, 1, 2] as int[]) == false
      subject.has22([2, 1, 2] as int[]) == false
      subject.has22([2, 2, 1, 2] as int[]) == true
      subject.has22([1, 3, 2] as int[]) == false
      subject.has22([1, 3, 2, 2] as int[]) == true
      subject.has22([2, 3, 2, 2] as int[]) == true
      subject.has22([4, 2, 4, 2, 2, 5] as int[]) == true
      subject.has22([1, 2] as int[]) == false
      subject.has22([2, 2] as int[]) == true
      subject.has22([2] as int[]) == false
      subject.has22([] as int[]) == false
      subject.has22([3, 3, 2, 2] as int[]) == true
      subject.has22([5, 2, 5, 2] as int[]) == false
  }
}

