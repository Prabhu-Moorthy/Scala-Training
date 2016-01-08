package lecture4_2

/**
  * Created by Innovchn on 1/8/16.
  */
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def +(that:Nat): Nat
  def -(that:Nat): Nat
}

class Zero extends Nat{
  def isZero = true

  def predecessor = throw new Error("0.predecessor")

  def successor = new Successor(this)

  def +(that:Nat) = that

  def -(that:Nat) = if(that.isZero) this else throw new Error("negative number")

}

class Successor(n:Nat) extends Nat{
  def isZero = false

  def predecessor = n

  def successor = new Successor(this)

  def +(that:Nat) = new Successor(n + that)

  def -(that:Nat) = if(that.isZero) this else n - that.predecessor

}

