package string_1;

import spock.lang.Specification

class MakeAbbaTest extends Specification {
  def 'makeAbba'() {
    setup:
      def subject = new MakeAbba()
    expect:
      subject.makeAbba('Hi', 'Bye') == "HiByeByeHi"
      subject.makeAbba('Yo', 'Alice') == "YoAliceAliceYo"
      subject.makeAbba('What', 'Up') == "WhatUpUpWhat"
      subject.makeAbba('aaa', 'bbb') == "aaabbbbbbaaa"
      subject.makeAbba('x', 'y') == "xyyx"
      subject.makeAbba('x', '') == "xx"
      subject.makeAbba('', 'y') == "yy"
      subject.makeAbba('Bo', 'Ya') == "BoYaYaBo"
      subject.makeAbba('Ya', 'Ya') == "YaYaYaYa"
  }
}

