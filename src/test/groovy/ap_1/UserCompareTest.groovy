package ap_1;

import spock.lang.Specification

class UserCompareTest extends Specification {
  def 'userCompare'() {
    setup:
      def subject = new UserCompare()
    expect:
      subject.userCompare('bb', 1, 'zz', 2) == -1
      subject.userCompare('bb', 1, 'aa', 2) == 1
      subject.userCompare('bb', 1, 'bb', 1) == 0
      subject.userCompare('bb', 5, 'bb', 1) == 1
      subject.userCompare('bb', 5, 'bb', 10) == -1
      subject.userCompare('adam', 1, 'bob', 2) == -1
      subject.userCompare('bob', 1, 'bob', 2) == -1
      subject.userCompare('bzb', 1, 'bob', 2) == 1
  }
}

