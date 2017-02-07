package recursion_1;

import spock.lang.Specification

class ChangeXYTest extends Specification {
  def 'changeXY'() {
    setup:
      def subject = new ChangeXY()
    expect:
      subject.changeXY('codex') == "codey"
      subject.changeXY('xxhixx') == "yyhiyy"
      subject.changeXY('xhixhix') == "yhiyhiy"
      subject.changeXY('hiy') == "hiy"
      subject.changeXY('h') == "h"
      subject.changeXY('x') == "y"
      subject.changeXY('') == ""
      subject.changeXY('xxx') == "yyy"
      subject.changeXY('yyhxyi') == "yyhyyi"
      subject.changeXY('hihi') == "hihi"
  }
}

