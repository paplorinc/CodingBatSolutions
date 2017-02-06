package logic_1;

import spock.lang.Specification

class DateFashionTest extends Specification {
  def 'dateFashion'() {
    setup:
      def subject = new DateFashion()
    expect:
      subject.dateFashion(5, 10) == 2
      subject.dateFashion(5, 2) == 0
      subject.dateFashion(5, 5) == 1
      subject.dateFashion(3, 3) == 1
      subject.dateFashion(10, 2) == 0
      subject.dateFashion(2, 9) == 0
      subject.dateFashion(9, 9) == 2
      subject.dateFashion(10, 5) == 2
      subject.dateFashion(2, 2) == 0
      subject.dateFashion(3, 7) == 1
      subject.dateFashion(2, 7) == 0
      subject.dateFashion(6, 2) == 0
  }
}

