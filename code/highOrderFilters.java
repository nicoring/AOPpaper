public ExtendedCollection getGreaterThanOrEqual(int value) {
  this.filter((i) -> i >= value);
  return this;
}

public ExtendedCollection getLowerThanOrEqual(int value) {
  this.filter((i) -> i <= value);
  return this;
}

public ExtendedCollection getInterval(int start, int end) {
  this
    .getGreaterThanOrEqual(start)
    .getLowerThanOrEqual(end);
  return this;
}
