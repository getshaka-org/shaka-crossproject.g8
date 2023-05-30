package com.example.app

import org.getshaka.shaka.*
import org.scalajs.dom.document

class App extends Component:
  private val user = User("hello", true, 69)

  override def template: Frag = Frag:
    import builders.*
    div:
      width("100%")
      display("flex")
      justifyContent("center")
      button:
        onclick(_ => println(user.toJson))
        t"Click to print User json to the console"

@main def launchApp(): Unit = render(App(), document.body)
