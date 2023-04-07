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
  int  ListSize = 0;
  ReadingList rl = new ReadingList();
  int result = rl.numberRead();   
  assertEquals(ListSize, result);
 }

 @Test
 public void testBookRead(){
  int Listsize = 1;
 Book objBook = new Book("abc","huda",204,2019);
 ReadingList rl = new ReadingList();
 rl.addBook(objBook, "January-09-2020", 67);
 int result = rl.numberRead(); 
  assertEquals(Listsize,result);
 }
   


    
}
