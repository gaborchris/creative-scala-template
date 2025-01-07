import cats.effect.unsafe.implicits.global
import doodle.core.*
import doodle.image.*
import doodle.syntax.all.*
import doodle.image.syntax.all.*
import doodle.java2d.*

Image.circle(100)
Image.circle(100).draw()
Image.rectangle(100, 50).draw()
Image.triangle(120, 90).draw()

//Image.circle(1).circle(10).circle(100).draw()

Image.circle(1).draw()
Image.circle(10).draw()
Image.circle(100).draw()

Image.circle(100).beside(Image.rectangle(50,100)).draw()
Image.circle(100).above(Image.rectangle(50,100)).draw()
Image.circle(100).on(Image.rectangle(50,100)).draw()

Image.circle(100)
  .fillColor(Color.chartreuse)
  .strokeColor(Color.hotpink)
  .strokeWidth(5)
  .noFill
  .draw()

