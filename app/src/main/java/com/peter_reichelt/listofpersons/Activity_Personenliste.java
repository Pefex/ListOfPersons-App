package com.peter_reichelt.listofpersons;

import static com.peter_reichelt.listofpersons.Constans.PERSON_LIST;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_Personenliste extends AppCompatActivity {
    PersonenAdapter personenAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) { // Jede Activity wird mit der onCreate() das 1. Mal gestartet.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personenliste);

        personenAdapter = new PersonenAdapter(this, PERSON_LIST);
        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(personenAdapter);
    }

    @Override
    public void onResume(){ //Eine zusamengeklappte Activity wird durch die onResume() wieder aufgeklappt.
        super.onResume();

        personenAdapter.updatePersonenListe(PERSON_LIST);
        personenAdapter.notifyDataSetChanged();

    }

    public void btnAddPerson(View view){
        Intent intent =new Intent(this,Activity_PersonHinzufügen.class);
        this.startActivity(intent);
    }
}