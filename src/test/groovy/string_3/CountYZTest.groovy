package string_3;

import spock.lang.Specification

class CountYZTest extends Specification {
  def 'countYZ'() {
    setup:
      def subject = new CountYZ()
    expect:
      subject.countYZ('fez day') == 2
      subject.countYZ('day fez') == 2
      subject.countYZ('day fyyyz') == 2
      subject.countYZ('day yak') == 1
      subject.countYZ('day:yak') == 1
      subject.countYZ('!!day--yaz!!') == 2
      subject.countYZ('yak zak') == 0
      subject.countYZ('DAY abc XYZ') == 2
      subject.countYZ('aaz yyz my') == 3
      subject.countYZ('y2bz') == 2
      subject.countYZ('zxyx') == 0
  }
}

