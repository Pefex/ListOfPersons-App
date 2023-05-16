package com.peter_reichelt.listofpersons;

import static com.peter_reichelt.listofpersons.Constans.PERSON_LIST;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_Personenliste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Jede Activity wird mit der onCreate() das 1. Mal gestartet.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personenliste);
    }

    @Override
    public void onResume(){ //Eine zusamengeklappte Activity wird durch die onResume() wieder aufgeklappt.
        super.onResume();
        EditText tbNameList= ((EditText)findViewById(R.id.tbNameList));

        String names = "abc";

        for(Person person: PERSON_LIST){
           names = names + person.getVorname() +" "+person.getNachname()+"\n";
        }

        tbNameList.setText(names);



    }

    public void btnAddPerson(View view){
        Intent intent =new Intent(this,Activity_PersonHinzufügen.class);
        this.startActivity(intent);
    }
}