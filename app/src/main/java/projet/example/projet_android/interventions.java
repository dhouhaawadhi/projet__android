package projet.example.projet_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import projet.example.projet_android.adapter.interventionAdapter;
import projet.example.projet_android.modele.intervention;

public class interventions extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interventions);
        recyclerView =findViewById(R.id.recyclerview2);
        final List<intervention> InterventionList=new ArrayList<>();
        InterventionList.add(new intervention("inter1","Entreprise info","Rue 123","6:00_10:30")) ;
        InterventionList.add(new intervention("inter2","Entreprise produit","Rue 456","8:00_10:10")) ;
        InterventionList.add(new intervention("inter3","Entreprise autre","Rue 789","7:00_08:00")) ;
        InterventionList.add(new intervention("inter4","Entreprise voiture","Rue 147","06:00_10:00")) ;

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(interventions.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);


        interventionAdapter interventionAdapter=new interventionAdapter(InterventionList,interventions.this);
        recyclerView.setAdapter(interventionAdapter);
    }
}