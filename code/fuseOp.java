private MapOp fuseOps(MapOp op1, MapOp op2) {
  Function<Integer, Integer> f = (x) -> {
    return op2.apply(op1.apply(x));
  };
  return new MapOp(f);
}

private FilterOp fuseOps(FilterOp op1, FilterOp op2) {
  Function<Integer, Boolean> f = (x) -> {
    return op1.apply(x) && op2.apply(x);
  };
  return new FilterOp(f);
}
