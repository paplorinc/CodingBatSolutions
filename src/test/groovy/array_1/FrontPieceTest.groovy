package array_1;

import spock.lang.Specification

class FrontPieceTest extends Specification {
  def 'frontPiece'() {
    setup:
      def subject = new FrontPiece()
    expect:
      subject.frontPiece([1, 2, 3] as int[]) == [1, 2]
      subject.frontPiece([1, 2] as int[]) == [1, 2]
      subject.frontPiece([1] as int[]) == [1]
      subject.frontPiece([] as int[]) == []
      subject.frontPiece([6, 5, 0] as int[]) == [6, 5]
      subject.frontPiece([6, 5] as int[]) == [6, 5]
      subject.frontPiece([3, 1, 4, 1, 5] as int[]) == [3, 1]
      subject.frontPiece([6] as int[]) == [6]
  }
}

