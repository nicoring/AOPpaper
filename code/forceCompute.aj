pointcut forceCompute():
  (get(List<Integer> Collection.list) ||
  set(List<Integer> Collection.list) ||
  execution(* Collection.collectValues())) &&
  !cflow(mapOrFilter());
