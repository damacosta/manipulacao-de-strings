
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        //Mensagem Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Danielle";

        // A norma ISO 8601 é um padrão internacional que descreve a representação de datas e horários

        LocalDate hoje = LocalDate.now();
        Locale brasil = Locale.forLanguageTag("pt-BR");

        /* Este código irá imprimir o dia da semana atual em Português do Brasil no terminal.  
        System.out.println(hoje.getDayOfWeek(). getDisplayName(TextStyle.FULL, brasil)); */

        String diaSemana = hoje.getDayOfWeek(). getDisplayName(TextStyle.FULL, brasil);
        
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if(agora.getHour() >= 0 && agora.getHour() <12) {
            saudacao= "bom dia";
        } else if(agora.getHour() >= 12 && agora.getHour() <18) {
            saudacao= "bom tarde";
        } else if(agora.getHour() >= 18 && agora.getHour() <24) {
            saudacao= "boa noite";
        } else {
            saudacao= "Olá.";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

    }
}
