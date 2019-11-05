package com.thohao.alertdialog_kp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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

//VD vế xay dung Builder, Builder thay the cho constructor
        /*BanhMi banhMi=new BanhMiFastFood()
                .loai("Banh que")
                .caChua("ca chua bi")
                .nuocUong("Coca Cola")
                .build();

        Log.d("BBB",banhMi.getNuocSot());*/

        btnAlertDialog=findViewById(R.id.buttonAlertDialog);
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Hop thoai xac nhan tat app ?");
                builder.setMessage("Ban hay xac nhan ben duoi");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();//thoat app
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();//cancel() tat giao dien, dismiss() xoa het thong tin
                    }
                });
                builder.show();
            }
        });

    }
}
