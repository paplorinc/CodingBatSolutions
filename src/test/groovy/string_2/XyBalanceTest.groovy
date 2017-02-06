package string_2;

import spock.lang.Specification

class XyBalanceTest extends Specification {
  def 'xyBalance'() {
    setup:
      def subject = new XyBalance()
    expect:
      subject.xyBalance('aaxbby') == true
      subject.xyBalance('aaxbb') == false
      subject.xyBalance('yaaxbb') == false
      subject.xyBalance('yaaxbby') == true
      subject.xyBalance('xaxxbby') == true
      subject.xyBalance('xaxxbbyx') == false
      subject.xyBalance('xxbxy') == true
      subject.xyBalance('xxbx') == false
      subject.xyBalance('bbb') == true
      subject.xyBalance('bxbb') == false
      subject.xyBalance('bxyb') == true
      subject.xyBalance('xy') == true
      subject.xyBalance('y') == true
      subject.xyBalance('x') == false
      subject.xyBalance('') == true
      subject.xyBalance('yxyxyxyx') == false
      subject.xyBalance('yxyxyxyxy') == true
      subject.xyBalance('12xabxxydxyxyzz') == true
  }
}

