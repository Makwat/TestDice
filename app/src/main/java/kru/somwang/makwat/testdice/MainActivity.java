package kru.somwang.makwat.testdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageDice;
    private Button btnback, btnran, btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();

        btnback();
        btnran();
        btnnext();
    }

    private void btnnext() {
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void btnran() {
        btnran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void btnback() {
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void bindWidget() {
        imageDice = (ImageView) findViewById(R.id.imageDice);
        btnback = (Button) findViewById(R.id.btnback);
        btnran = (Button) findViewById(R.id.btnran);
        btnnext = (Button) findViewById(R.id.btnnext);

    }


}
