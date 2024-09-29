package ma.ensa.tp1.tp_inscription;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    private TextView nameInfo , emailInfo , phoneInfo , adresseInfo , villeInfo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);



        nameInfo = findViewById(R.id.nameInfo);
        emailInfo = findViewById(R.id.emailInfo);
        phoneInfo = findViewById(R.id.phoneInfo);
        adresseInfo= findViewById(R.id.adresseInfo);
        villeInfo = findViewById(R.id.villeInfo);

        nameInfo.setText(this.getIntent().getStringExtra("name"));
        emailInfo.setText(this.getIntent().getStringExtra("email"));
        phoneInfo.setText(this.getIntent().getStringExtra("phone"));
        adresseInfo.setText(this.getIntent().getStringExtra("adresse"));
        villeInfo.setText(this.getIntent().getStringExtra("villes"));
    }
}