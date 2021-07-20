class ItemCopy
{
    int _nextId=1;
    Item _item;
    int _copyId;
    boolean _available;
    ItemCopy(Item item)
    {
        _item=item;
        _copyId=_nextId;
        _available=true;
    }

    public int copyId()
    {
        return _copyId;
    }

    public Item item()
    {
        return _item;
    }

    public boolean available()
    {
        return _available;
    }

    public void available(boolean status)
    {
        _available=status;
    }

    public String _str_()
    {
        String s=_item._str_()+" Available: "+_available;
        return s;
    }
}