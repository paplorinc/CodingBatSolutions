package array_2;

import spock.lang.Specification

class Has77Test extends Specification {
  def 'has77'() {
    setup:
      def subject = new Has77()
    expect:
      subject.has77([1, 7, 7] as int[]) == true
      subject.has77([1, 7, 1, 7] as int[]) == true
      subject.has77([1, 7, 1, 1, 7] as int[]) == false
      subject.has77([7, 7, 1, 1, 7] as int[]) == true
      subject.has77([2, 7, 2, 2, 7, 2] as int[]) == false
      subject.has77([2, 7, 2, 2, 7, 7] as int[]) == true
      subject.has77([7, 2, 7, 2, 2, 7] as int[]) == true
      subject.has77([7, 2, 6, 2, 2, 7] as int[]) == false
      subject.has77([7, 7, 7] as int[]) == true
      subject.has77([7, 1, 7] as int[]) == true
      subject.has77([7, 1, 1] as int[]) == false
      subject.has77([1, 2] as int[]) == false
      subject.has77([1, 7] as int[]) == false
      subject.has77([7] as int[]) == false
  }
}

