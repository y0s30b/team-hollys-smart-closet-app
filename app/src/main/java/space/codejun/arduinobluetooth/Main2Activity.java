package space.codejun.arduinobluetooth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView ClothSectionTV2 = findViewById(R.id.ClothSection);

        String tempText = ((MainActivity)MainActivity.context_main).ClothSectionVal;
        ClothSectionTV2.setText(tempText);
    }
}
