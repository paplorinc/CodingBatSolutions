package recursion_1;

import spock.lang.Specification

class StringCleanTest extends Specification {
  def 'stringClean'() {
    setup:
      def subject = new StringClean()
    expect:
      subject.stringClean('yyzzza') == "yza"
      subject.stringClean('abbbcdd') == "abcd"
      subject.stringClean('Hello') == "Helo"
      subject.stringClean('XXabcYY') == "XabcY"
      subject.stringClean('112ab445') == "12ab45"
      subject.stringClean('Hello Bookkeeper') == "Helo Bokeper"
  }
}

