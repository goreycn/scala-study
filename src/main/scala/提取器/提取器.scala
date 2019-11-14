package 提取器

case class User(name: String, age: Int)

object 提取器 {
  def main(args: Array[String]): Unit = {
    val a = User("Gorey", 12)
    a match {
      case User(name, age) => println(name + ":" + age)
      case _ => println("not found")
    }


    for (t <- None)
      println("-> " + t)

    for (t <- Some("Hello"))
      println("-> " + t)

    val b = Some("hello")
    b match {
      case Some("aa") => println("aaa")
      case _ => println("other")
    }

    for (t <- b) {
      t match {
        case "hello" => println("aa=============== ")
        case "other" => println("other -------- ")
      }
    }
  }
}
