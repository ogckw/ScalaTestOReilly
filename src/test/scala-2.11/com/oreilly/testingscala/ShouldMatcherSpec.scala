package com.oreilly.testingscala

/**
  * Created by admin-k on 2016/5/9.
  */
import org.scalatest.FunSpec
import org.scalatest.ShouldMatchers
class ShouldMatcherSpec extends FunSpec with ShouldMatchers{
  describe("a list size") {
    it("can count by list method") {
       val list = 2 :: 4 :: 5 :: Nil
       list.size should be(3)
    }
  }
  describe("string test"){
    it("test string match"){
      val string =
        """I fell into a burning ring of fire.
          |I went down, down, down and the flames went higher""".stripMargin
      println(string)
      string should startWith("I fell")
      string should endWith("higher")
      string should not endWith "My favorite friend, the end"
      string should include("down, down, down")
      string should not include ("Great balls of fire")
      string should startWith regex ("I.fel+")
      string should endWith regex ("h.{4}r")
      string should not endWith regex("\\d{5}")
      string should include regex ("flames?")
      string should fullyMatch regex ("""I((?s)|.|\\n|\\S)*higher""")
    }
  }
}
