package recursion_1;

import spock.lang.Specification

class AllStarTest extends Specification {
  def 'allStar'() {
    setup:
      def subject = new AllStar()
    expect:
      subject.allStar('hello') == "h*e*l*l*o"
      subject.allStar('abc') == "a*b*c"
      subject.allStar('ab') == "a*b"
      subject.allStar('a') == "a"
      subject.allStar('') == ""
      subject.allStar('3.14') == "3*.*1*4"
      subject.allStar('Chocolate') == "C*h*o*c*o*l*a*t*e"
      subject.allStar('1234') == "1*2*3*4"
  }
}

