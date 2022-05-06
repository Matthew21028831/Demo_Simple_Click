package sg.edu.rp.c36.id21028831.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText et;
    TextView tvDisplay;
    ToggleButton ma;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.btn1);
        et =findViewById(R.id.editTextInput);
        tvDisplay= findViewById(R.id.textViewDisplay);
        ma= findViewById(R.id.toggleButtonEnabled);
        rgGender= findViewById(R.id.radioGroup);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Code for the action
            public void onClick(View view) {
                String txt = et.getText().toString();
                tvDisplay.setText(txt);
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_LONG).show();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    tvDisplay.setText("He says " +txt);

                }
                else if(checkedRadioId == R.id.radioButtonGenderFemale){
                    tvDisplay.setText("She says " +txt);


                }
            }


        });

        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            //Code for the action
            public void onClick(View view) {
                if (ma.isChecked()){
                    et.setEnabled(true);
                }else{
                    et.setEnabled(false);
                }
            }

        });


    }


}