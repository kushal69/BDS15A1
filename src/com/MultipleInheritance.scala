package com

object MultipleInheritance {
  trait A {
    var distance: Int = _;
    def action = {
      distance = distance + 5;
    }
  }
  
  trait B {
    var driver: Int = _;
    def action = {
      driver = driver + 1;
    }
  }
  
  class AB extends A with B {
    distance = 9;
    driver = 8;
    
    override def action = {
      super[A].action;
      super[B].action;
    }
  }
  
  def main(args: Array[String]) : Unit = {
    var ab = new AB;
    ab.action;
    println(ab.driver);
    println(ab.distance);
  }
}