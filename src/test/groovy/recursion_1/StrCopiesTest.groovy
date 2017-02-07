package recursion_1;

import spock.lang.Specification

class StrCopiesTest extends Specification {
  def 'strCopies'() {
    setup:
      def subject = new StrCopies()
    expect:
      subject.strCopies('catcowcat', 'cat', 2) == true
      subject.strCopies('catcowcat', 'cow', 2) == false
      subject.strCopies('catcowcat', 'cow', 1) == true
      subject.strCopies('iiijjj', 'i', 3) == true
      subject.strCopies('iiijjj', 'i', 4) == false
      subject.strCopies('iiijjj', 'ii', 2) == true
      subject.strCopies('iiijjj', 'ii', 3) == false
      subject.strCopies('iiijjj', 'x', 3) == false
      subject.strCopies('iiijjj', 'x', 0) == true
      subject.strCopies('iiiiij', 'iii', 3) == true
      subject.strCopies('iiiiij', 'iii', 4) == false
      subject.strCopies('ijiiiiij', 'iiii', 2) == true
      subject.strCopies('ijiiiiij', 'iiii', 3) == false
      subject.strCopies('dogcatdogcat', 'dog', 2) == true
  }
}

