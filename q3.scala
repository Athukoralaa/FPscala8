object main {
  def main(args: Array[String]): Unit = {
    println(formatNames(toLower,"Happy Learning"))
    println(formatNames(toUpper,"Long weekend"))
  }
  val toUpper=(word:String)=>word.toUpperCase
  val toLower=(word:String)=>word.toLowerCase

  val formatNames=(f:(String)=>String,name:String)=>f(name)
}