package projet.example.projet_android.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import projet.example.projet_android.R;

public class interventionViewHolder extends RecyclerView.ViewHolder  {
    TextView textViewinterventionNom,textViewinterventionadd,textViewinterventiontemps,textViewinterventionsociete;
    private RecyclerView.RecyclerListener listener;

    public interventionViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewinterventionNom=itemView.findViewById(R.id.interventionNom);
        textViewinterventionsociete=itemView.findViewById(R.id.intervensionsociete);
        textViewinterventionadd=itemView.findViewById(R.id.intervensionadd);
        textViewinterventiontemps=itemView.findViewById(R.id.interventiontemps);

    }
    public interventionViewHolder(@NonNull View itemView, RecyclerView.RecyclerListener listener){
        super(itemView);
    }

}

