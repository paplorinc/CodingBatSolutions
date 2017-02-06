package array_1;

import spock.lang.Specification

class RotateLeft3Test extends Specification {
  def 'rotateLeft3'() {
    setup:
      def subject = new RotateLeft3()
    expect:
      subject.rotateLeft3([1, 2, 3] as int[]) == [2, 3, 1]
      subject.rotateLeft3([5, 11, 9] as int[]) == [11, 9, 5]
      subject.rotateLeft3([7, 0, 0] as int[]) == [0, 0, 7]
      subject.rotateLeft3([1, 2, 1] as int[]) == [2, 1, 1]
      subject.rotateLeft3([0, 0, 1] as int[]) == [0, 1, 0]
  }
}

