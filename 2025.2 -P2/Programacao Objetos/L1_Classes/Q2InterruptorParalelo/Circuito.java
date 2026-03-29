public class Circuito{
    private boolean luz;
    private boolean int1;
    private boolean int2;
    public Circuito (boolean inter1,boolean inter2){
        int1=inter1;
        int2=inter2;
        luz = (int1 == int2);
    }
    public void offon1(){
        if(int1 == int2){
            luz=!luz;
            int1=!int1;
        }else{
        luz=!luz;
        int1=!int1;
        }
    }
    public void offon2(){
        if(int2 == int1){
            luz=!luz;
            int2=!int2;
        }else{
            luz=!luz;
            int2=!int2;
        }
    }
    //Fiz isso pq se o int1 e o int2 forem diferentes, independente da ordem, a lâmpada
    //estará apagada, logo se o int for acionado, eles irão ficar iguais e se ficam
    //iguais,a lampada estará acesa,dessa mesma forma, se forem iguais e o int for
    //acionado, ficarão diferentes,logo a lâmpada apagará.
    public void mostrar(){
        if(luz==true){
        System.out.println("A lâmpada está Acesa");
    }else{
        System.out.println("A lâmpada está Desligada");
    }
}
}

    


    
    


