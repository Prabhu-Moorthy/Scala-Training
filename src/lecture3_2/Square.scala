package lecture3_2

/**
  * Created by Innovchn on 1/7/16.
  */
class Square extends Shape with Planar{
  override def height: Int = 4

  override def width: Int = 5

  def calc = {
    def value = height * width
    new Shape;
  }
}
