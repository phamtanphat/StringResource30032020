package com.example.stringresource30032020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item_language_en:
                Toast.makeText(this, "En", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item_language_vn:
                Toast.makeText(this, "Vn", Toast.LENGTH_SHORT).show();
                break;
        }
        item.setChecked(true);
        return super.onOptionsItemSelected(item);
    }
}
