import scalafx.Includes._
import scalafx.application.JFXApp3
import scalafx.scene.Scene
import scalafx.scene.canvas.Canvas
import scalafx.scene.paint.Color
//Zubko
object BloomingTrees extends JFXApp3 {

  def drawBranch(gc: scalafx.scene.canvas.GraphicsContext, x1: Double, y1: Double, angle: Double, depth: Int): Unit = {
    if (depth > 0) {
      val angle1 = angle + math.Pi / 6
      val angle2 = angle - math.Pi / 6
      val length = 60 * math.pow(0.8, depth)
      val x2 = x1 + length * math.cos(angle)
      val y2 = y1 - length * math.sin(angle)

      gc.stroke = Color.Brown
      gc.strokeLine(x1, y1, x2, y2)

      drawBranch(gc, x2, y2, angle1, depth - 1)
      drawBranch(gc, x2, y2, angle2, depth - 1)

      if (depth == 1) {
        gc.fill = Color.Pink
        gc.fillOval(x2 - 5, y2 - 5, 10, 10)
      }
    }
  }

  override def start(): Unit = {
    stage = new JFXApp3.PrimaryStage {
      title = "Blooming Trees"
      scene = new Scene(800, 600) {
        val canvas = new Canvas(800, 600)
        content = canvas
        val gc = canvas.graphicsContext2D

        drawBranch(gc, 400, 550, -math.Pi / 2, 7)
      }
    }
  }
}
