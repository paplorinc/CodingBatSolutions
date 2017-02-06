package string_1;

import spock.lang.Specification

class EndsLyTest extends Specification {
  def 'endsLy'() {
    setup:
      def subject = new EndsLy()
    expect:
      subject.endsLy('oddly') == true
      subject.endsLy('y') == false
      subject.endsLy('oddy') == false
      subject.endsLy('oddl') == false
      subject.endsLy('olydd') == false
      subject.endsLy('ly') == true
      subject.endsLy('') == false
      subject.endsLy('falsey') == false
      subject.endsLy('evenly') == true
  }
}

