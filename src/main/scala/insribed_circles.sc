import cats.effect.unsafe.implicits.global
import doodle.core.*
import doodle.image.*
import doodle.syntax.all.*
import doodle.image.syntax.all.*
import doodle.java2d.*
Image.circle(100).beside(Image.circle(100)).beside(Image.circle(100)).on(Image.circle(300)).draw()
