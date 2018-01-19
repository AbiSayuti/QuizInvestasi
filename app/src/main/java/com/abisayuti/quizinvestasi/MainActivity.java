package com.abisayuti.quizinvestasi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etinput;
    Button btnHitung;
    TextView txtHasil, txthasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etinput = (EditText)findViewById(R.id.etinout);
        btnHitung = (Button) findViewById(R.id.btnhitung);
        txtHasil = (TextView) findViewById(R.id.txthasil);
        txthasil2 = (TextView) findViewById(R.id.txthasil2);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inout = etinput.getText().toString();

                Double inoutt = Double.parseDouble(inout);

                if(inout.isEmpty()){
                    etinput.setError("nilai investasi tidak boleh kosong");


                }else{

                    Double hasil = inoutt * 1 * 0.027;
                    Double hasil2 = inoutt * 2 * 0.027;



                    txtHasil.setText("nilai investasi selama satu tahun adalah" + hasil  + " rupiah" );
                    txthasil2.setText("nilai investasi selama dua tahun adalah" + hasil2  + " rupiah" );


                }

            }
        });

    }
}
