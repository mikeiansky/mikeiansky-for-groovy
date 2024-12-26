/**
 * this is a simple comment
 * @param args
 */
import static java.util.Calendar.getInstance as now

static void main(String[] args) {
  def isOdd = { int i -> i%2 != 0 }
  println(isOdd(2))
  println(isOdd(3))
}