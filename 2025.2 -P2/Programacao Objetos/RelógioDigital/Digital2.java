public class Digital2{
    private int hrs;
    private int min;
    private int seg;
    
    public Digital2(int horas,int minutos, int segundos){
        if(horas>=0 && horas<=23
        && minutos>=0 && minutos<=59
        && segundos>=0 && segundos<=59){
        hrs=horas;
        min=minutos;
        seg=segundos;
    }else{
        System.out.println("ERRO!");
    }
}
    public void tic(){
        if(min==59&&seg==59){
            min=0;
            seg=0;
            hrs+=1;
        }else{
            if(seg==59){
                seg=0;
                min+=1;
            }else{
                seg+=1;
            }
        }if(hrs==24){
            hrs=0;
        }
    }
    public void ajustar(int novahora,int novominuto, int novosegundo){
        if(novahora>=0 && novahora<=23
        && novominuto>=0 && novominuto<=59
        && novosegundo>=0 && novosegundo<=59){
        hrs=novahora;
        min=novominuto;
        seg=novosegundo;
    }else{
        System.out.println("ERRO!");
    }
    }
    public void alarme(int h,int m, int s){
        if(hrs==h && min==m &&seg==s){
            System.out.println("ALARME!");
            System.out.printf("%02d:%02d:%02d\n",hrs,min,seg);
        }
    }
    public void Quehorassão(){
        System.out.printf("%02d:%02d:%02d\n",hrs,min,seg);
    }
}
