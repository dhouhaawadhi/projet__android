package projet.example.projet_android.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import projet.example.projet_android.R;
import projet.example.projet_android.intervention2;
import projet.example.projet_android.modele.intervention;

public class interventionAdapter extends RecyclerView.Adapter<interventionViewHolder>

 {
    private List<intervention> InterventionList;
    private Context context;
    public interventionAdapter(List<intervention> interventionList,Context context) {
        this.InterventionList=interventionList;
        this.context=context;

    }

    @NonNull
    @Override
    public interventionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_intervention,parent,false);

        return new interventionViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull interventionViewHolder holder, int position) {

        intervention intervention=InterventionList.get(position);
        holder.textViewinterventionNom.setText(intervention.getNom());
        holder.textViewinterventionsociete.setText(intervention.getSociet());
        holder.textViewinterventionadd.setText(intervention.getAdd());
        holder.textViewinterventiontemps.setText(intervention.getTemp());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, intervention2.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return InterventionList.size();
    }
}

