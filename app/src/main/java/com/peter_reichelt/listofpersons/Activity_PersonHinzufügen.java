package com.peter_reichelt.listofpersons;

import static com.peter_reichelt.listofpersons.Constans.PERSON_LIST;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_PersonHinzufügen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personhinzufugen);
    }

    public void btnAddPerson2(View view){
        String vorname=((EditText) findViewById(R.id.tb_firstName)).getText().toString();
        String nachname=((EditText) findViewById(R.id.tb_lastName)).getText().toString();
        int alter= Integer.parseInt(((EditText) findViewById(R.id.tb_age)).getText().toString());
        int groeße=Integer.parseInt(((EditText) findViewById(R.id.tb_size)).getText().toString());

        Person newPerson = new Person(vorname,nachname,alter,groeße);
        PERSON_LIST.add(newPerson);
        Toast.makeText(this,"Person wurde erfolgreich hinzugefügt",Toast.LENGTH_SHORT).show();
    }
}