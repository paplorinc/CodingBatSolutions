package logic_2;

import spock.lang.Specification

class BlackjackTest extends Specification {
  def 'blackjack'() {
    setup:
      def subject = new Blackjack()
    expect:
      subject.blackjack(19, 21) == 21
      subject.blackjack(21, 19) == 21
      subject.blackjack(19, 22) == 19
      subject.blackjack(22, 19) == 19
      subject.blackjack(22, 50) == 0
      subject.blackjack(22, 22) == 0
      subject.blackjack(33, 1) == 1
      subject.blackjack(1, 2) == 2
      subject.blackjack(34, 33) == 0
      subject.blackjack(17, 19) == 19
      subject.blackjack(18, 17) == 18
      subject.blackjack(16, 23) == 16
      subject.blackjack(3, 4) == 4
      subject.blackjack(3, 2) == 3
      subject.blackjack(21, 20) == 21
  }
}

