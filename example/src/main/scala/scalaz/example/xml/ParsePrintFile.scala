package scalaz.example
package xml

object ParsePrintFile {
  import scalaz._, Scalaz._, xml.Xml._

  def main(args: Array[String]): Unit = {
    val r = args(0).parseXmlFile
    r.println
  }
}
