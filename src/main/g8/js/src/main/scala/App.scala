import scala.scalajs.js.JSON
import scala.scalajs.js

import org.getshaka.shaka
import org.getshaka.shaka.{Component, ComponentBuilder}

import DtoConverters.given

class App extends Component:
  private val user = User("hello", true, 69)

  override val template: ComponentBuilder =
    import shaka.builders.*

    div{width("100%"); display("flex"); justifyContent("center")
      button{onclick(() => println(JSON.stringify(user.toNative)))
        t"Click to print User json to the console"
      }
    }

@main def launchApp(): Unit =
  shaka.render(App())
