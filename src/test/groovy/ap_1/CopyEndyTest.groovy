package ap_1;

import spock.lang.Specification

class CopyEndyTest extends Specification {
  def 'copyEndy'() {
    setup:
      def subject = new CopyEndy()
    expect:
      subject.copyEndy([9, 11, 90, 22, 6] as int[], 2) == [9, 90]
      subject.copyEndy([9, 11, 90, 22, 6] as int[], 3) == [9, 90, 6]
      subject.copyEndy([12, 1, 1, 13, 0, 20] as int[], 2) == [1, 1]
      subject.copyEndy([12, 1, 1, 13, 0, 20] as int[], 3) == [1, 1, 0]
      subject.copyEndy([0] as int[], 1) == [0]
      subject.copyEndy([10, 11, 90] as int[], 2) == [10, 90]
      subject.copyEndy([90, 22, 100] as int[], 2) == [90, 100]
      subject.copyEndy([12, 11, 10, 89, 101, 4] as int[], 1) == [10]
      subject.copyEndy([13, 2, 2, 0] as int[], 2) == [2, 2]
      subject.copyEndy([13, 2, 2, 0] as int[], 3) == [2, 2, 0]
      subject.copyEndy([13, 2, 13, 2, 0, 30] as int[], 2) == [2, 2]
      subject.copyEndy([13, 2, 13, 2, 0, 30] as int[], 3) == [2, 2, 0]
  }
}

