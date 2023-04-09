package com.glc;
import java.util.ArrayList;
import java.util.List;

public class ReadingList {
    public String dateRead;
    public int Rating;

    private class BookInfo{
        int Rating;
        String DateRead;
        Book obj;
        public BookInfo(int rating, String dateRead, Book obj) {
            Rating = rating;
            DateRead = dateRead;
            this.obj = obj;
        }
        
        
    }
public List<BookInfo> bookList = new ArrayList<>(); 


public void addBook(Book obj, String DateRead, int Rating){
   
    
// bookList.add(obj.title="abc",obj.author="huda",obj.year=2021,obj.length=294,Rating=2, dateRead = "january-12-2021" );/
BookInfo bookifo= new BookInfo(Rating, DateRead, obj);
bookList.add(bookifo);
}



public int numberRead(){
return bookList.size();

    
}
public void RemoveBook(String title){

    for(int i= 0 ; i<bookList.size(); i++){
        if(bookList.contains(title)){
            
            bookList.remove(i);
        }
       
    }
    
}


}