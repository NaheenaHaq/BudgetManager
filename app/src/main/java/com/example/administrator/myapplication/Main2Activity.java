package com.example.administrator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final SharedPreferences sp = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor  = sp.edit();
        final int balance = sp.getInt("Budget", 0);
        String balanceStr = Integer.toString(balance);

        final TextView output = (TextView) findViewById(R.id.output);
        //final EditText inputExp = (EditText) findViewById(R.id.inputExp);
        final EditText inputFood = (EditText) findViewById(R.id.inputFood);
        final EditText inputAccommodation = (EditText) findViewById(R.id.inputAccommodation);
        final EditText inputHealth = (EditText) findViewById(R.id.inputHealth);
        final EditText inputTuitionfees = (EditText) findViewById(R.id.inputTuitionfees);
        final EditText inputCloth = (EditText) findViewById(R.id.inputCloth);
        final EditText inputLaundry = (EditText) findViewById(R.id.inputLaundry);
        final EditText inputGrocery = (EditText) findViewById(R.id.inputGrocery);
        final EditText inputTransport = (EditText) findViewById(R.id.inputTransport);
        final Button enterB = (Button) findViewById(R.id.enter_button);
        final Button setBudget = (Button) findViewById(R.id.set_button);

        output.setText(balanceStr);

        enterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //int expenseInt;
                // String expense = inputExp.getText().toString();
                //inputExp.setText("");
                int expenseInt;
                String expense = inputFood.getText().toString();
                inputFood.setText("");
                try {
                expenseInt = Integer.parseInt(expense);
                int bal = sp.getInt("Budget", 0);
                int newbal = bal - expenseInt;
                editor.putInt("Budget", newbal);
                editor.commit();
                output.setText(Integer.toString(newbal));
                } catch (Exception e) {
                inputFood.setHint("Food");
                 }



                String expense1 = inputAccommodation.getText().toString();
                inputAccommodation.setText("");
                try {
                    expenseInt = Integer.parseInt(expense1);
                    int bal = sp.getInt("Budget", 0);
                    int newbal = bal - expenseInt;
                    editor.putInt("Budget", newbal);
                    editor.commit();
                    output.setText(Integer.toString(newbal));
                } catch (Exception e) {
                    inputAccommodation.setHint("Accommodation");
                }


                String expense2 = inputHealth.getText().toString();
                inputHealth.setText("");
                try {
                    expenseInt = Integer.parseInt(expense2);
                    int bal = sp.getInt("Budget", 0);
                    int newbal = bal - expenseInt;
                    editor.putInt("Budget", newbal);
                    editor.commit();
                    output.setText(Integer.toString(newbal));
                } catch (Exception e) {
                    inputHealth.setHint("Health");
                }


                String expense3 = inputTuitionfees.getText().toString();
                inputTuitionfees.setText("");
                try {
                    expenseInt = Integer.parseInt(expense3);
                    int bal = sp.getInt("Budget", 0);
                    int newbal = bal - expenseInt;
                    editor.putInt("Budget", newbal);
                    editor.commit();
                    output.setText(Integer.toString(newbal));
                } catch (Exception e) {
                    inputTuitionfees.setHint("Tuitionfees");
                }


                String expense4 = inputLaundry.getText().toString();
                inputLaundry.setText("");
                try {
                    expenseInt = Integer.parseInt(expense4);
                    int bal = sp.getInt("Budget", 0);
                    int newbal = bal - expenseInt;
                    editor.putInt("Budget", newbal);
                    editor.commit();
                    output.setText(Integer.toString(newbal));
                } catch (Exception e) {
                    inputLaundry.setHint("Laundry");
                }


                String expense5 = inputCloth.getText().toString();
                inputCloth.setText("");
                try {
                    expenseInt = Integer.parseInt(expense5);
                    int bal = sp.getInt("Budget", 0);
                    int newbal = bal - expenseInt;
                    editor.putInt("Budget", newbal);
                    editor.commit();
                    output.setText(Integer.toString(newbal));
                } catch (Exception e) {
                    inputCloth.setHint("Cloth");
                }


                String expense6 = inputGrocery.getText().toString();
                inputGrocery.setText("");
                try {
                    expenseInt = Integer.parseInt(expense6);
                    int bal = sp.getInt("Budget", 0);
                    int newbal = bal - expenseInt;
                    editor.putInt("Budget", newbal);
                    editor.commit();
                    output.setText(Integer.toString(newbal));
                } catch (Exception e) {
                    inputGrocery.setHint("Grocery");
                }


                String expense7 = inputTransport.getText().toString();
                inputTransport.setText("");
                try {
                    expenseInt = Integer.parseInt(expense7);
                    int bal = sp.getInt("Budget", 0);
                    int newbal = bal - expenseInt;
                    editor.putInt("Budget", newbal);
                    editor.commit();
                    output.setText(Integer.toString(newbal));
                } catch (Exception e) {
                    inputTransport.setHint("Transport");
                }

                //try {
                //expenseInt = Integer.parseInt(expense);
                //int bal = sp.getInt("Budget", 0);
                //int newbal = bal - expenseInt;
                //editor.putInt("Budget", newbal);
                //editor.commit();
                //output.setText(Integer.toString(newbal));
                //} catch (Exception e) {
                //inputExp.setHint("Please enter an integer");
                // }


            }
        });

        setBudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
