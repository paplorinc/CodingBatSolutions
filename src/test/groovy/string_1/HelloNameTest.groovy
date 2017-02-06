package string_1;

import spock.lang.Specification

class HelloNameTest extends Specification {
  def 'helloName'() {
    setup:
      def subject = new HelloName()
    expect:
      subject.helloName('Bob') == "Hello Bob!"
      subject.helloName('Alice') == "Hello Alice!"
      subject.helloName('X') == "Hello X!"
      subject.helloName('Dolly') == "Hello Dolly!"
      subject.helloName('Alpha') == "Hello Alpha!"
      subject.helloName('Omega') == "Hello Omega!"
      subject.helloName('Goodbye') == "Hello Goodbye!"
      subject.helloName('ho ho ho') == "Hello ho ho ho!"
      subject.helloName('xyz!') == "Hello xyz!!"
      subject.helloName('Hello') == "Hello Hello!"
  }
}

