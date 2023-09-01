public class SmartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume = volume +1;
    }

    public void diminuirVolume(){
        volume = volume -1;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal; 
    }

    public void aumentarCanal(){
        canal = canal +1;
    }

    public void diminuirCanal(){
        canal = canal -1;
    }
}
