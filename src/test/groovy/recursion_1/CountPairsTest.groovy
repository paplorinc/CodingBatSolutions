package recursion_1;

import spock.lang.Specification

class CountPairsTest extends Specification {
  def 'countPairs'() {
    setup:
      def subject = new CountPairs()
    expect:
      subject.countPairs('axa') == 1
      subject.countPairs('axax') == 2
      subject.countPairs('axbx') == 1
      subject.countPairs('hi') == 0
      subject.countPairs('hihih') == 3
      subject.countPairs('ihihhh') == 3
      subject.countPairs('ihjxhh') == 0
      subject.countPairs('') == 0
      subject.countPairs('a') == 0
      subject.countPairs('aa') == 0
      subject.countPairs('aaa') == 1
  }
}

