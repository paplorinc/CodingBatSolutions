package recursion_1;

import spock.lang.Specification

class ParenBitTest extends Specification {
  def 'parenBit'() {
    setup:
      def subject = new ParenBit()
    expect:
      subject.parenBit('xyz(abc)123') == "(abc)"
      subject.parenBit('x(hello)') == "(hello)"
      subject.parenBit('(xy)1') == "(xy)"
      subject.parenBit('not really (possible)') == "(possible)"
      subject.parenBit('(abc)') == "(abc)"
      subject.parenBit('(abc)xyz') == "(abc)"
      subject.parenBit('(abc)x') == "(abc)"
      subject.parenBit('(x)') == "(x)"
      subject.parenBit('()') == "()"
      subject.parenBit('res (ipsa) loquitor') == "(ipsa)"
      subject.parenBit('hello(not really)there') == "(not really)"
      subject.parenBit('ab(ab)ab') == "(ab)"
  }
}

