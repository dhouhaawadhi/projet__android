package projet.example.projet_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText password, edittextemail;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signin(View view) {


        edittextemail = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        button = findViewById(R.id.button);


        String email;
        String pass;
        email = edittextemail.getText().toString();
        pass = password.getText().toString();
        if (email.isEmpty()) {
            edittextemail.setError("email est vide");
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edittextemail.setError("email is not match");
        } else if (pass.isEmpty()) {
            password.setError("password est vide");
        } else {
            startActivity(new Intent(MainActivity.this, interventions.class));
        }


    }
}
