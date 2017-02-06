package array_2;

import spock.lang.Specification

class Either24Test extends Specification {
  def 'either24'() {
    setup:
      def subject = new Either24()
    expect:
      subject.either24([1, 2, 2] as int[]) == true
      subject.either24([4, 4, 1] as int[]) == true
      subject.either24([4, 4, 1, 2, 2] as int[]) == false
      subject.either24([1, 2, 3, 4] as int[]) == false
      subject.either24([3, 5, 9] as int[]) == false
      subject.either24([1, 2, 3, 4, 4] as int[]) == true
      subject.either24([2, 2, 3, 4] as int[]) == true
      subject.either24([1, 2, 3, 2, 2, 4] as int[]) == true
      subject.either24([1, 2, 3, 2, 2, 4, 4] as int[]) == false
      subject.either24([1, 2] as int[]) == false
      subject.either24([2, 2] as int[]) == true
      subject.either24([4, 4] as int[]) == true
      subject.either24([2] as int[]) == false
      subject.either24([] as int[]) == false
  }
}

