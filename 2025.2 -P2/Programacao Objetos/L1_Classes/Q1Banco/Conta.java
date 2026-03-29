public class Conta{
     private String cpf;
     private double saldo;
     
     public Conta(String cpf1, double saldo1){
         cpf=cpf1;
         saldo=saldo1;
     }
     public void depositar(double numero){
         saldo+=numero;
     }
     public void sacar(double numero){
         if (saldo<numero){
             System.out.println("Não há saldo suficiente na conta");
         } else{
             saldo-=numero;
         }
     }
     public void ver(){
         System.out.println("O saldo atual da conta é" + saldo);
     }
}