package ap_1;

import spock.lang.Specification

class CopyEvensTest extends Specification {
  def 'copyEvens'() {
    setup:
      def subject = new CopyEvens()
    expect:
      subject.copyEvens([3, 2, 4, 5, 8] as int[], 2) == [2, 4]
      subject.copyEvens([3, 2, 4, 5, 8] as int[], 3) == [2, 4, 8]
      subject.copyEvens([6, 1, 2, 4, 5, 8] as int[], 3) == [6, 2, 4]
      subject.copyEvens([6, 1, 2, 4, 5, 8] as int[], 4) == [6, 2, 4, 8]
      subject.copyEvens([3, 1, 4, 1, 5] as int[], 1) == [4]
      subject.copyEvens([2] as int[], 1) == [2]
      subject.copyEvens([6, 2, 4, 8] as int[], 2) == [6, 2]
      subject.copyEvens([6, 2, 4, 8] as int[], 3) == [6, 2, 4]
      subject.copyEvens([6, 2, 4, 8] as int[], 4) == [6, 2, 4, 8]
      subject.copyEvens([1, 8, 4] as int[], 1) == [8]
      subject.copyEvens([1, 8, 4] as int[], 2) == [8, 4]
      subject.copyEvens([2, 8, 4] as int[], 2) == [2, 8]
  }
}

