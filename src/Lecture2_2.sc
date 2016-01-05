def sum(f: Int => Int): (Int, Int) => Int = {
  def sumF(a:Int, b:Int):Int =
    if(a > b) 0 else f(a) + sumF(a+1,b)
  sumF
}

sum(x => x)(5,10)

def sum1(f: Int => Int)(a:Int,b:Int) : Int =
  if(a > b) 0 else f(a) + sum(f)(a+1,b)

sum1(x => x)(5,10)

//Exercise
def products(f:Int => Int)(a:Int,b:Int) : Int =
  if(a > b) 1 else f(a) * products(f)(a + 1,b)

products(x => x * x)(3,4)

def fact(x:Int) = products(x => x)(1,x)
fact(5)

