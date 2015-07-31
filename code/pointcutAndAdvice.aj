pointcut map(Function f):
  call(* Collection.map(Function)) &&
  args(f);

Collection around(Function f, Collection collection) :
  map(f) && target(collection) {
    if (isFusing) {
      addOp(new MapOp(f));
    } else {
      proceed(f, collection);
    }
    return collection;
}
