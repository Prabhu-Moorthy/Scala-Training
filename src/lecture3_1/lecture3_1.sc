abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

class Empty extends IntSet {
  def incl(x: Int): IntSet = new NonEmpty(x,new Empty,new Empty)

  def contains(x: Int): Boolean = false

  def union(other: IntSet) = other

  override def toString = "."
}

class NonEmpty(elem:Int,left: IntSet,right: IntSet) extends IntSet {
  def incl(x: Int): IntSet =
    if(x < elem) new NonEmpty(elem,left incl x,right)
    else if(x > elem) new NonEmpty(elem,left,right incl x)
    else this

  def contains(x: Int): Boolean =
    if(x < elem) left contains x
    else if(x > elem) right contains x
    else true

  def union(other: IntSet) =
   ((left union right) union other) incl elem

  override def toString = "{" + left + elem + right + "}"
}

abstract class Base{
  def foo = 1
  def bar: Int
}

class Sub extends Base{
  override def foo = 2;
  def bar = 2;
}

def t1 = new NonEmpty(3,new Empty,new Empty)
def t2 = t1 incl 44
def t3 = t2 incl 55
t3 incl 2

t1 union t2