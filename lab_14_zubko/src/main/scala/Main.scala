import scalafx.Includes._
import scalafx.application.JFXApp3
import scalafx.scene.Scene
import scalafx.scene.canvas.Canvas
import scalafx.scene.paint.Color
//Zubko
object SokobanGame extends JFXApp3 {

  val tileSize = 40
  val gameField: Array[Array[Char]] = Array(
    Array('#', '#', '#', '#', '#', '#', '#', '#', '#'),
    Array('#', '.', '.', '.', '.', '.', '.', '.', '#'),
    Array('#', '.', '@', '$', '.', '.', '.', '.', '#'),
    Array('#', '.', '.', '#', '#', '#', '.', '.', '#'),
    Array('#', '#', '#', '#', '.', '#', '.', '.', '#'),
    Array('#', '.', '.', '.', '.', '.', '.', '.', '#'),
    Array('#', '.', '.', '.', '.', '.', '.', '.', '#'),
    Array('#', '#', '#', '#', '#', '#', '#', '#', '#')
  )

  def drawTile(gc: scalafx.scene.canvas.GraphicsContext, tile: Char, x: Int, y: Int): Unit = {
    tile match {
      case '#' => gc.fill = Color.SaddleBrown
      case '.' => gc.fill = Color.LightGray
      case '@' => gc.fill = Color.Blue
      case '$' => gc.fill = Color.Yellow
      case _ => gc.fill = Color.White
    }
    gc.fillRect(x * tileSize, y * tileSize, tileSize, tileSize)
  }

  override def start(): Unit = {
    stage = new JFXApp3.PrimaryStage {
      title = "Sokoban Game"
      scene = new Scene(gameField(0).length * tileSize, gameField.length * tileSize) {
        val canvas = new Canvas(gameField(0).length * tileSize, gameField.length * tileSize)
        content = canvas
        val gc = canvas.graphicsContext2D

        for (y <- gameField.indices; x <- gameField(y).indices) {
          drawTile(gc, gameField(y)(x), x, y)
        }
      }
    }
  }
}

