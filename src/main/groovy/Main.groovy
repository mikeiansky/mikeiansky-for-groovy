/**
 * this is a simple comment
 * @param args
 */
static void main(String[] args) {
  // test comment
  println "Hello' \"world!" // end comment

  def number = 3.14

  def sParameterLessClosure = """1 + 2 == ${-> 
    println "nested expression ... "
    return 3
  }"""

  println sParameterLessClosure

  def sOneParamClosure = """1 + 2 == ${ w ->
    println "w is ${w}"  
    w << 3
  }"""

  println sOneParamClosure
}