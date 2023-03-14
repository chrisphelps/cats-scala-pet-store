package com.sutemi.catsscalapetstore

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple {
  val run = CatsscalapetstoreServer.run[IO]
}
