package string_3;

import spock.lang.Specification

class EqualIsNotTest extends Specification {
  def 'equalIsNot'() {
    setup:
      def subject = new EqualIsNot()
    expect:
      subject.equalIsNot('This is not') == false
      subject.equalIsNot('This is notnot') == true
      subject.equalIsNot('noisxxnotyynotxisi') == true
      subject.equalIsNot('noisxxnotyynotxsi') == false
      subject.equalIsNot('xxxyyyzzzintint') == true
      subject.equalIsNot('') == true
      subject.equalIsNot('isisnotnot') == true
      subject.equalIsNot('isisnotno7Not') == false
      subject.equalIsNot('isnotis') == false
      subject.equalIsNot('mis3notpotbotis') == false
  }
}

