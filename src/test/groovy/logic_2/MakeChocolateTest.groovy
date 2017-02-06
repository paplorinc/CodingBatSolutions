package logic_2;

import spock.lang.Specification

class MakeChocolateTest extends Specification {
  def 'makeChocolate'() {
    setup:
      def subject = new MakeChocolate()
    expect:
      subject.makeChocolate(4, 1, 9) == 4
      subject.makeChocolate(4, 1, 10) == -1
      subject.makeChocolate(4, 1, 7) == 2
      subject.makeChocolate(6, 2, 7) == 2
      subject.makeChocolate(4, 1, 5) == 0
      subject.makeChocolate(4, 1, 4) == 4
      subject.makeChocolate(5, 4, 9) == 4
      subject.makeChocolate(9, 3, 18) == 3
      subject.makeChocolate(3, 1, 9) == -1
      subject.makeChocolate(1, 2, 7) == -1
      subject.makeChocolate(1, 2, 6) == 1
      subject.makeChocolate(1, 2, 5) == 0
      subject.makeChocolate(6, 1, 10) == 5
      subject.makeChocolate(6, 1, 11) == 6
      subject.makeChocolate(6, 1, 12) == -1
      subject.makeChocolate(6, 1, 13) == -1
      subject.makeChocolate(6, 2, 10) == 0
      subject.makeChocolate(6, 2, 11) == 1
      subject.makeChocolate(6, 2, 12) == 2
      subject.makeChocolate(60, 100, 550) == 50
      subject.makeChocolate(1000, 1000000, 5000006) == 6
      subject.makeChocolate(7, 1, 12) == 7
      subject.makeChocolate(7, 1, 13) == -1
      subject.makeChocolate(7, 2, 13) == 3
  }
}

