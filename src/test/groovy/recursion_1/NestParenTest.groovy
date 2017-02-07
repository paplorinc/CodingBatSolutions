package recursion_1;

import spock.lang.Specification

class NestParenTest extends Specification {
  def 'nestParen'() {
    setup:
      def subject = new NestParen()
    expect:
      subject.nestParen('(())') == true
      subject.nestParen('((()))') == true
      subject.nestParen('(((x))') == false
      subject.nestParen('((())') == false
      subject.nestParen('((()()') == false
      subject.nestParen('()') == true
      subject.nestParen('') == true
      subject.nestParen('(yy)') == false
      subject.nestParen('(())') == true
      subject.nestParen('(((y))') == false
      subject.nestParen('((y)))') == false
      subject.nestParen('((()))') == true
      subject.nestParen('(())))') == false
      subject.nestParen('((yy())))') == false
      subject.nestParen('(((())))') == true
  }
}

