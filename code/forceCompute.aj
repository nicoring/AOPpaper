pointcut forceCompute():
  (execution(* Collection.get(..)) ||
  execution(* Collection.add(..)) ||
  execution(* Collection.set(..)) ||
  execution(* Collection.remove(..)) ||
  execution(* Collection.size()) ||
  execution(* Collection.isEmpty()) ||
  execution(* Collection.collectValues())) &&
  !cflow(mapOrFilter());
