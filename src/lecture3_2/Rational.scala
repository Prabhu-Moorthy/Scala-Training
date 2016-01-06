package lecture3_2

/**
  * Created by Prabhu on 06-01-2016.
  */
class Rational(x:Int,y:Int){

  require(y!=0,"denominator must be non 0")
  private def gcd(a:Int,b:Int):Int = if(b == 0) a else gcd(b,a%b)
  def numer = x / gcd(x,y)
  def denom = y / gcd(x,y)

  def this(x:Int) = this(x,1)

  //This is a method that id doing the summing of rational numbers
  def sum(that:Rational):Rational = {
    new Rational(numer * that.denom +
      that.numer * denom,denom * that.denom)
  }

  //This is a method to do the neg operation of rational numbers
  def neg = new Rational(-numer,denom)

  //This is a method to do the subtraction of rational numbers
  def sub(that:Rational) = sum(that.neg)

  //This is a method to find which rational number is less
  def less(that:Rational) = numer * that.denom < that.numer * denom

  //This is a method to find the maximum of 2 rational number
  def max(that:Rational) = if(this.less(that)) that else this

  override def toString = numer + "/" + denom
}
