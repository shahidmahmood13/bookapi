package com.glc;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

 @Test
 public void testEmptyList(){
  int  List = 0;
  ReadingList rl = new ReadingList();
  int result = rl.numberRead();   
  assertEquals(List, result);
 }
   


    
}
