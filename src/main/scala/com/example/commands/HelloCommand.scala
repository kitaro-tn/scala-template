package com.example.commands

import com.example.Params

class HelloCommand(_params: Params) extends Command {

  val actionName = "Hello"
  val params = _params

  def before(): Unit = Unit

  def run() = println("Hello world")

  def after(): Unit = Unit

}
