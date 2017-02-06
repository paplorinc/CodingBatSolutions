package string_2;

import spock.lang.Specification

class OneTwoTest extends Specification {
  def 'oneTwo'() {
    setup:
      def subject = new OneTwo()
    expect:
      subject.oneTwo('abc') == "bca"
      subject.oneTwo('tca') == "cat"
      subject.oneTwo('tcagdo') == "catdog"
      subject.oneTwo('chocolate') == "hocolctea"
      subject.oneTwo('1234567890') == "231564897"
      subject.oneTwo('xabxabxabxabxabxabxab') == "abxabxabxabxabxabxabx"
      subject.oneTwo('abcdefx') == "bcaefd"
      subject.oneTwo('abcdefxy') == "bcaefd"
      subject.oneTwo('abcdefxyz') == "bcaefdyzx"
      subject.oneTwo('') == ""
      subject.oneTwo('x') == ""
      subject.oneTwo('xy') == ""
      subject.oneTwo('xyz') == "yzx"
      subject.oneTwo('abcdefghijklkmnopqrstuvwxyz1234567890') == "bcaefdhigkljmnkpqostrvwuyzx231564897"
      subject.oneTwo('abcdefghijklkmnopqrstuvwxyz123456789') == "bcaefdhigkljmnkpqostrvwuyzx231564897"
      subject.oneTwo('abcdefghijklkmnopqrstuvwxyz12345678') == "bcaefdhigkljmnkpqostrvwuyzx231564"
  }
}

