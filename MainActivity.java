package com.jen.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        //User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.yellow));
            }
        });

        //Change background color when user click button
        findViewById(R.id.changeBgButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_blue));
            }
        });

        //Change text of label to Android is Awesome when user click button
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome");
            }
        });

        //Reset all views to default setting when click background
        //1. Reset the text to "Hello from Jen" id - @id/text
        //2. Reset the color of the text to original color
            // Original text color - black, text id - @id/text
        //3. Reset the background color - R.color.light_purple

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. Reset the text to "Hello from Jen" id - @id/text
                textView.setText("Hello from Jen");

                //2. Reset the color of the text to original color
                // Original text color - black, text id - @id/text
                textView.setTextColor(getResources().getColor(R.color.black));

                //3. Reset the background color - R.color.light_purple
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_purple));
            }
        });

        //User can tap the “Change text string” button to update the label with the text from the text field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change text view to what's in the edit text view
                String userInput = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (userInput.isEmpty()) {
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userInput);
                }

            }
        });


    }
}