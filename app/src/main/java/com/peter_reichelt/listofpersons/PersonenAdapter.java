package com.peter_reichelt.listofpersons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonenAdapter extends RecyclerView.Adapter<PersonenAdapter.PersonHolder> {
    private List<Person> personenListe;
    private Context context;

    public PersonenAdapter(Context context, List<Person> personenListe){
        this.context = context;
        this.personenListe =personenListe;
    }

    public void updatePersonenListe(List<Person> personenListe){
        this.personenListe = personenListe;
    }

    @NonNull
    @Override
    public PersonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personenliste,parent,false);
        return new PersonenAdapter.PersonHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonenAdapter.PersonHolder holder, int position) {
        Person person = personenListe.get(position);
        ((PersonHolder) holder).bind(person);
    }

    @Override
    public int getItemCount() {
        return personenListe.size();
    }

    protected  class PersonHolder extends RecyclerView.ViewHolder{
        TextView tvPersonName;
        public PersonHolder(@NonNull View itemView) {
            super(itemView);
            tvPersonName = (TextView) itemView.findViewById(R.id.tvPersonName);
        }

        void bind(Person person){
            tvPersonName.setText(person.getVorname() +" "+person.getNachname());
        }
    }
}
