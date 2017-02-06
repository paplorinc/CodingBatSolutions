package logic_1;

import spock.lang.Specification

class AnswerCellTest extends Specification {
  def 'answerCell'() {
    setup:
      def subject = new AnswerCell()
    expect:
      subject.answerCell(false, false, false) == true
      subject.answerCell(false, false, true) == false
      subject.answerCell(true, false, false) == false
      subject.answerCell(true, true, false) == true
      subject.answerCell(false, true, false) == true
      subject.answerCell(true, true, true) == false
  }
}

