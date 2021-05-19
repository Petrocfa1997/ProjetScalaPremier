import Personne._
import java.text._
import java.util.Calendar
import scala.collection.immutable._




object HelloWord {
  val variable2 : String = ""

  def calculSomme(a: Int, b: Int):Int = {
    val resultat = a+b
    val res2 = resultat+ 15
    return res2
  }
  val nomMap : Map[String,String] = Map(
    "cc"->"COCODY",
    "yy"->"POY",
    "abd"->"ABIDJAN"
  )
  val nM = nomMap.toList
  nomMap.keys.foreach(k=>k)

  var nomtableau : Array[String] = Array("","")
  nomtableau(0)="jvc"
  def maCollection():Unit = {
    val maliste = List("jvc","jjj","ecole","SSS")
    val maliste1 : List[String] = List("julien","juvenal","aristote")

    maliste.foreach(l => println(l.toUpperCase()))
    maliste1.foreach(l => {
    val var2=l.toUpperCase()
    })
    val maliste2: List[Int]= List(10,20,30,40,50)

  }

  def Tp():Unit = {
    val pr = Seq("Silue","Camara","Domi","Seniko","Kamso","Damso","Dadj")
    val pr1 = pr.map(l=> l.length())
    pr1.foreach(l=>print(l+ " "))
    println("")
    val seq_filter = pr.filter(l => l.length()>3).foreach(l=>print(l+ " "))
    //seq_filter.foreach(l=>print(l+ " "))
  }

  def retournePersonne(nom : String,prenoms  : String, DateNaiss :String, nationalite : String, salaire: Double):Personne = {

    var formater = new SimpleDateFormat( "dd-MM-YY" )
    var age2 = formater.parse(DateNaiss)
    var c: Calendar = Calendar.getInstance()
    val age1 = c.getWeekYear
    c.setTime(age2)
    val h = c.getWeekYear()
    val age: Int = age1 - h
  return Personne(nom ,prenoms ,Some(age),nationalite,salaire)
  }
  def main(args: Array[String]): Unit = {
    val text : String = "Hello World ,mon premier programme en scala"
    val text2 : String = text + variable2

    val test = println(text)
    test
    val silue = Personne("SILUE","Sionfoungo Sirabana",None,"IVOIRIENNE",2500000)
    val etudiant = Personne("Sionfoungo Sirabana","SILUE",None,"IVOIRIENNE",2500000)
    val age_personne = silue.DateNaiss
    println("l'age de la personne est : "+age_personne+" et l'etudiant est : "+etudiant.nom+" "+etudiant.prenoms)
    val somme = println("la somme est de :"+calculSomme(13,90))
    somme
    val i = println("l'age de la personne est : "+retournePersonne("aaa","ddd","29-05-2000","bf",5000))
    maCollection()
    Tp()
    println(nM)
  }


}
