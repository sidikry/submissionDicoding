package com.timkontrakan.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainDetail extends AppCompatActivity {

    private Button button;
    private ImageView tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_detail);

        Intent intent = getIntent();
        Product product = intent.getParcelableExtra("Product_Name");

        String desc = product.getDetail();
        String name = product.getName();
        String materi = product.getMateri();
        int imageView = product.getPhoto();
        button = findViewById(R.id.btnDaftar);
        tentang = findViewById(R.id.tentang);

        TextView textView3 = findViewById(R.id.materi);
        textView3.setText(materi);

        TextView textView2 = findViewById(R.id.name_product);
        textView2.setText(name);

        TextView textView1 = findViewById(R.id.description);
        textView1.setText(desc);

        ImageView imageView1 = findViewById(R.id.img_product);
        imageView1.setImageResource(imageView);
        btnDaftar();
        setTentang();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MainDetail.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

    public void btnDaftar(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dicoding.com/"));
                startActivity(intent);
                finish();
            }
        });
    }

    public void setTentang(){
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainDetail.this, TentangActivity.class));
                finish();
            }
        });
    }
}
