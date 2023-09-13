public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(27);
        System.out.println("Canal Atual: " + smartTv.canal);
        
        
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("TV ligada? " + smartTv.ligada);
        


    }
}
