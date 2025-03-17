public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartv = new SmartTv();

        System.out.println(smartv.ligada);
        System.out.println(smartv.canal);
        System.out.println(smartv.volume);

        smartv.ligar();
        System.out.println("Tv Ligada? : " + smartv.ligada);
        smartv.desligar();
        System.out.println("Tv Ligada? : " + smartv.ligada);

        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.aumentarVolume();
        System.out.println(smartv.volume);
        smartv.diminuirVolume();
        System.out.println(smartv.volume);

        smartv.aumentarCanal();
        System.out.println("Canal atual: " + smartv.canal);
        smartv.diminuirCanal();
        System.out.println("Canal atual: " + smartv.canal);
        smartv.mudarCanal(7);
        System.out.println("Canal atual: " + smartv.canal);

    }

}
