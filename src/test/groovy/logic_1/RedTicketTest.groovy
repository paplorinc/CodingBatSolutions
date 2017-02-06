package logic_1;

import spock.lang.Specification

class RedTicketTest extends Specification {
  def 'redTicket'() {
    setup:
      def subject = new RedTicket()
    expect:
      subject.redTicket(2, 2, 2) == 10
      subject.redTicket(2, 2, 1) == 0
      subject.redTicket(0, 0, 0) == 5
      subject.redTicket(2, 0, 0) == 1
      subject.redTicket(1, 1, 1) == 5
      subject.redTicket(1, 2, 1) == 0
      subject.redTicket(1, 2, 0) == 1
      subject.redTicket(0, 2, 2) == 1
      subject.redTicket(1, 2, 2) == 1
      subject.redTicket(0, 2, 0) == 0
      subject.redTicket(1, 1, 2) == 0
  }
}

