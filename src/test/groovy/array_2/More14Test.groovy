package array_2;

import spock.lang.Specification

class More14Test extends Specification {
  def 'more14'() {
    setup:
      def subject = new More14()
    expect:
      subject.more14([1, 4, 1] as int[]) == true
      subject.more14([1, 4, 1, 4] as int[]) == false
      subject.more14([1, 1] as int[]) == true
      subject.more14([1, 6, 6] as int[]) == true
      subject.more14([1] as int[]) == true
      subject.more14([1, 4] as int[]) == false
      subject.more14([6, 1, 1] as int[]) == true
      subject.more14([1, 6, 4] as int[]) == false
      subject.more14([1, 1, 4, 4, 1] as int[]) == true
      subject.more14([1, 1, 6, 4, 4, 1] as int[]) == true
      subject.more14([] as int[]) == false
      subject.more14([4, 1, 4, 6] as int[]) == false
      subject.more14([4, 1, 4, 6, 1] as int[]) == false
      subject.more14([1, 4, 1, 4, 1, 6] as int[]) == true
  }
}

