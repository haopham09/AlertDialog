package com.thohao.alertdialog_kp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAlertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*BanhMi banhMi=new BanhMi("Banh tron", "salad son", "Ca chua bi", "Sot bo", "Coca cola");
        Log.d("BBB", banhMi.getSalad());*/
        /*cac chuc nang cua Builder:
        * cac chua nang set lai cho o banh mi
        * Build o banh mi voi cac chuc nang muon set lai*/
        BanhMi banhMi=new BanhMiFastFood()
                .loai("Banh que")
                .caChua("ca chua bi")
                .nuocUong("Coca Cola")
                .build();

        Log.d("BBB",banhMi.getNuocSot());

        btnAlertDialog=findViewById(R.id.buttonAlertDialog);
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }
}
