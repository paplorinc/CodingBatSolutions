package string_1;

import spock.lang.Specification

class DeFrontTest extends Specification {
  def 'deFront'() {
    setup:
      def subject = new DeFront()
    expect:
      subject.deFront('Hello') == "llo"
      subject.deFront('java') == "va"
      subject.deFront('away') == "aay"
      subject.deFront('axy') == "ay"
      subject.deFront('abc') == "abc"
      subject.deFront('xby') == "by"
      subject.deFront('ab') == "ab"
      subject.deFront('ax') == "a"
      subject.deFront('axb') == "ab"
      subject.deFront('aaa') == "aa"
      subject.deFront('xbc') == "bc"
      subject.deFront('bbb') == "bb"
      subject.deFront('bazz') == "zz"
      subject.deFront('ba') == ""
      subject.deFront('abxyz') == "abxyz"
      subject.deFront('hi') == ""
      subject.deFront('his') == "s"
      subject.deFront('xz') == ""
      subject.deFront('zzz') == "z"
  }
}

