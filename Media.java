public class Media extends Item
{
    int _loanDuration =3;
    Media(String title, int yearPublished, float cost)
    {
        super(title,yearPublished,cost);
    }

    public float getAdminCharge()
    {
        return 1.5f*_cost;
    }

    public float getFinePerDay()
    {
        return (float)2.50;
    }
}