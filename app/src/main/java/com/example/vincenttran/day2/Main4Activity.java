package com.example.vincenttran.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        EditText txA = (EditText)findViewById(R.id.txtA);
        EditText txB = (EditText)findViewById(R.id.txtB);
        EditText txRes = (EditText)findViewById(R.id.txtKetQua);

        Button btn = (Button)findViewById(R.id.btnGiaiPT);

        btn.setOnClickListener(view->{
            int a = Integer.parseInt(txA.getText().toString());
            int b = Integer.parseInt(txB.getText().toString());
            String res = "";
            if(a==0){
                if(b==0) res = "Phương trình vô số nghiệm";
                else res = "Phương trình vô nghiệm";
            }
            else {
                res = "Nghiệm la : "+ (-b*1.0/a);
            }
            txRes.setText(res);
            txA.setText("");
            txB.setText("");
        });
    }
}
