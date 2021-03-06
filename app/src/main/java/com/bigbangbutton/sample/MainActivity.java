package com.bigbangbutton.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;

import com.bigbangbutton.editcodeview.EditCodeListener;
import com.bigbangbutton.editcodeview.EditCodeView;
import com.bigbangbutton.editcodeview.EditCodeWatcher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

        EditCodeView editCodeView = (EditCodeView) findViewById(R.id.edit_code);
        editCodeView.setEditCodeListener(new EditCodeListener() {
            @Override
            public void onCodeReady(String code) {

            }
        });

        editCodeView.setEditCodeWatcher(new EditCodeWatcher() {
            @Override
            public void onCodeChanged(String code) {
                Log.e("CodeWatcher", " changed : " + code);
            }
        });

        editCodeView.requestFocus();
        editCodeView.setCode("1132");

    }
}
