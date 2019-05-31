package Main;

class Reader extends Thread
{
    Access accessObj;
    String id;
    Reader(String id, Access AccessObj)
    {
        this.id = id;
        this.accessObj = AccessObj;
        start();
    }

    public void run()
    {
        try
        {
            accessObj.reading(this);
            sleep(500);
        }
        catch(InterruptedException e){

        }
    }
}