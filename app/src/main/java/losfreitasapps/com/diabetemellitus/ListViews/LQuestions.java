package losfreitasapps.com.diabetemellitus.ListViews;

import java.util.ArrayList;
import java.util.List;
import losfreitasapps.com.diabetemellitus.Models.Question;
import losfreitasapps.com.diabetemellitus.R;

/**
 * Created by Moises on 06/02/17.
 */

public class LQuestions {
    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setEnunciado("A falta de atividade física, obesidade e alimentação inadequada são fatores que estão relacionados ao surgimento de qual tipo de diabetes mellitus?");
            question.setA("DM2");
            question.setB("DM1");
            question.setC("DM1 e DM2");
            question.setD("DM3");
            question.setE("DM4");
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setEnunciado("A hiperglicemia afeta o esqueleto em ambos os níveis da matriz óssea celular e extracelular, resultando em uma atividade exacerbada das células:");
            question.setA("Osteoclastos");
            question.setB("Osteoblastos");
            question.setC("Osteócitos");
            question.setD("Osteoblastos e osteócitos");
            question.setE("Osteoblastos e osteoclastos");
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(3L);
            question.setEnunciado("O acúmulo de produtos finais de glicação avançada(AGEs), provocado pela a hiperglicemia pode levar:");
            question.setA("Maior resistência óssea");
            question.setB("Concentração apenas em osso trabecular");
            question.setC("Concentração apenas em osso cortical");
            question.setD("Estrutura óssea equilibrada");
            question.setE("Menor resistência óssea.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(4L);
            question.setEnunciado("O diabetes mellitus classificam-se em tipo 1 e 2. Sendo que o diabetes mellitus 1 (DM1) atinge:");
            question.setA("Fase adulta");
            question.setB("Pós-menopausa");
            question.setC("Crianças e adolescentes (10 a 14 anos)");
            question.setD("Adolescentes (10 a 14 anos) e adultos");
            question.setE("Somente crianças");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(5L);
            question.setEnunciado("Como o diabetes mellitus favorece o processo de osteopenia/osteoporose?");
            question.setA("Aumentando o processo de formação óssea");
            question.setB("Diminuindo o processo de reabsorção óssea");
            question.setC("Afetando o equilíbrio entre a formação e a reabsorção óssea");
            question.setD("Afetando somente ossos trabeculares ");
            question.setE("Reduzindo a glicemia");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(6L);
            question.setEnunciado("A hiperglicemia compromete a função e a diferenciação das células ósseas, resultando:");
            question.setA("Alto turnover e formação óssea");
            question.setB("Baixo turnover e reabsorção óssea");
            question.setC("Alto turnover e reabsorção óssea");
            question.setD("Baixo turnover e formação óssea");
            question.setE("Baixo turnover e alta formação e reabsorção óssea.");
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(7L);
            question.setEnunciado("Doença caracterizada por elevar os níveis de glicose no sangue, em decorrência de defeitos na secreção ou na ação da insulina, ou ambas: ");
            question.setA("Hanseníase ");
            question.setB("Hipertireoidismo");
            question.setC("Tuberculose ");
            question.setD("Diabetes mellitus");
            question.setE("Anemia ");
            question.setGabarito(R.id.d);
            lquestion.add(question);
        }
        return lquestion;
    }
}
