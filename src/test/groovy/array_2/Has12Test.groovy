package array_2;

import spock.lang.Specification

class Has12Test extends Specification {
  def 'has12'() {
    setup:
      def subject = new Has12()
    expect:
      subject.has12([1, 3, 2] as int[]) == true
      subject.has12([3, 1, 2] as int[]) == true
      subject.has12([3, 1, 4, 5, 2] as int[]) == true
      subject.has12([3, 1, 4, 5, 6] as int[]) == false
      subject.has12([3, 1, 4, 1, 6, 2] as int[]) == true
      subject.has12([2, 1, 4, 1, 6, 2] as int[]) == true
      subject.has12([2, 1, 4, 1, 6] as int[]) == false
      subject.has12([1] as int[]) == false
      subject.has12([2, 1, 3] as int[]) == false
      subject.has12([2, 1, 3, 2] as int[]) == true
      subject.has12([2] as int[]) == false
      subject.has12([3, 2] as int[]) == false
      subject.has12([3, 1, 3, 2] as int[]) == true
      subject.has12([3, 5, 9] as int[]) == false
      subject.has12([3, 5, 1] as int[]) == false
      subject.has12([3, 2, 1] as int[]) == false
      subject.has12([1, 2] as int[]) == true
  }
}

