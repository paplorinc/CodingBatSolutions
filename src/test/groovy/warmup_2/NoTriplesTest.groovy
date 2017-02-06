package warmup_2;

import spock.lang.Specification

class NoTriplesTest extends Specification {
  def 'noTriples'() {
    setup:
      def subject = new NoTriples()
    expect:
      subject.noTriples([1, 1, 2, 2, 1] as int[]) == true
      subject.noTriples([1, 1, 2, 2, 2, 1] as int[]) == false
      subject.noTriples([1, 1, 1, 2, 2, 2, 1] as int[]) == false
      subject.noTriples([1, 1, 2, 2, 1, 2, 1] as int[]) == true
      subject.noTriples([1, 2, 1] as int[]) == true
      subject.noTriples([1, 1, 1] as int[]) == false
      subject.noTriples([1, 1] as int[]) == true
      subject.noTriples([1] as int[]) == true
      subject.noTriples([] as int[]) == true
  }
}

