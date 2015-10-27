package org.ometa.actionbardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.ometa.actionbardemo.models.User;

public class RequestActivity extends AppCompatActivity {

    EditText etAge;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        etAge = (EditText) findViewById(R.id.et_age);
        User user = (User) getIntent().getSerializableExtra("age");
        etAge.setText(String.valueOf(user.getAge()));

        btnSubmit = (Button) findViewById(R.id.btn_Submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmit(v);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onSubmit(View view) {

        // 1. get new age
        int age = Integer.parseInt(etAge.getText().toString());
        // 2. construct intent
        Intent intent = new Intent();
        // 3. set age on intent
        intent.putExtra("age", age);
        // 4. return the result
        setResult(RESULT_OK, intent);
        // 5. close the activity
        finish();
    }


}
