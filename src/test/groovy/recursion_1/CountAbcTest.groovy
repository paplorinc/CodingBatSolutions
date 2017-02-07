package recursion_1;

import spock.lang.Specification

class CountAbcTest extends Specification {
  def 'countAbc'() {
    setup:
      def subject = new CountAbc()
    expect:
      subject.countAbc('abc') == 1
      subject.countAbc('abcxxabc') == 2
      subject.countAbc('abaxxaba') == 2
      subject.countAbc('ababc') == 2
      subject.countAbc('abxbc') == 0
      subject.countAbc('aaabc') == 1
      subject.countAbc('hello') == 0
      subject.countAbc('') == 0
      subject.countAbc('ab') == 0
      subject.countAbc('aba') == 1
      subject.countAbc('aca') == 0
      subject.countAbc('aaa') == 0
  }
}

