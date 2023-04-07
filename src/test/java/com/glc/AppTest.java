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

 @Test
public void testTotalBooks(){
    int Listsize = 4;
    Book objBook1 = new Book("abc","huda",204,2019);
    Book objBook2 = new Book("xyz","shahid",288,2021);  
    Book objBook3 = new Book("pcn","ali",244,2022);
    Book objBook4 = new Book("jfij","hunaid",245,2018);
    
    ReadingList rl = new ReadingList();
rl.addBook(objBook1, " January-09-2020", 67);
rl.addBook(objBook2,"January-09-2020", 67);
rl.addBook(objBook3, "January-09-2020", 67);

rl.addBook(objBook4, "jan 2020", 504);
int result = rl.numberRead(); 
assertEquals(Listsize,result);

}

    
}
