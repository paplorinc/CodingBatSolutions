package warmup_2;

import spock.lang.Specification

class CountXXTest extends Specification {
  def 'countXX'() {
    setup:
      def subject = new CountXX()
    expect:
      subject.countXX('abcxx') == 1
      subject.countXX('xxx') == 2
      subject.countXX('xxxx') == 3
      subject.countXX('abc') == 0
      subject.countXX('Hello there') == 0
      subject.countXX('Hexxo thxxe') == 2
      subject.countXX('') == 0
      subject.countXX('Kittens') == 0
      subject.countXX('Kittensxxx') == 2
  }
}

