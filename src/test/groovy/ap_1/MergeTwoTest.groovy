package ap_1;

import spock.lang.Specification

class MergeTwoTest extends Specification {
  def 'mergeTwo'() {
    setup:
      def subject = new MergeTwo()
    expect:
      subject.mergeTwo(['a', 'c', 'z'] as String[], ['b', 'f', 'z'] as String[], 3) == ["a", "b", "c"]
      subject.mergeTwo(['a', 'c', 'z'] as String[], ['c', 'f', 'z'] as String[], 3) == ["a", "c", "f"]
      subject.mergeTwo(['f', 'g', 'z'] as String[], ['c', 'f', 'g'] as String[], 3) == ["c", "f", "g"]
      subject.mergeTwo(['a', 'c', 'z'] as String[], ['a', 'c', 'z'] as String[], 3) == ["a", "c", "z"]
      subject.mergeTwo(['a', 'b', 'c', 'z'] as String[], ['a', 'c', 'z'] as String[], 3) == ["a", "b", "c"]
      subject.mergeTwo(['a', 'c', 'z'] as String[], ['a', 'b', 'c', 'z'] as String[], 3) == ["a", "b", "c"]
      subject.mergeTwo(['a', 'c', 'z'] as String[], ['a', 'c', 'z'] as String[], 2) == ["a", "c"]
      subject.mergeTwo(['a', 'c', 'z'] as String[], ['a', 'c', 'y', 'z'] as String[], 3) == ["a", "c", "y"]
      subject.mergeTwo(['x', 'y', 'z'] as String[], ['a', 'b', 'z'] as String[], 3) == ["a", "b", "x"]
  }
}

