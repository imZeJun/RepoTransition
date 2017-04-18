package com.demo.lizejun.repotransition;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class TextInputActivity extends AppCompatActivity {

    private static final int MAX_PASSWORD_LEN = 20;

    private TextInputLayout mPasswordTextInput;
    private EditText mPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input);
        mPasswordTextInput = (TextInputLayout) findViewById(R.id.til_password);
        mPasswordEditText = (EditText) findViewById(R.id.et_password);
        checkError();
        checkCount();
        hidePassword();
    }

    private void checkError() {
        mPasswordEditText.addTextChangedListener(new TextWatcher() {

            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override public void afterTextChanged(Editable s) {
                int len = s.length();
                if (len > MAX_PASSWORD_LEN) {
                    mPasswordTextInput.setError("Max Password len is " + MAX_PASSWORD_LEN);
                } else {
                    mPasswordTextInput.setErrorEnabled(false);
                }
            }
        });
    }

    private void checkCount() {
        mPasswordTextInput.setCounterEnabled(true);
        mPasswordTextInput.setCounterMaxLength(MAX_PASSWORD_LEN);
    }

    private void hidePassword() {
        mPasswordTextInput.setPasswordVisibilityToggleEnabled(true);
    }
}
