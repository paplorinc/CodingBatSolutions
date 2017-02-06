package warmup_1;

import spock.lang.Specification

class DelDelTest extends Specification {
  def 'delDel'() {
    setup:
      def subject = new DelDel()
    expect:
      subject.delDel('adelbc') == "abc"
      subject.delDel('adelHello') == "aHello"
      subject.delDel('adedbc') == "adedbc"
      subject.delDel('abcdel') == "abcdel"
      subject.delDel('add') == "add"
      subject.delDel('ad') == "ad"
      subject.delDel('a') == "a"
      subject.delDel('') == ""
      subject.delDel('del') == "del"
      subject.delDel('adel') == "a"
      subject.delDel('aadelbb') == "aadelbb"
  }
}

