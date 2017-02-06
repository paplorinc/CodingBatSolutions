package string_1;

import spock.lang.Specification

class MakeTagsTest extends Specification {
  def 'makeTags'() {
    setup:
      def subject = new MakeTags()
    expect:
      subject.makeTags('i', 'Yay') == "<i>Yay</i>"
      subject.makeTags('i', 'Hello') == "<i>Hello</i>"
      subject.makeTags('cite', 'Yay') == "<cite>Yay</cite>"
      subject.makeTags('address', 'here') == "<address>here</address>"
      subject.makeTags('body', 'Heart') == "<body>Heart</body>"
      subject.makeTags('i', 'i') == "<i>i</i>"
      subject.makeTags('i', '') == "<i></i>"
  }
}

