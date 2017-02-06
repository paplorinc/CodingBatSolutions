package warmup_2;

import spock.lang.Specification

class StringSplosionTest extends Specification {
  def 'stringSplosion'() {
    setup:
      def subject = new StringSplosion()
    expect:
      subject.stringSplosion('Code') == "CCoCodCode"
      subject.stringSplosion('abc') == "aababc"
      subject.stringSplosion('ab') == "aab"
      subject.stringSplosion('x') == "x"
      subject.stringSplosion('fade') == "ffafadfade"
      subject.stringSplosion('There') == "TThTheTherThere"
      subject.stringSplosion('Kitten') == "KKiKitKittKitteKitten"
      subject.stringSplosion('Bye') == "BByBye"
      subject.stringSplosion('Good') == "GGoGooGood"
      subject.stringSplosion('Bad') == "BBaBad"
  }
}

