package com.example.fer.todolist_firebase;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Card card[]; // Hay que crear la Clase Card que recibe los datos de las tarjetas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class AdaptadorCards extends ArrayAdapter{
        Activity context;
        AdaptadorCards(Activity context) {
            super(context,R.layout.card_view, card);
            this.context=context;
        }

        public View getView (int i, View convertView, ViewGroup parent) {
            View item = convertView;
            if(item==null){
                LayoutInflater inflater = context.getLayoutInflater();
                item = inflater.inflate(R.layout.card_view,null);
            }

            TextView title = (TextView) item.findViewById(R.id.card_title);
            title.setText(" "+card[i].getTitle());

            TextView description = (TextView) item.findViewById(R.id.card_description);
            description.setText(""+card[i].getDescription());

            return item;
        }
    }
}
