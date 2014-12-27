package com.github.jivimberg.autoresizetextview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.github.jivimberg.autoresizetextview.font.CustomFont;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView autoResizeTextView = (TextView) findViewById(R.id.textView);
        autoResizeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Choose a different font
                CustomFont newFont;
                do{
                    newFont = CustomFont.randomFont();
                } while(newFont.getFont(getAssets()) == autoResizeTextView.getTypeface());

                newFont.setType(autoResizeTextView, getAssets());
            }
        });

        final EditText input = (EditText) findViewById(R.id.input);
        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                autoResizeTextView.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

}
