package test

import scala.io.Source

/**
 * Created by manishkosaraju on 6/8/15.
 */
/* 1. Calculate characters, words, lines in a file */

object fileCount extends App{

  val filename = "/Users/manishkosaraju/Desktop/story.txt"

  println("The contents of the file :")

  for( line <- Source.fromFile(filename).getLines()){
     //println(line.length +" "+line)
    println(line)
   }

  val line = Source.fromFile(filename)
  val lineCount = line.getLines().size
  println("Number of Lines :"+lineCount)

  val char = Source.fromFile(filename).mkString
  val charCount = char.size
  println("Number of Characters :"+charCount)


  var wordCount=0

   for( i <- 0 until charCount) {
     if (char.charAt(i) == ' ')
       wordCount += 1
   }

  println("Number Of Words :"+wordCount)

}
