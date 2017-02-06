package array_2;

import spock.lang.Specification

class TenRunTest extends Specification {
  def 'tenRun'() {
    setup:
      def subject = new TenRun()
    expect:
      subject.tenRun([2, 10, 3, 4, 20, 5] as int[]) == [2, 10, 10, 10, 20, 20]
      subject.tenRun([10, 1, 20, 2] as int[]) == [10, 10, 20, 20]
      subject.tenRun([10, 1, 9, 20] as int[]) == [10, 10, 10, 20]
      subject.tenRun([1, 2, 50, 1] as int[]) == [1, 2, 50, 50]
      subject.tenRun([1, 20, 50, 1] as int[]) == [1, 20, 50, 50]
      subject.tenRun([10, 10] as int[]) == [10, 10]
      subject.tenRun([10, 2] as int[]) == [10, 10]
      subject.tenRun([0, 2] as int[]) == [0, 0]
      subject.tenRun([1, 2] as int[]) == [1, 2]
      subject.tenRun([1] as int[]) == [1]
      subject.tenRun([] as int[]) == []
  }
}

