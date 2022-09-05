package com.example.calculatorrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText masukan1, masukan2;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView result;
    double bil1, bil2, getHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masukan1 = (EditText) findViewById(R.id.masukan1);
        masukan2 = (EditText) findViewById(R.id.masukan2);
        btnTambah = (Button) findViewById(R.id.tambah);
        btnKurang = (Button) findViewById(R.id.kurang);
        btnKali = (Button) findViewById(R.id.kali);
        btnBagi = (Button) findViewById(R.id.bagi);
        result = (TextView) findViewById(R.id.result);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                penjumlahan();
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pengurangan();
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                perkalian();
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pembagian();
            }
        });
    }

    private void penjumlahan() {
        bil1 = Double.parseDouble(masukan1.getText().toString());
        bil2 = Double.parseDouble(masukan2.getText().toString());

        getHasil = bil1 + bil2;
        result.setText(String.valueOf(getHasil));
    }
    private void pengurangan(){
        bil1 = Double.parseDouble(masukan1.getText().toString());
        bil2 = Double.parseDouble(masukan2.getText().toString());

        getHasil = bil1 - bil2;
        result.setText(String.valueOf(getHasil));
    }
    private void perkalian(){
        bil1 = Double.parseDouble(masukan1.getText().toString());
        bil2 = Double.parseDouble(masukan2.getText().toString());

        getHasil = bil1 * bil2;
        result.setText(String.valueOf(getHasil));
    }
    private void pembagian(){
        bil1 = Double.parseDouble(masukan1.getText().toString());
        bil2 = Double.parseDouble(masukan2.getText().toString());

        getHasil = bil1 / bil2;
        result.setText(String.valueOf(getHasil));
    }
}