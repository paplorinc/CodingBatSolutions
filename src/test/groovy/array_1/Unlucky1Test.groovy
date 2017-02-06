package array_1;

import spock.lang.Specification

class Unlucky1Test extends Specification {
  def 'unlucky1'() {
    setup:
      def subject = new Unlucky1()
    expect:
      subject.unlucky1([1, 3, 4, 5] as int[]) == true
      subject.unlucky1([2, 1, 3, 4, 5] as int[]) == true
      subject.unlucky1([1, 1, 1] as int[]) == false
      subject.unlucky1([1, 3, 1] as int[]) == true
      subject.unlucky1([1, 1, 3] as int[]) == true
      subject.unlucky1([1, 2, 3] as int[]) == false
      subject.unlucky1([3, 3, 3] as int[]) == false
      subject.unlucky1([1, 3] as int[]) == true
      subject.unlucky1([1, 4] as int[]) == false
      subject.unlucky1([1] as int[]) == false
      subject.unlucky1([] as int[]) == false
      subject.unlucky1([1, 1, 1, 3, 1] as int[]) == false
      subject.unlucky1([1, 1, 3, 1, 1] as int[]) == true
      subject.unlucky1([1, 1, 1, 1, 3] as int[]) == true
      subject.unlucky1([1, 4, 1, 5] as int[]) == false
      subject.unlucky1([1, 1, 2, 3] as int[]) == false
      subject.unlucky1([2, 3, 2, 1] as int[]) == false
      subject.unlucky1([2, 3, 1, 3] as int[]) == true
      subject.unlucky1([1, 2, 3, 4, 1, 3] as int[]) == true
  }
}

