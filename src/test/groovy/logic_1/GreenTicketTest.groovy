package logic_1;

import spock.lang.Specification

class GreenTicketTest extends Specification {
  def 'greenTicket'() {
    setup:
      def subject = new GreenTicket()
    expect:
      subject.greenTicket(1, 2, 3) == 0
      subject.greenTicket(2, 2, 2) == 20
      subject.greenTicket(1, 1, 2) == 10
      subject.greenTicket(2, 1, 1) == 10
      subject.greenTicket(1, 2, 1) == 10
      subject.greenTicket(3, 2, 1) == 0
      subject.greenTicket(0, 0, 0) == 20
      subject.greenTicket(2, 0, 0) == 10
      subject.greenTicket(0, 9, 10) == 0
      subject.greenTicket(0, 10, 0) == 10
      subject.greenTicket(9, 9, 9) == 20
      subject.greenTicket(9, 0, 9) == 10
  }
}

