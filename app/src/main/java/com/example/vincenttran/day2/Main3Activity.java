package com.example.vincenttran.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    String[] can = {"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỷ"};
    String[] chi = {"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mão","Thìn","Tỵ","Ngọ","Mùi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView txtRes = (TextView)findViewById(R.id.txtAm);
        EditText input = (EditText)findViewById(R.id.txInput);
        Button btn = (Button)findViewById(R.id.btDoi);

        btn.setOnClickListener(view->{
            int n = Integer.parseInt(input.getText().toString());
            String result = can[n%10]+" "+chi[n%12];
            txtRes.setText(result);
        });
    }
}
