/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 26 07:47:56 GMT 2021
 */

package com.gildedrose;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.gildedrose.GildedRoseException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GildedRoseException_ESTest extends GildedRoseException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GildedRoseException gildedRoseException0 = new GildedRoseException();
      Throwable throwable0 = gildedRoseException0.initCause(gildedRoseException0);
      GildedRoseException gildedRoseException1 = null;
      try {
        gildedRoseException1 = new GildedRoseException("s", throwable0, true, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GildedRoseException gildedRoseException0 = new GildedRoseException("NGCU&oA35");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GildedRoseException gildedRoseException0 = new GildedRoseException((String) null, (Throwable) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GildedRoseException gildedRoseException0 = new GildedRoseException();
      GildedRoseException gildedRoseException1 = new GildedRoseException("8ewH", gildedRoseException0, true, true);
      assertFalse(gildedRoseException1.equals((Object)gildedRoseException0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GildedRoseException gildedRoseException0 = new GildedRoseException((Throwable) null);
  }
}
