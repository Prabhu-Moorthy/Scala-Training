package lecture3_3

/**
  * Created by Innovchn on 1/7/16.
  */
class Cons[T](val head:T,val tail: List[T])extends List[T]{
  def isEmpty = false;
}
