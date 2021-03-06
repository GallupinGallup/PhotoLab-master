package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Tyler Gallup 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("seagull.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture bike = new Picture("blueMotorcycle.jpg");
	  bike.explore();
	  bike.mirrorVerticalRightToLeft();
	  bike.explore();
  }
  public static void testMirrorDiagonal()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.mirrorDiagonal();
	  koala.explore();
	  
  }
  
  public static void testMirrorGull()
  {
	  Picture taco = new Picture("seagull.jpg");
	  taco.mirrorGull();
	  taco.explore();
	  
  }
  
  public static void testMirrorDiagonalUphill()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.mirrorDiagonalUphill();
	  koala.explore();
  }
  
  public static void testmirrorHorizantalBottomToTop()
  {
	  Picture bike = new Picture("butterfly1.jpg");
	  bike.explore();
	  bike.mirrorHorizantalBottomToTop();
	  bike.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEdgeDetectionV2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(15);
    swan.explore();
  }
  public static void testfullRandom()
  {
	  Picture temple = new Picture("temple.jpg");
	  temple.fullRandom();
	  temple.explore();
	  Picture temple1 = new Picture("temple.jpg");
	  temple1.Glitch();
	  temple1.explore();
	  Picture temple2 = new Picture("temple.jpg");
	  temple2.fullRandomGreen();
	  temple2.explore();
	  Picture temple3 = new Picture("temple.jpg");
	  temple3.fullRandomrRed();
	  temple3.explore();
  }
  public static void FiveFilters()
  {
	  Picture temple = new Picture("femaleLionAndHall.jpg");
	  temple.Glitch();
	  temple.mirrorDiagonal();
	  temple.mirrorDiagonalUphill();
	  temple.mirrorVertical();
	  temple.edgeDetection(20);
	  temple.explore();
	  
  }
  public static void ValMeme()
  {
	  Picture ValMeme = new Picture("ValMeme.jpg");
	  ValMeme.ValMeme();
	  ValMeme.explore();
	  ValMeme.write("ValentinesDayMeme!");
  }
  public static void TestGlitchArt()
  {
	  Picture temple = new Picture("temple");
	  temple.GlitchArt();
	  temple.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
	 // testmirrorHorizantalBottomToTop();
	 // testMirrorDiagonal();
	 // testMirrorDiagonalUphill();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetectionV2();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	 // testfullRandom();
	  //FiveFilters();
	  //ValMeme();
	  TestGlitchArt();
  }
}