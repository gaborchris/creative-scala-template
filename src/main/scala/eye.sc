import cats.effect.unsafe.implicits.global
import doodle.core.*
import doodle.image.*
import doodle.syntax.all.*
import doodle.image.syntax.all.*
import doodle.java2d.*

Image
  .circle(35)
  .fillColor(Color.black)
  .on(Image.circle(75).fillColor(Color.skyBlue))
  .on(Image.circle(110).fillColor(Color.white))
  .on(Image.circle(175).fillColor(Color.midnightBlue))
  .draw()
