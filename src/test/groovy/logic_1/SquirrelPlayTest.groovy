package logic_1;

import spock.lang.Specification

class SquirrelPlayTest extends Specification {
  def 'squirrelPlay'() {
    setup:
      def subject = new SquirrelPlay()
    expect:
      subject.squirrelPlay(70, false) == true
      subject.squirrelPlay(95, false) == false
      subject.squirrelPlay(95, true) == true
      subject.squirrelPlay(90, false) == true
      subject.squirrelPlay(90, true) == true
      subject.squirrelPlay(50, false) == false
      subject.squirrelPlay(50, true) == false
      subject.squirrelPlay(100, false) == false
      subject.squirrelPlay(100, true) == true
      subject.squirrelPlay(105, true) == false
      subject.squirrelPlay(59, false) == false
      subject.squirrelPlay(59, true) == false
      subject.squirrelPlay(60, false) == true
  }
}

