package com.timkontrakan.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TentangActivity extends AppCompatActivity {

    private ImageView instagram, whatsapp, facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        instagram = findViewById(R.id.instagram);
        whatsapp = findViewById(R.id.whatsapp);
        facebook = findViewById(R.id.facebook);

        setInstagram();
        setFacebook();
        setWhatsapp();
    }

    public void setInstagram(){
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/ssidik.28"));
                startActivity(intent);
                finish();
            }
        });
    }

    public void setFacebook(){
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/sidik.roestiawan"));
                startActivity(intent);
                finish();
            }
        });
    }

    public void setWhatsapp(){
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "085877650467";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(TentangActivity.this, HomeActivity.class));
        super.onBackPressed();
    }
}
