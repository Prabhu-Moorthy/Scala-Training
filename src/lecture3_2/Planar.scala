package lecture3_2

/**
  * Created by Innovchn on 1/7/16.
  */
trait Planar {
    def height: Int
    def width: Int
    def surface = height * width
}
