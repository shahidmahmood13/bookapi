package com.glc;


import java.util.ArrayList;
import java.util.List;

public class ReadingList {
    public String dateRead;
    public int Rating;

public List<String> bookList = new ArrayList<>(); 

public int numberRead(){
return bookList.size();
    
}

}