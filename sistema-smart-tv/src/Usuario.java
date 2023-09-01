public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esta ligada: " + smartTv.ligada);
        System.out.println("O canal da TV é o: " + smartTv.canal);
        System.out.println("Atual volume da TV: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo status da TV, ligada?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status da TV, ligada?:" + smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Volume aumentou, volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume diminuiu, volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("O canal aumentou, canal atual:" + smartTv.canal);
        
        smartTv.mudarCanal(13);
        System.out.println("O canal mudou, canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("O canal diminuiu, canal atual: " + smartTv.canal);
    }
}
