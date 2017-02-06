package string_3;

import spock.lang.Specification

class MaxBlockTest extends Specification {
  def 'maxBlock'() {
    setup:
      def subject = new MaxBlock()
    expect:
      subject.maxBlock('hoopla') == 2
      subject.maxBlock('abbCCCddBBBxx') == 3
      subject.maxBlock('') == 0
      subject.maxBlock('xyz') == 1
      subject.maxBlock('xxyz') == 2
      subject.maxBlock('xyzz') == 2
      subject.maxBlock('abbbcbbbxbbbx') == 3
      subject.maxBlock('XXBBBbbxx') == 3
      subject.maxBlock('XXBBBBbbxx') == 4
      subject.maxBlock('XXBBBbbxxXXXX') == 4
      subject.maxBlock('XX2222BBBbbXX2222') == 4
  }
}

