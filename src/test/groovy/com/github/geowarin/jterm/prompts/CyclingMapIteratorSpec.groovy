package com.github.geowarin.jterm.prompts

import spock.lang.Specification

class CyclingMapIteratorSpec extends Specification {

  def "should cycle when next is called on last element"() {
    given:
    def map = [1:1, 2:2]
    def iterator = new CyclingMapIterator<>(map)

    when:
    iterator.next()

    then:
    iterator.currentKey() == 2

    when:
    iterator.next()

    then:
    iterator.currentKey() == 1
  }

  def "should cycle when previous is called on first element"() {
    given:
    def map = [1:1, 2:2]
    def iterator = new CyclingMapIterator<>(map)

    when:
    iterator.previous()

    then:
    iterator.currentKey() == 2
  }
}
