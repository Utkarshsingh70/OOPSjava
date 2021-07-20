import java.util.*;
import java.time.*;
abstract class Item
{
    int _loanDuration=14;
    String _title;
    int _yearPublished;
    float _cost;
    public int getloanDuration()
    {
        return _loanDuration;
    }

    public void setloanDuartion(int newDuration)
    {
        _loanDuration=newDuration;
    }

    Item(String title, int yearPublished, float cost)
    {
        _title=title;
        _yearPublished=yearPublished;
        _cost=cost;
    }

    public String title()
    {
        return _title;
    }

    public int yearPublished()
    {
        return _yearPublished;
    }

    public float cost()
    {
        return _cost;
    }

    abstract public float getAdminCharge();

    abstract public float getFinePerDay();

    public float lostCharges()
    {
        return getAdminCharge()+_cost;
    }

    public String _str_()
    {
        String s=title()+" "+yearPublished()+" "+cost();
        return s;
    }
}




