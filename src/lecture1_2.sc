  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  34 + 59                                         //> res0: Int(93) = 93

  def radius = 10                                 //> radius: => Int
  radius                                          //> res1: Int = 10

  def pi = 3.14                                   //> pi: => Double
  pi                                              //> res2: Double = 3.14
  (2 * pi) * radius                               //> res3: Double = 62.800000000000004

  def square(x:Double) = x*x                      //> square: (x: Double)Double
  square(2)                                       //> res4: Double = 4.0
  square(2+2)                                     //> res5: Double = 16.0
  square(square(2))                               //> res6: Double = 16.0

  def sumOfSquares(x:Double,y:Double) = square(x) + square(y)
  //> sumOfSquares: (x: Double, y: Double)Double
  sumOfSquares(3,3+1)                             //> res7: Double = 25.0
  //example of an expression which will never terminate.
  def loop:Int = loop;                            //> loop: => Int
  //loop
  //Lecture 1.3
  def first(x:Int,y:Int) = x                      //> first: (x: Int, y: Int)Int
  //Default strategy by Scala is CBV so the below statement will never terminate
  //first(1,loop)
  //passing loop as CBN
  def second(x:Int,y: => Int) = x   //> second: (x: Int, y: => Int)Int
  second(1,loop)                            //> res8: Int = 1

  //Lecture 1.4
  def abs(x:Int) = if ( x > 0) x else -x    //> abs: (x: Int)Int
  abs(-10)                                  //> res9: Int = 10

  def loop2: Boolean = loop2                //> loop2: => Boolean
  def x1 = loop2                            //> x1: => Boolean

  //val loop3 : Boolean = loop3

  def and(x:Int,y:Int) = x                  //> and: (x: Int, y: Int)Int
  def or(x:Int,y:Int) = y                   //> or: (x: Int, y: Int)Int

  and(10,5)                                 //> res10: Int = 10
  or(10,5)                                  //> res11: Int = 5