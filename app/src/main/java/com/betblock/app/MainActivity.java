package com.betblock.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wire(R.id.btnAdmin, "Administrator controls arrive in Phase 2");
        wire(R.id.btnFamily, "Family management arrives in Phase 2");
        wire(R.id.btnSettings, "Settings arrive in a later phase");
    }

    private void wire(int buttonId, final String message) {
        Button b = findViewById(buttonId);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
