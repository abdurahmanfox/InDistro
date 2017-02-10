package com.navycoding.indistro.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.navycoding.indistro.R;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    @ViewById(R.id.in_email)
    EditText email;

    @ViewById(R.id.in_password)
    EditText password;

    @Click(R.id.btn_login)
    void onLoginClicked() {
        setResult(RESULT_OK);
        finish();
    }

}
