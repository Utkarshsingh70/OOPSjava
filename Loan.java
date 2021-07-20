import java.util.*;
import java.time.*;
public class Loan
{
    ItemCopy _itemCopy;
    LocalDate _dueDate;
    LocalDate _returnDate;
    Loan(ItemCopy itemCopy,LocalDate loanDate)
    {
        _dueDate=loanDate.plusDays(_itemCopy._item._loanDuration);
    }

    public LocalDate returnDate()
    {
        return _returnDate;
    }

    public void returnDate(LocalDate datetime)
    {
        _returnDate=datetime;
    }

    public LocalDate dueDate()
    {
        return _dueDate;
    }

    public boolean renew()
    {
        if(_returnDate.compareTo(_dueDate)<=0)
        {
            _dueDate=_dueDate.plusDays(_itemCopy._item._loanDuration);
            return true;
        }
        return false;
    }

    public int copyId()
    {
        return _itemCopy._copyId;
    }

    public float lostCharges()
    {
        return _itemCopy._item.lostCharges();
    }

    public String loanTitle()
    {
        return _itemCopy._item.title();
    }

    public float getFines()
    {
        if(_itemCopy._available==false)
            return -1;
        return _itemCopy._item.getFinePerDay();
    }

    public String _str_()
    {
        String s="loan "+_itemCopy._item._str_();
        s+="Due date: "+_dueDate+" Return on: ";
        if(renew())
            s+="On Loan";
        else
            s+=_returnDate;
        return s;
    }
}