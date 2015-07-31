before(Collection collection): forceCompute() && target(collection) {
  isFusing = false;
  for (Operation op : operationStack) {
    if (op.isFilterOp()) {
      collection.filter(op.getOperation());
    } else if (op.isMapOp()) {
      collection.map(op.getOperation());
    } else {
      throw new IllegalArgumentException();
    }
  }
  operationStack.clear();
  isFusing = true;
}
