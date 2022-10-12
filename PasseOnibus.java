package passagemOnibus;

public class PasseOnibus {
    private String dono;
    protected String tipo;
    private double passagem;
    private double saldo;
    public double onibus;
    private boolean status;

    //métodos personalizados

   public void estadoAtual(){
       System.out.println("#-------------#");
       System.out.println("Tipo: " + this.getTipo());
       System.out.println("Dono: " + this.getDono());
       System.out.println("Saldo: " + this.getSaldo());
       System.out.println("Status: " + this.getStatus());
   }

   public void tipoConta(String t){
       this.setTipo(t);
       this.setStatus(true);
       if (t == "Meia"){
           System.out.println("Valor da meia passagem");
       } else if (t == "Inteira") {
           System.out.println("Valor da passagem inteira");
       }
   }

   public void passagem(){
       if (this.getTipo() == "Meia"){
           this.setPassagem(2.40);
       } else if (this.getTipo() == "Inteira") {
           this.setPassagem(4.80);
       }
   }

   public void depositar(double v){
       if (this.getStatus()){
           this.setSaldo(this.getSaldo() + v);
           System.out.println("Deposito realizado na conta de: "
                   + this.getDono());
       } else {
           System.out.println("Erro ao depositar");
       }
   }

   public void pagarPassagem(){
       this.setSaldo(this.getSaldo() - this.getPassagem());
   }

    public PasseOnibus() {
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPassagem() {
        return passagem;
    }

    public void setPassagem(double passagem) {
        this.passagem = passagem;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getOnibus() {
        return onibus;
    }

    public void setOnibus(double onibus) {
        this.onibus = onibus;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

