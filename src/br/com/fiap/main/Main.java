package br.com.fiap.main;
import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.FolhaDePagamento;
import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {
        //mock test - com a classe Televisor
        Televisor tv = new Televisor();
        tv.canal = 5;
        tv.volume = 7;
        tv.trocarCanal(12);
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        System.out.printf("Canal: %d\nVolume: %d\n", tv.canal,  tv.volume);

        //mock test - com a classe ArCondicionado
        ArCondicionado ar = new ArCondicionado();
        ar.temperatura = 24;
        ar.modo = "Ventilar";
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.trocarModo("Resfriar");
        String mensagem = String.format("Modo: %s\nTemperatura: %d°C", ar.modo, ar.temperatura);
        System.out.println(mensagem);

        //mock test - com a classe FolhaDePagamento
        FolhaDePagamento  fp = new FolhaDePagamento();
        fp.salarioBruto = 2300;
        fp.descontoINSS = 20;
        fp.numeroDeDependentes = 3;
        fp.valorPlanoSaude = 100;
        fp.calcularSalarioLiquido();
        System.out.printf("Salário final: %.2f", fp.calcularSalarioLiquido());
    }
}

