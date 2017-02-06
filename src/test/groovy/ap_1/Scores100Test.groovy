package ap_1;

import spock.lang.Specification

class Scores100Test extends Specification {
  def 'scores100'() {
    setup:
      def subject = new Scores100()
    expect:
      subject.scores100([1, 100, 100] as int[]) == true
      subject.scores100([1, 100, 99, 100] as int[]) == false
      subject.scores100([100, 1, 100, 100] as int[]) == true
      subject.scores100([100, 1, 100, 1] as int[]) == false
      subject.scores100([1, 2, 3, 4, 5] as int[]) == false
      subject.scores100([1, 2, 100, 4, 5] as int[]) == false
  }
}

