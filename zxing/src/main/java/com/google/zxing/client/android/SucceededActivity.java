package com.google.zxing.client.android;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SucceededActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succeeded);
        TextView textView = findViewById(R.id.succeeded_text);
        String displayResult = getIntent().getStringExtra("displayResult");
        textView.setText(displayResult);
        ImageView imageView = findViewById(R.id.succeeded_image);
        Bitmap bitmap = getIntent().getParcelableExtra("bitmap");
        imageView.setImageBitmap(bitmap);
    }
}
