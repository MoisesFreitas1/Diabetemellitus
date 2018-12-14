package losfreitasapps.com.diabetemellitus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import losfreitasapps.com.diabetemellitus.ShowActivities.ShowQuestion;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        ImageView dmbutton = (ImageView) findViewById(R.id.dmbutton);
        dmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectActivity.this, MainActivity.class));
            }
        });

        ImageView quizbutton = (ImageView) findViewById(R.id.quizbutton);
        quizbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectActivity.this, ShowQuestion.class));
            }
        });
    }
}
