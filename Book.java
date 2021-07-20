import java.time.*;
import java.util.*;
class Book extends Item
{
    List<String> _authors;
    Book(String title, int yearPublished, float cost, List<String> authors)
    {
        super(title,yearPublished,cost);
        _authors=authors;
    }

    public float getAdminCharge()
    {
        Date d=new Date();
        float f= 10-(d.getYear()-yearPublished());
        return f/10;
    }

    public float getFinePerDay()
    {
        return (float)0.25;
    }

    public String _str_()
    {
        String s=title()+" "+yearPublished()+" "+cost();
        for(String st: _authors)
            s+=", "+st;
        return s;
    }
}