package com.example.task71;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1,text2,text3;
    EditText iText1,iText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.testFunction();
        text1 = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView2);

        iText2 = findViewById(R.id.editText2);

        iText2.addTextChangedListener(new TextWatcher() { // https://stackoverflow.com/questions/8699569/implementing-text-watcher-for-edittext
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void afterTextChanged(Editable s) {                text3 = findViewById(R.id.textView3);
                text3.setText(iText2.getText().toString());}
        });
    }

    public void testFunction (View v){
        System.out.println("HELLO WORLD!");
        text1.setText("HELLO WORLD!");
    }
    public void changeText (View v){
        iText1 = findViewById(R.id.editText);

        text2.setText(iText1.getText().toString());
        iText1.setText("");
    }

    public void changeText2(View v){
        text3 = findViewById(R.id.textView3);
        text3.setText(iText2.getText().toString());
    }
}
