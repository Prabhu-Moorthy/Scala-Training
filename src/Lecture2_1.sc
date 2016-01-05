//bare functions
def id(x:Int) = x
def square(x:Int) = x * x
def cube(x: Int) = x * x * x
def fact(x:Int):Int =
if(x == 0) 1 else x * fact(x - 1)

//summing functions
def sumInts(a:Int,b:Int): Int =
  if(a>b) 0 else id(a) + sumInts(a + 1,b)
def sumSquares(a:Int,b:Int): Int =
  if(a>b) 0 else square(a) + sumSquares(a+1,b)
def sumCubes(a:Int,b:Int): Int =
  if(a>b) 0 else cube(a) + sumCubes(a+1,b)
def sumFacts(a:Int,b:Int): Int =
  if(a>b) 0 else fact(a) + sumFacts(a+1,b)

//summing without higer order function
sumInts(5,10)
sumSquares(5,10)
sumCubes(5,10)
sumFacts(5,10)

//Higher order function
def sum(f: Int => Int,a:Int,b:Int):Int =
  if(a>b) 0 else f(a) + sum(f,a + 1,b)

//summing with Higher order function 'sum'
sum(id,5,10)
sum(square,5,10)
sum(cube,5,10)
sum(fact,5,10)

//summing with Higher order function using anonymous functions
sum(x => x,5,10)
sum(x => x * x,5,10)
sum(x => x * x * x,5,10)
//fact cannot be done using this method because fact is a recursive function