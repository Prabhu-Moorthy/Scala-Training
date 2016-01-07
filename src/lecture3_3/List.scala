package lecture3_3

/**
  * Created by Innovchn on 1/7/16.
  */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}
