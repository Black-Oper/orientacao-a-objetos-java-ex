public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private int velo;

    public Carro(String marca, String modelo, String placa, int ano, int velo){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.velo = velo;
    }

    public String getMarca(){
        return marca;
    }

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public int getVelo(){
        return velo;
    }

    public void acelerar(){
        this.velo = velo + 5;        
    }

    public void frear(){
        if (this.velo < 5) {
            this.velo = 0;
        } else {
            this.velo = this.velo - 5;
        }
    }
}