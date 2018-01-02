package com.example.vincenttran.day2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioButton rbVer;
    RadioGroup grHor,grVer;
    LinearLayout layout;

    EditText txA;
    EditText txB;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        // LinearLayout


        grHor = (RadioGroup)findViewById(R.id.grHor);
        grVer = (RadioGroup)findViewById(R.id.grVer);

        layout = (LinearLayout)findViewById(R.id.Layout);

        RadioButton rbHor = (RadioButton)findViewById(R.id.rbHor);
        //rbHor.setOnClickListener(view->{
        //    Toast.makeText(this,"Ban da nhan vao radiobutton ngang",Toast.LENGTH_SHORT).show();
        //});
        rbHor.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) Toast.makeText(this,"Ban da nhan vao radiobutton ngang",Toast.LENGTH_SHORT).show();
        });

        grHor.setOnCheckedChangeListener(this);
        grVer.setOnCheckedChangeListener(this);


        //
        // Relative Layoyout
        Button btn = (Button)findViewById(R.id.btRes);

        txA = (EditText)findViewById(R.id.txA);
        txB = (EditText)findViewById(R.id.txB);
        res = (TextView)findViewById(R.id.txRes);

        btn.setOnClickListener(view->{
            int a = Integer.parseInt(txA.getText()+"");
            int b = Integer.parseInt((txB.getText())+"");
            int sum = a+b;
            res.setText(sum+"");
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId==R.id.rbHor) grHor.setOrientation(LinearLayout.HORIZONTAL);
        else  if(checkedId==R.id.rbVer) grHor.setOrientation(LinearLayout.VERTICAL);
        else  if(checkedId==R.id.rbLeft) grVer.setGravity(Gravity.LEFT);
        else  if(checkedId==R.id.rbCenter) grVer.setGravity(Gravity.CENTER_HORIZONTAL);
        else  if(checkedId==R.id.rbRight) grVer.setGravity(Gravity.RIGHT);

    }

}
