def x = new Rational(1,3)
def y = new Rational(5,7)
def z = new Rational(3,2)

class Rational(x:Int,y:Int){
  def numer = x
  def denom = y

  //This is a method that id doing the summing of rational numbers
  def sum(that:Rational):Rational = {
    new Rational(numer * that.denom +
      that.numer * denom,denom * that.denom)
  }

  //This is a method to do the neg operation of rational numbers
  def neg = new Rational(-numer,denom)

  //This is a method to do the subtraction of rational numbers
  def sub(that:Rational) = sum(that.neg)

  override def toString = numer + "/" + denom
}

//This is a function that is doing the summing of rational numbers
def externalSum(a: Rational,b:Rational) = {
  def numerSum = (a.numer * b.denom) + (b.numer * a.denom)
  def denomSum = a.denom * b.denom
  new Rational(numerSum,denomSum)
}

//this is a function call
externalSum(x,y)

//this is a method call
x.sum(y)
x.sub(y).sub(z)
