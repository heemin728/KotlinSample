package com.example.kotlinsample;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.kotlinsample.databinding.ActivityMainBinding;
import com.example.kotlinsample.databinding.LayoutViewBindingBinding;

public class BmiJavaActivity extends AppCompatActivity {

    EditText tallField;
    EditText weightField;
    TextView resultLabel;
    Button bmiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        LayoutViewBindingBinding binding2;
        View root;
        binding2=LayoutViewBindingBinding.inflate(getLayoutInflater());
        root=binding2.getRoot();
        setContentView(root);

        tallField=findViewById(R.id.tallField);
        weightField=findViewById(R.id.weightField);
        resultLabel=findViewById(R.id.resultLabel);
        bmiButton=findViewById(R.id.bmiButton);

        bmiButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String tall=tallField.getText().toString();
                String weight=weightField.getText().toString();
                double bmi=Math.round(Double.parseDouble(weight)/Math.pow(Double.parseDouble(tall)/100.0,2)*100)/100.0;
                resultLabel.setText("키: "+tall+", 체중: "+weight+", bmi: "+bmi);
            }
        });

    }
}
