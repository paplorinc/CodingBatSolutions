package string_2;

import spock.lang.Specification

class ZipZapTest extends Specification {
  def 'zipZap'() {
    setup:
      def subject = new ZipZap()
    expect:
      subject.zipZap('zipXzap') == "zpXzp"
      subject.zipZap('zopzop') == "zpzp"
      subject.zipZap('zzzopzop') == "zzzpzp"
      subject.zipZap('zibzap') == "zibzp"
      subject.zipZap('zip') == "zp"
      subject.zipZap('zi') == "zi"
      subject.zipZap('z') == "z"
      subject.zipZap('') == ""
      subject.zipZap('zzp') == "zp"
      subject.zipZap('abcppp') == "abcppp"
      subject.zipZap('azbcppp') == "azbcppp"
      subject.zipZap('azbcpzpp') == "azbcpzp"
  }
}

