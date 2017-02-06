package string_1;

import spock.lang.Specification

class AtFirstTest extends Specification {
  def 'atFirst'() {
    setup:
      def subject = new AtFirst()
    expect:
      subject.atFirst('hello') == "he"
      subject.atFirst('hi') == "hi"
      subject.atFirst('h') == "h@"
      subject.atFirst('') == "@@"
      subject.atFirst('kitten') == "ki"
      subject.atFirst('java') == "ja"
      subject.atFirst('j') == "j@"
  }
}

