public Collection map(Function<Integer, Integer> func) {
  for (int i = 0; i < this.size(); i++) {
    Integer newElem = func.apply(this.get(i));
    this.set(i, newElem);
  }
  return this;
}

public Collection filter(Function<Integer, Boolean> func) {
  for (int i = 0; i < this.size(); i++) {
    if(!func.apply(this.get(i))) {
      this.remove(i);
      i--;
    }
  }
  return this;
}
