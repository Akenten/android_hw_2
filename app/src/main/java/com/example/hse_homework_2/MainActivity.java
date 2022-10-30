package com.example.hse_homework_2;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends Activity {

    Button findbutton;
    TextInputEditText text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findbutton = findViewById(R.id.button);
        text = findViewById(R.id.textinput);
        View.OnClickListener onClikFindButton = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = text.getText().toString();
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, str);
                startActivity(intent);

            }
        };

        findbutton.setOnClickListener(onClikFindButton);
    }

}
