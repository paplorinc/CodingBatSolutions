package string_2;

import spock.lang.Specification

class RepeatSeparatorTest extends Specification {
  def 'repeatSeparator'() {
    setup:
      def subject = new RepeatSeparator()
    expect:
      subject.repeatSeparator('Word', 'X', 3) == "WordXWordXWord"
      subject.repeatSeparator('This', 'And', 2) == "ThisAndThis"
      subject.repeatSeparator('This', 'And', 1) == "This"
      subject.repeatSeparator('Hi', '-n-', 2) == "Hi-n-Hi"
      subject.repeatSeparator('AAA', '', 1) == "AAA"
      subject.repeatSeparator('AAA', '', 0) == ""
      subject.repeatSeparator('A', 'B', 5) == "ABABABABA"
      subject.repeatSeparator('abc', 'XX', 3) == "abcXXabcXXabc"
      subject.repeatSeparator('abc', 'XX', 2) == "abcXXabc"
      subject.repeatSeparator('abc', 'XX', 1) == "abc"
      subject.repeatSeparator('XYZ', 'a', 2) == "XYZaXYZ"
  }
}

