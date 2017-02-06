package string_2;

import spock.lang.Specification

class EndOtherTest extends Specification {
  def 'endOther'() {
    setup:
      def subject = new EndOther()
    expect:
      subject.endOther('Hiabc', 'abc') == true
      subject.endOther('AbC', 'HiaBc') == true
      subject.endOther('abc', 'abXabc') == true
      subject.endOther('Hiabc', 'abcd') == false
      subject.endOther('Hiabc', 'bc') == true
      subject.endOther('Hiabcx', 'bc') == false
      subject.endOther('abc', 'abc') == true
      subject.endOther('xyz', '12xyz') == true
      subject.endOther('yz', '12xz') == false
      subject.endOther('Z', '12xz') == true
      subject.endOther('12', '12') == true
      subject.endOther('abcXYZ', 'abcDEF') == false
      subject.endOther('ab', 'ab12') == false
      subject.endOther('ab', '12ab') == true
  }
}

