package string_1;

import spock.lang.Specification

class StartWordTest extends Specification {
  def 'startWord'() {
    setup:
      def subject = new StartWord()
    expect:
      subject.startWord('hippo', 'hi') == "hi"
      subject.startWord('hippo', 'xip') == "hip"
      subject.startWord('hippo', 'i') == "h"
      subject.startWord('hippo', 'ix') == ""
      subject.startWord('h', 'ix') == ""
      subject.startWord('', 'i') == ""
      subject.startWord('hip', 'zi') == "hi"
      subject.startWord('hip', 'zip') == "hip"
      subject.startWord('hip', 'zig') == ""
      subject.startWord('h', 'z') == "h"
      subject.startWord('hippo', 'xippo') == "hippo"
      subject.startWord('hippo', 'xyz') == ""
      subject.startWord('hippo', 'hip') == "hip"
      subject.startWord('kitten', 'cit') == "kit"
      subject.startWord('kit', 'cit') == "kit"
  }
}

