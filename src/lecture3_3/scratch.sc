import lecture3_3._

def nth[T](n:Int,lst: List[T]):T = {
  if(n==0) lst.head
  else nth(n-1,lst.tail)
}

var list = new Cons(1,new Cons(2,new Cons(3, new Nil)))

nth(5,list)