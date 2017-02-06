package ap_1;

import spock.lang.Specification

class MatchUpTest extends Specification {
  def 'matchUp'() {
    setup:
      def subject = new MatchUp()
    expect:
      subject.matchUp(['aa', 'bb', 'cc'] as String[], ['aaa', 'xx', 'bb'] as String[]) == 1
      subject.matchUp(['aa', 'bb', 'cc'] as String[], ['aaa', 'b', 'bb'] as String[]) == 2
      subject.matchUp(['aa', 'bb', 'cc'] as String[], ['', '', 'ccc'] as String[]) == 1
      subject.matchUp(['', '', 'ccc'] as String[], ['aa', 'bb', 'cc'] as String[]) == 1
      subject.matchUp(['', '', ''] as String[], ['', 'bb', 'cc'] as String[]) == 0
      subject.matchUp(['aa', 'bb', 'cc'] as String[], ['', '', ''] as String[]) == 0
      subject.matchUp(['aa', '', 'ccc'] as String[], ['', 'bb', 'cc'] as String[]) == 1
      subject.matchUp(['x', 'y', 'z'] as String[], ['y', 'z', 'x'] as String[]) == 0
      subject.matchUp(['', 'y', 'z'] as String[], ['', 'y', 'x'] as String[]) == 1
      subject.matchUp(['x', 'y', 'z'] as String[], ['xx', 'yyy', 'zzz'] as String[]) == 3
      subject.matchUp(['x', 'y', 'z'] as String[], ['xx', 'yyy', ''] as String[]) == 2
      subject.matchUp(['b', 'x', 'y', 'z'] as String[], ['a', 'xx', 'yyy', 'zzz'] as String[]) == 3
      subject.matchUp(['aaa', 'bb', 'c'] as String[], ['aaa', 'xx', 'bb'] as String[]) == 1
  }
}

