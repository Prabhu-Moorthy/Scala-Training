def gcd(a:Double, b:Double): Double =
if(b ==0 ) a else gcd(b,a%b)

gcd(2,21)

//non tail recursive factorial finction
def fact(x:Int): Int =
if( x == 0 ) 1 else x * fact(x - 1)

fact(5)


//tail recursive factorial function
def factorial(x:Int): Int = {
  def loop(acc:Int, x: Int): Int =
    if(x == 0) acc else loop(acc * x,x - 1)
  loop(1,x)
}

factorial(4)