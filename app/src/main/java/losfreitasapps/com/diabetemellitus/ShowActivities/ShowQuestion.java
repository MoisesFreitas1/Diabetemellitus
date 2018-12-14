package losfreitasapps.com.diabetemellitus.ShowActivities;


import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

import losfreitasapps.com.diabetemellitus.ListViews.LQuestions;
import losfreitasapps.com.diabetemellitus.Models.Question;
import losfreitasapps.com.diabetemellitus.R;

public class ShowQuestion extends AppCompatActivity {
    private TextView textView;
    private TextView enunciadoTextView;
    private TextView textoa1TextView;
    private TextView textob1TextView;
    private TextView textoc1TextView;
    private TextView textod1TextView;
    private TextView textoe1TextView;
    private TextView corrigir;
    private TextView proxima;
    private LinearLayout a;
    private LinearLayout b;
    private LinearLayout c;
    private LinearLayout d;
    private LinearLayout e;
    private int alternativa;
    private int tentativas;
    int[] nquestion;
    int nquestions;
    int m;
    private int opcao;
    private Question question;
    private boolean mark = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_question);

        textView = (TextView) findViewById(R.id.textView);
        enunciadoTextView = (TextView) findViewById(R.id.enunciadoTextView);
        textoa1TextView = (TextView) findViewById(R.id.textoa1TextView);
        textob1TextView = (TextView) findViewById(R.id.textob1TextView);
        textoc1TextView = (TextView) findViewById(R.id.textoc1TextView);
        textod1TextView = (TextView) findViewById(R.id.textod1TextView);
        textoe1TextView = (TextView) findViewById(R.id.textoe1TextView);
        corrigir = (TextView) findViewById(R.id.corrigir);
        proxima = (TextView) findViewById(R.id.proxima);
        a = (LinearLayout) findViewById(R.id.a);
        b = (LinearLayout) findViewById(R.id.b);
        c = (LinearLayout) findViewById(R.id.c);
        d = (LinearLayout) findViewById(R.id.d);
        e = (LinearLayout) findViewById(R.id.e);

        YoYo.with(Techniques.ZoomInDown).duration(900).playOn(findViewById(R.id.cv_list));
        YoYo.with(Techniques.SlideInUp).duration(750).playOn(findViewById(R.id.enunciadoTextView));
        YoYo.with(Techniques.SlideInUp).duration(1000).playOn(findViewById(R.id.A));
        YoYo.with(Techniques.SlideInUp).duration(1000).playOn(findViewById(R.id.a));
        YoYo.with(Techniques.SlideInUp).duration(1250).playOn(findViewById(R.id.B));
        YoYo.with(Techniques.SlideInUp).duration(1250).playOn(findViewById(R.id.b));
        YoYo.with(Techniques.SlideInUp).duration(1500).playOn(findViewById(R.id.C));
        YoYo.with(Techniques.SlideInUp).duration(1500).playOn(findViewById(R.id.c));
        YoYo.with(Techniques.SlideInUp).duration(1750).playOn(findViewById(R.id.D));
        YoYo.with(Techniques.SlideInUp).duration(1750).playOn(findViewById(R.id.d));
        YoYo.with(Techniques.SlideInUp).duration(2000).playOn(findViewById(R.id.E));
        YoYo.with(Techniques.SlideInUp).duration(2000).playOn(findViewById(R.id.e));

        m=0;
        tentativas=0;
        nquestions = 7;
        nquestion = new int[7];
        int tquestions [];
        int aux;
        Random random  = new Random();
        tquestions = new int[nquestions];
        for(int b=0;b<nquestions;b++){
            tquestions[b]=b+1;
        }
        for (int n=0;n<7;n++){
            do{
                aux=random.nextInt(nquestions);
                nquestion[n]=tquestions[aux];
            }while(tquestions[aux]==0);
            tquestions[aux]=0;
        }

        textView.setText((m + 1) + " de "+nquestion.length);
        question = LQuestions.getLquestion().get(nquestion[m]-1);
        enunciadoTextView.setText(question.getEnunciado());
        textoa1TextView.setText(question.getA());
        textob1TextView.setText(question.getB());
        textoc1TextView.setText(question.getC());
        textod1TextView.setText(question.getD());
        textoe1TextView.setText(question.getE());
        alternativa=question.getGabarito();
        a.setBackgroundColor(Color.parseColor("#FFFFFF"));
        b.setBackgroundColor(Color.parseColor("#FFFFFF"));
        c.setBackgroundColor(Color.parseColor("#FFFFFF"));
        d.setBackgroundColor(Color.parseColor("#FFFFFF"));
        e.setBackgroundColor(Color.parseColor("#FFFFFF"));

        a.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        a.setBackgroundColor(Color.parseColor("#778899"));
                        b.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        c.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        d.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        e.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        opcao = R.id.a;
                        mark = true;
                    }
                });
        b.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        a.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        b.setBackgroundColor(Color.parseColor("#778899"));
                        c.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        d.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        e.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        opcao = R.id.b;
                        mark = true;
                    }
                });
        c.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        a.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        b.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        c.setBackgroundColor(Color.parseColor("#778899"));
                        d.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        e.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        opcao = R.id.c;
                        mark = true;
                    }
                });
        d.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        a.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        b.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        c.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        d.setBackgroundColor(Color.parseColor("#778899"));
                        e.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        opcao = R.id.d;
                        mark = true;
                    }
                });
        e.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        a.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        b.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        c.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        d.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        e.setBackgroundColor(Color.parseColor("#778899"));
                        opcao = R.id.e;
                        mark = true;
                    }
                });

        proxima.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (m == (nquestion.length-1)) {
                    if(mark == true){
                        if (opcao == alternativa){
                            tentativas = tentativas + 1;
                        }
                        AlertDialog.Builder mensagem1 = new AlertDialog.Builder(ShowQuestion.this);
                        mensagem1.setTitle("   Fim do teste");
                        mensagem1.setMessage(tentativas + " acertos");
                        mensagem1.setPositiveButton("Finalizar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        });
                        mensagem1.show();
                        mark = false;
                    } else{
                        Toast.makeText(ShowQuestion.this, "Marque uma alternativa", Toast.LENGTH_SHORT).show();
                    }
                }

                if (m < (nquestion.length-1)) {
                    if(mark == true){
                        if (opcao == alternativa){
                            tentativas = tentativas + 1;
                        }
                        a.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        b.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        c.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        d.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        e.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        m = m + 1;
                        textView.setText((m + 1) + " de "+nquestion.length);
                        question = LQuestions.getLquestion().get(nquestion[m]-1);
                        enunciadoTextView.setText(question.getEnunciado());
                        textoa1TextView.setText(question.getA());
                        textob1TextView.setText(question.getB());
                        textoc1TextView.setText(question.getC());
                        textod1TextView.setText(question.getD());
                        textoe1TextView.setText(question.getE());
                        alternativa = question.getGabarito();
                        opcao = question.getGabarito();
                        YoYo.with(Techniques.SlideInRight).duration(900).playOn(findViewById(R.id.cv_list));
                        YoYo.with(Techniques.SlideInUp).duration(750).playOn(findViewById(R.id.enunciadoTextView));
                        YoYo.with(Techniques.SlideInUp).duration(1000).playOn(findViewById(R.id.A));
                        YoYo.with(Techniques.SlideInUp).duration(1000).playOn(findViewById(R.id.a));
                        YoYo.with(Techniques.SlideInUp).duration(1250).playOn(findViewById(R.id.B));
                        YoYo.with(Techniques.SlideInUp).duration(1250).playOn(findViewById(R.id.b));
                        YoYo.with(Techniques.SlideInUp).duration(1500).playOn(findViewById(R.id.C));
                        YoYo.with(Techniques.SlideInUp).duration(1500).playOn(findViewById(R.id.c));
                        YoYo.with(Techniques.SlideInUp).duration(1750).playOn(findViewById(R.id.D));
                        YoYo.with(Techniques.SlideInUp).duration(1750).playOn(findViewById(R.id.d));
                        YoYo.with(Techniques.SlideInUp).duration(2000).playOn(findViewById(R.id.E));
                        YoYo.with(Techniques.SlideInUp).duration(2000).playOn(findViewById(R.id.e));
                        mark = false;
                    } else{
                        Toast.makeText(ShowQuestion.this, "Marque uma alternativa", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        corrigir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mark == true){
                    if (opcao != alternativa) {
                        if(opcao == R.id.a){
                            a.setBackgroundColor(Color.parseColor("#F08080"));
                        } else if(opcao == R.id.b){
                            b.setBackgroundColor(Color.parseColor("#F08080"));
                        } else if(opcao == R.id.c){
                            c.setBackgroundColor(Color.parseColor("#F08080"));
                        } else if(opcao == R.id.d){
                            d.setBackgroundColor(Color.parseColor("#F08080"));
                        } else if(opcao == R.id.e){
                            e.setBackgroundColor(Color.parseColor("#F08080"));
                        }
                        if(alternativa==R.id.a){
                            a.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if(alternativa == R.id.b){
                            b.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if(alternativa == R.id.c){
                            c.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if(alternativa == R.id.d){
                            d.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if(alternativa == R.id.e){
                            e.setBackgroundColor(Color.parseColor("#00FA9A"));
                        }
                    }
                    if(opcao == alternativa){
                        if(opcao == R.id.a){
                            a.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if(opcao == R.id.b){
                            b.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if(opcao == R.id.c){
                            c.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if(opcao == R.id.d){
                            d.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if(opcao == R.id.e){
                            e.setBackgroundColor(Color.parseColor("#00FA9A"));
                        }
                    }
                } else{
                    Toast.makeText(ShowQuestion.this, "Marque uma alternativa", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}