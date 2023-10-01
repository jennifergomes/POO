package questao4;

import javax.sound.midi.Soundbank;

public abstract class Celular implements ICelular {
    private boolean ligar, desligar, camera, fone, volume, mensagem, internet, email, radio, tv, arquivos;
    private double preco;

    public Celular(boolean ligar, boolean desligar, boolean camera, boolean fone, boolean volume, boolean mensagem, boolean internet, boolean email, boolean radio, boolean tv, boolean arquivos, double preco) {
        this.ligar = ligar;
        this.desligar = desligar;
        this.camera = camera;
        this.fone = fone;
        this.volume = volume;
        this.mensagem = mensagem;
        this.internet = internet;
        this.email = email;
        this.radio = radio;
        this.tv = tv;
        this.arquivos = arquivos;
        this.preco = preco;
    }

    public void imprimirDados(){


        System.out.println("O celular liga? " +this.ligar);
        System.out.println("O celular desliga? " +this.desligar);
        System.out.println("O celular tem câmera? " +this.camera);
        System.out.println("O celular tem fone? " +this.fone);
        System.out.println("O celular controla voluma? " +this.volume);
        System.out.println("O celular envia mensagem? " +this.mensagem);
        System.out.println("O celular acessa internet? " +this.internet);
        System.out.println("O celular envia e-mail? " +this.email);
        System.out.println("O celular tem rádio? " +this.radio);
        System.out.println("O celular tem TV? " +this.tv);
        System.out.println("O celular tem sistema de arquivos? " +this.arquivos);
        System.out.println("O preço do celular é: " +this.preco);


    }
}
