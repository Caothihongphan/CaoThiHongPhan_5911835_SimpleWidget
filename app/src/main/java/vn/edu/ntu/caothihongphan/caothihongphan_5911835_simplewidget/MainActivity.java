package vn.edu.ntu.caothihongphan.caothihongphan_5911835_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.security.cert.Extension;
import java.time.ZoneOffset;

public class MainActivity extends AppCompatActivity {
    TextView bntXN;
    EditText edtTenBan, edtngaySinh, edtSoThich;
    RadioGroup rdgGioiTinh, rdgSoThich;
    Button rbNam, rbNu,btnXN;
    CheckBox ckXP, ckNN, ckCF, ckHome, ckCook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }

    private void addView() {
        edtTenBan = (EditText) findViewById(R.id.edtTenBan);
        edtngaySinh = (EditText) findViewById(R.id.edtNgaysinh);
        edtSoThich = (EditText) findViewById(R.id.edtSoThich);
        rdgGioiTinh = (RadioGroup) findViewById(R.id.rdgGioitinh);
        rdgSoThich = (RadioGroup) findViewById(R.id.rdgSothich);
        btnXN = (Button) findViewById(R.id.btnXN);
        rbNam = (Button) findViewById(R.id.rbNam);
        rbNu = (Button) findViewById(R.id.rbNu);
        ckXP = (CheckBox) findViewById(R.id.ckXP);
        ckNN = (CheckBox) findViewById(R.id.ckNN);
        ckCF = (CheckBox) findViewById(R.id.ckCF);
        ckHome = (CheckBox) findViewById(R.id.ckHome);
        ckCook = (CheckBox) findViewById(R.id.ckCook);


    }

    private void addEvent() {
        rdgGioiTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId())
                {
                    case R.id.rbNam:
                        break;
                    case R.id.rbNu:
                        break;

                }

  }
                                       });

        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Hoten = edtTenBan.getText().toString() + " \n";
                Toast.makeText(MainActivity.this,Hoten,Toast.LENGTH_LONG).show();
                String ngaySinh = "Ngày sinh: " + edtngaySinh.getText().toString() + "\n ";
                Toast.makeText(MainActivity.this,ngaySinh,Toast.LENGTH_LONG).show();

                String soThich = " Sở thích: ";
                if(ckXP.isChecked())
                {
                    soThich +=ckXP.getText() + "\n";
                }
                if(ckNN.isChecked())
                {
                    soThich +=ckNN.getText() + "\n";
                }
                if(ckCF.isChecked())
                {
                    soThich +=ckCF.getText() + "\n";
                }
                if(ckHome.isChecked())
                {
                    soThich +=ckHome.getText() + "\n";
                }
                if(ckCook.isChecked())
                {
                    soThich +=ckCook.getText() + "\n";
                }

            Toast.makeText(MainActivity.this,soThich,Toast.LENGTH_SHORT).show();
            }
        }
        );

}
}

