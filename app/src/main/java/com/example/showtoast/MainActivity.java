package com.example.showtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chocolate_syrup, sprinkles, crushed_nuts, cherries, orio_cookies_crumbles;
    Button show_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chocolate_syrup = findViewById(R.id.chocolate_syrup_checkbox);
        sprinkles = findViewById(R.id.sprinkles_checkbox);
        crushed_nuts = findViewById(R.id.crushed_nuts_checkbox);
        cherries = findViewById(R.id.cherries_checkbox);
        orio_cookies_crumbles = findViewById(R.id.orio_cookies_crumbles_checkbox);
        show_toast = findViewById(R.id.btn_show_toast);
        show_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("Topping :");
                if(chocolate_syrup.isChecked()){
                    result.append("\t" + chocolate_syrup.getText().toString());
                }
                if(sprinkles.isChecked()){
                    result.append("\t" + sprinkles.getText().toString());
                }
                if(crushed_nuts.isChecked()){
                    result.append("\t" + crushed_nuts.getText().toString());
                }
                if(cherries.isChecked()){
                    result.append("\t" + cherries.getText().toString());
                }
                if(orio_cookies_crumbles.isChecked()){
                    result.append("\t" + orio_cookies_crumbles.getText().toString());
                }
                if(!chocolate_syrup.isChecked() && !sprinkles.isChecked() && !crushed_nuts.isChecked() && !cherries.isChecked() && !orio_cookies_crumbles.isChecked())
                    result.append("\tNone");
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.chocolate_syrup_checkbox:
                if(checked)
                    Log.d("Chocolate_syrup", "Checked");
                else
                    Log.d("Chocolate_syrup", "Unchecked");
                break;
            case R.id.sprinkles_checkbox:
                if(checked)
                    Log.d("Sprinkles", "Checked");
                else
                    Log.d("Sprinkles", "Unchecked");
                break;
            case R.id.crushed_nuts_checkbox:
                if(checked)
                    Log.d("Crushed_nuts", "Checked");
                else
                    Log.d("Crushed_nuts", "Unchecked");
                break;
            case R.id.cherries_checkbox:
                if(checked)
                    Log.d("Cherries", "Checked");
                else
                    Log.d("Cherries", "Unchecked");
            break;
            case R.id.orio_cookies_crumbles_checkbox:
                if(checked)
                    Log.d("Orio_cookies_crumbles", "Checked");
                else
                    Log.d("Orio_cookies_crumbles", "Unchecked");
                break;
        }
    }
}