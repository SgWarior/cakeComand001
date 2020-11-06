package md.lapolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton addOrderButton;
    Button changeOrderButton;
    ImageButton removeOrderButton;
    Button showAllOrdersButton;
    Button showAllOrdersByDateButton;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(R.id.textView); //TODO delete this view

        {
            addOrderButton = findViewById(R.id.addOrderButton);
            changeOrderButton = findViewById(R.id.changeOrderButton);
            removeOrderButton = findViewById(R.id.removeOrderButton);
            showAllOrdersButton = findViewById(R.id.showAllOrdersButton);
            showAllOrdersByDateButton = findViewById(R.id.showByDateOrdersButton);
            addOrderButton.setOnClickListener(this);
            changeOrderButton.setOnClickListener(this);
            removeOrderButton.setOnClickListener(this);
            showAllOrdersButton.setOnClickListener(this);
            showAllOrdersByDateButton.setOnClickListener(this);
        }//initialization of all buttons

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.addOrderButton:myTextView.setText("add prest");break;
            case R.id.changeOrderButton: myTextView.setText("change prest");break;
            case R.id.removeOrderButton: myTextView.setText("remove presst");break;
            case R.id.showByDateOrdersButton: myTextView.setText(" show by dare prest");break;
            case R.id.showAllOrdersButton: myTextView.setText("show all orders prest");break;
        }
    }
}