/**
 * this is a simple comment
 * @param args
 */

class Dog {
  void test(){
    def hello = {
      println("dog hello this ${this}")
    }
    hello()
  }

  class Inner {
    def ts = {println("inner this is ${this}")}
  }

  def createInner(){
    return new Inner()
  }

}

static void main(String[] args) {

//  println("main this ${this}")
////  println("main getThisObject ${getThisObject()}")
//
//  def testThis = {
//    println("test this ${this}")
//    println("test getThisObject ${getThisObject()}")
//  }
//
//  testThis()


  def dog = new Dog()
  println("dog $dog")

  dog.test()

  def di = dog.createInner()
  di.ts()

}