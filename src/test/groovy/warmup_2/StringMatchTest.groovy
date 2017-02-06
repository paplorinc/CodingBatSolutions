package warmup_2;

import spock.lang.Specification

class StringMatchTest extends Specification {
  def 'stringMatch'() {
    setup:
      def subject = new StringMatch()
    expect:
      subject.stringMatch('xxcaazz', 'xxbaaz') == 3
      subject.stringMatch('abc', 'abc') == 2
      subject.stringMatch('abc', 'axc') == 0
      subject.stringMatch('hello', 'he') == 1
      subject.stringMatch('he', 'hello') == 1
      subject.stringMatch('h', 'hello') == 0
      subject.stringMatch('', 'hello') == 0
      subject.stringMatch('aabbccdd', 'abbbxxd') == 1
      subject.stringMatch('aaxxaaxx', 'iaxxai') == 3
      subject.stringMatch('iaxxai', 'aaxxaaxx') == 3
  }
}

