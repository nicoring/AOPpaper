private void addOp(MapOp mapOp) {
  if (!operationStack.isEmpty() && operationStack.peek().isMapOp()) {
    MapOp lastMapOp = (MapOp) operationStack.pop();
    operationStack.push(fuseOps(lastMapOp, mapOp));
  } else {
    operationStack.push(mapOp);
  }
}
