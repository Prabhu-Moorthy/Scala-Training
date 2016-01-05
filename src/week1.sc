
  def sqrt(x: Double) = {
        def abs(x: Double) = if(x > 0) x else -x

        def isGoodEnough(guess: Double, x: Double) =
        abs(guess * guess - x) / x < 0.001

        def improve(guess: Double, x: Double) =
        (guess + x / guess) / 2

        def sqrtIter(guess: Double, x: Double): Double =
        if(isGoodEnough(guess, x)) guess else sqrtIter(improve(guess,x),x)

        sqrtIter(1.0, x)
	}                                         //> sqrt: (x: Double)Double

	sqrt(1e10)                                //> res0: Double = 100005.58643074983
