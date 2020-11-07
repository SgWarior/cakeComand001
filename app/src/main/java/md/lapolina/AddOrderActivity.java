package md.lapolina;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public class AddOrderActivity extends AppCompatActivity {

    DatePickerDialog picker;
    EditText editTextDate;
    CheckBox checkBox;
    TextView tvw;
   private final Double[] weights = {1.0, 1.5, 1.75, 2.0, 2.5, 2.75, 3.0, 3.5, 4.0, 4.5};
   private final String[] сomponents ={"Медовый","Сметаник","Poveste","Сказка","De Casa", "Napoleon"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_order_activity);

        editTextDate = findViewById(R.id.editTextDate);
        editTextDate.setInputType(InputType.TYPE_NULL);

        editTextDate.setOnClickListener(v -> {
            final Calendar cldr = Calendar.getInstance();
            int day = cldr.get(Calendar.DAY_OF_MONTH);
            int month = cldr.get(Calendar.MONTH);
            int year = cldr.get(Calendar.YEAR);
            // date picker dialog
            picker = new DatePickerDialog(AddOrderActivity.this,
                    (view, year1, monthOfYear, dayOfMonth) -> editTextDate.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year1), year, month, day);
            picker.show();
            String dayName=cldr.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
        });

        checkBox = findViewById(R.id.dataFixed);
        checkBox.setOnClickListener(v ->
            editTextDate.setEnabled(!checkBox.isChecked()));


        Spinner spinnerWeight = findViewById(R.id.SWweight);
        ArrayAdapter<Double> weightAdapter = new ArrayAdapter<Double>(this, android.R.layout.simple_spinner_item, weights);
        weightAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerWeight.setAdapter(weightAdapter);

        Spinner spinnerComponent = findViewById(R.id.SWcomponet);
        ArrayAdapter<String> componentAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, сomponents);
        componentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerComponent.setAdapter(componentAdapter);


    }
}


