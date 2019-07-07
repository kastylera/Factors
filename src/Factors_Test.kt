class Factors_Test {
  
  fun factor_45_3and3and5_returned(): Boolean{
    //arrange
    val x = 45;
    val expected = arrayOf(3,3,5)
    //act
    var f = Factors()
    val actual = f.factor(x)
    //assert
    return expected contentEquals actual
  }
  
  fun factor_3_3_returned(): Boolean{
    //arrange
    val x = 3;
    val expected = arrayOf(3)
    //act
    var f = Factors()
    val actual = f.factor(x)
    //assert
    return expected contentEquals actual
  }
  
  fun factor_210_2and3and5and7_returned(): Boolean{
    //arrange
    val x = 210;
    val expected = arrayOf(2,3,5,7)
    //act
    var f = Factors()
    val actual = f.factor(x)
    //assert
    return expected contentEquals actual
  }

  fun factor_0_0_returned(): Boolean{
    //arrange
    val x = 0;
    val expected = arrayOf(0)
    //act
    var f = Factors()
    val actual = f.factor(x)
    //assert
    return expected contentEquals actual
  }

  fun factor_1_1_returned(): Boolean{
    //arrange
    val x = 1;
    val expected = arrayOf(1)
    //act
    var f = Factors()
    val actual = f.factor(x)
    //assert
    return expected contentEquals actual
  }

  fun testPerfomance(){
    var testArray = emptyArray<Long>()
    var f = Factors();
    for (i in 1..10000){
      var start:Long = System.nanoTime()
      f.factor(i)
      var finish:Long = System.nanoTime()
      testArray += finish - start
    }
    println("Min: ${testArray.min()} ns")
    println("Max: ${testArray.max()} ns")
    println("Average: ${testArray.average()} ns")
  }
}
