package lecture3_3

import java.util.NoSuchElementException

/**
  * Created by Prabhu on 08-01-2016.
  */
class Nil[T] extends List[T]{
  def isEmpty = true

  override def tail = throw new scala.NoSuchElementException("Nil.tail")

  override def head = throw new NoSuchElementException("Nil.head")
}