package logic_1;

import spock.lang.Specification

class BlueTicketTest extends Specification {
  def 'blueTicket'() {
    setup:
      def subject = new BlueTicket()
    expect:
      subject.blueTicket(9, 1, 0) == 10
      subject.blueTicket(9, 2, 0) == 0
      subject.blueTicket(6, 1, 4) == 10
      subject.blueTicket(6, 1, 5) == 0
      subject.blueTicket(10, 0, 0) == 10
      subject.blueTicket(15, 0, 5) == 5
      subject.blueTicket(5, 15, 5) == 10
      subject.blueTicket(4, 11, 1) == 5
      subject.blueTicket(13, 2, 3) == 5
      subject.blueTicket(8, 4, 3) == 0
      subject.blueTicket(8, 4, 2) == 10
      subject.blueTicket(8, 4, 1) == 0
  }
}

