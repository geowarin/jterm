package com.github.geowarin.jterm.prompts

class CyclingMapIterator<T> {
  Map<T, String> map
  private Set<T> keys
  private int currentIndex

  CyclingMapIterator(Map<T, String> map) {
    this.map = new LinkedHashMap(map)
    keys = this.map.keySet()
  }

  void next() {
    currentIndex++
    currentIndex = currentIndex >= keys.size() ? 0 : currentIndex
  }

  void previous() {
    currentIndex--
    currentIndex = currentIndex < 0 ? keys.size() - 1 : currentIndex
  }

  T currentKey() {
    keys[currentIndex]
  }

  String currentValue() {
    map[currentKey()]
  }
}
