package com.example.vincenttran.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {

    EditText txres;
    float A=0,B=0;
    int ok = 0, operator = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button)findViewById(R.id.btn5);
        Button btn6 = (Button)findViewById(R.id.btn6);
        Button btn7 = (Button)findViewById(R.id.btn7);
        Button btn8 = (Button)findViewById(R.id.btn8);
        Button btn9 = (Button)findViewById(R.id.btn9);
        Button btnSum = (Button)findViewById(R.id.btnSum);
        Button btnSub = (Button)findViewById(R.id.btnSub);
        Button btnMul = (Button)findViewById(R.id.btnMul);
        Button btnDiv = (Button)findViewById(R.id.btnDiv);
        Button btnDot = (Button)findViewById(R.id.btnDot);
        Button btn0 = (Button)findViewById(R.id.btn0);
        Button btnResult = (Button)findViewById(R.id.btnResult);

        txres = (EditText)findViewById(R.id.txResult);

        btn0.setOnClickListener(view->{
            if(ok ==0) settext("0");
            else {
                txres.setText("");
                ok =0;
                settext("0");
            }
        });
        btn1.setOnClickListener(view->{
            if(ok ==0) settext("1");
            else {
                txres.setText("");
                ok =0;
                settext("1");
            }
        });
        btn2.setOnClickListener(view->{
            if(ok ==0) settext("2");
            else {
                txres.setText("");
                ok =0;
                settext("2");
            }
        });
        btn3.setOnClickListener(view->{
            if(ok ==0) settext("3");
            else {
                txres.setText("");
                ok =0;
                settext("3");
            }
        });
        btn4.setOnClickListener(view->{
            if(ok ==0) settext("4");
            else {
                txres.setText("");
                ok =0;
                settext("4");
            }
        });
        btn5.setOnClickListener(view->{
            if(ok ==0) settext("5");
            else {
                txres.setText("");
                ok =0;
                settext("5");
            }
        });
        btn6.setOnClickListener(view->{
            if(ok ==0) settext("6");
            else {
                txres.setText("");
                ok =0;
                settext("6");
            }
        });
        btn7.setOnClickListener(view->{
            if(ok ==0) settext("7");
            else {
                txres.setText("");
                ok =0;
                settext("7");
            }
        });
        btn8.setOnClickListener(view->{
            if(ok ==0) settext("8");
            else {
                txres.setText("");
                ok =0;
                settext("8");
            }
        });
        btn9.setOnClickListener(view->{
            if(ok ==0) settext("9");
            else {
                txres.setText("");
                ok =0;
                settext("9");
            }
        });
        btnDot.setOnClickListener(view->{
            if(ok ==0){
                if(!txres.getText().toString().contains("."))
                    settext(".");
            }
            else {
                txres.setText("");
                ok =0;
                settext(".");
            }
        });
        btnSum.setOnClickListener(view->{
            A = Float.parseFloat(txres.getText()+"");
            txres.setText("+");
            ok = 1;
            operator =1;
        });
        btnSub.setOnClickListener(view->{
            if(TextUtils.isEmpty(txres.getText().toString())){
                txres.setText("-");
                ok=0;
            }
            else {
                A = Float.parseFloat(txres.getText()+"");
                ok = 1;
                txres.setText("-");
                operator =2;
            }
        });
        btnMul.setOnClickListener(view->{
            A = Float.parseFloat(txres.getText()+"");
            txres.setText("*");
            ok = 1;
            operator =3;
        });
        btnDiv.setOnClickListener(view->{
            A = Float.parseFloat(txres.getText()+"");
            txres.setText("/");
            ok = 1;
            operator =4;
        });
        btnResult.setOnClickListener(view->{
            B = Float.parseFloat(txres.getText()+"");
            if(operator ==1) txres.setText((A+B)+"");
            else if(operator ==2) txres.setText((A-B)+"");
            else if(operator ==3) txres.setText((A*B)+"");
            else if(operator ==4) txres.setText((A/B)+"");
            ok = 1;
        });
    }
    public void settext(String input){
        txres.setText(txres.getText().toString()+input);
    }
}
