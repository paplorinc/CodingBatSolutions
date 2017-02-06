package string_3;

import spock.lang.Specification

class NotReplaceTest extends Specification {
  def 'notReplace'() {
    setup:
      def subject = new NotReplace()
    expect:
      subject.notReplace('is test') == "is not test"
      subject.notReplace('is-is') == "is not-is not"
      subject.notReplace('This is right') == "This is not right"
      subject.notReplace('This is isabell') == "This is not isabell"
      subject.notReplace('') == ""
      subject.notReplace('is') == "is not"
      subject.notReplace('isis') == "isis"
      subject.notReplace('Dis is bliss is') == "Dis is not bliss is not"
      subject.notReplace('is his') == "is not his"
      subject.notReplace('xis yis') == "xis yis"
      subject.notReplace('AAAis is') == "AAAis is not"
  }
}

