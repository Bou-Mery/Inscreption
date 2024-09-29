package ma.ensa.tp1.tp_inscription;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText name , email ,phone , adresse  ;
    private Spinner villes;
    private Button envoyer ,annuler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        name =findViewById(R.id.nameInput);
        email =findViewById(R.id.emailInput);
        phone =findViewById(R.id.phoneInput);
        adresse =findViewById(R.id.adresseInput);
        villes =findViewById(R.id.villes);
        envoyer = findViewById(R.id.envoyer);
        annuler =findViewById(R.id.annuler);

        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);


                boolean validateForm = !name.getText().toString().isEmpty()
                            && !email.getText().toString().isEmpty()
                            && !phone.getText().toString().isEmpty()
                            && !adresse.getText().toString().isEmpty()
                            && !villes.getSelectedItem().toString().isEmpty();



               if(validateForm ){
                    intent.putExtra("name",name.getText().toString());
                    intent.putExtra("email",email.getText().toString());
                    intent.putExtra("phone",phone.getText().toString());
                    intent.putExtra("adresse",adresse.getText().toString());
                    intent.putExtra("villes",villes.getSelectedItem().toString());

                    startActivity(intent);

                }else{
                    Toast.makeText(MainActivity.this , "Tous les champs sont obligatoires" , Toast.LENGTH_LONG).show();
                }

            }


        });

      annuler.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              name.setText("");
              phone.setText("");
              adresse.setText("");
              email.setText("");
          }
      });





    }
}