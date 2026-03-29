public class Digital{
    private int min;
    private int hrs;
    
    public Digital(){
        min=0;
        hrs=0;
    }
    public void tic(){
        min+=1;
    }
    public void Quehorassão(){
        System.out.println(hrs + ":" + min);
    }
}