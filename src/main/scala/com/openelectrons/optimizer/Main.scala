package com.openelectrons.optimizer

import optimus.optimization._
import optimus.optimization.enums.SolverLib
import optimus.optimization.model.MPFloatVar


object Main extends App {
  implicit val model: MPModel = MPModel(SolverLib.oJSolver)

  val x = MPFloatVar("x", 100, 200)
  val y = MPFloatVar("y", 80, 170)

  maximize(-2 * x + 5 * y)
  add(y >:= -x + 200)

  start()

  println(s"objective: $objectiveValue")
  println(s"x = ${x.value} y = ${y.value}")

  release()
}