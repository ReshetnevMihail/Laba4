package Main;

class Access {

    Lock reader = new Lock();
    Lock writer = new Lock();
    int numOfWriters =0;

    public void reading(Reader obj)
    {
        synchronized(reader)
        {
            try
            {
                System.out.println( "reader reads " + obj.id);
                obj.sleep(1000);
                System.out.println("reader has finished reading " + obj.id);
            }
            catch(InterruptedException e)
            {
                System.out.println(" reader has excepted");
            }
        }
    }
    public void writing(Writer obj)
    {
        synchronized(reader)
        {
            try
            {
                System.out.println("writer writes " + obj.id);
                obj.sleep(1000);
                System.out.println("writer has finished writing " + obj.id);
            }
            catch(InterruptedException e)
            {
                System.out.println(" writer has excepted");
            }
        }
    }
}