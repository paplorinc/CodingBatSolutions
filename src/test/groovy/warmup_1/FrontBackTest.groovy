package warmup_1;

import spock.lang.Specification

class FrontBackTest extends Specification {
  def 'frontBack'() {
    setup:
      def subject = new FrontBack()
    expect:
      subject.frontBack('code') == "eodc"
      subject.frontBack('a') == "a"
      subject.frontBack('ab') == "ba"
      subject.frontBack('abc') == "cba"
      subject.frontBack('') == ""
      subject.frontBack('Chocolate') == "ehocolatC"
      subject.frontBack('aavJ') == "Java"
      subject.frontBack('hello') == "oellh"
  }
}

