package com.equalinformation.poc.akka

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

/**
  * Created by bpupadhyaya on 12/18/15.
  */

class SampleActor extends Actor {
  def receive = {
    case "test" => println("test reflected")
    case _       => println("not a test")
  }
}

object SampleActorApp extends App {
  val system = ActorSystem("SampleSystem")
  // default Actor constructor
  val sampleActor = system.actorOf(Props[SampleActor], name = "testactor")
  sampleActor ! "test"
  sampleActor ! "alternate message"

}
