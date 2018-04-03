package com.example.akashpandey.calcyakash;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String input = "";
String input1 = "";
String input2 = "";
    float result;
    float i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private final char ADDITION = '+';
    private final char MULTIPLICATION = '*';
    private final char SUBSTRACTION = '-';
    private final char DIVISION = '/';


    /**
     * This method is called when zero press.
     */
    public void zero(View view) {
        int num = 0;
        input = input + num;
        if (input.length() >= 20) {
            displayMessage();
        } else
            displayInput(input);
    }

    /**
     * this method is called when one  pressed.
     */


    public void one(View view) {
        int num = 1;
        input = input + String.valueOf(num);
        if (input.length() >= 20) {
            displayMessage();
        } else
            displayInput(input);

    }

    private void displayMessage() {

    }

    /**
     * this method is called when two is  pressed.
     */


    public void two(View view) {
        int num = 2;
        input = input + String.valueOf(num);
        if (input.length() >= 20) {
            displayMessage();
        } else
            displayInput(input);
    }

    /**
     * this method is called when three is pressed.
     */


    public void three(View view) {
        int num = 3;
        input = input + String.valueOf(num);
        if (input.length() >= 20) {
            displayMessage();
        } else
            displayInput(input);
    }

    /**
     * this method is called when four is  pressed.
     */

    public void four(View view) {
        int num = 4;
        input = input + String.valueOf(num);
        if (input.length() >= 20) {
            displayMessage();
        } else
            displayInput(input);
    }

    /**
     * this method is called when five is pressed.
     */

    public void five(View view) {
        int num = 5;
        input = input + String.valueOf(num);
        if (input.length() >= 20) {
            displayMessage();
        } else
            displayInput(input);
    }


    /**
     * This method is called when six is pressed
     */
    public void six(View view) {
        int num = 6;
        input = input + String.valueOf(num);
        if (input.length() >= 20) {
            displayMessage();
        } else
            displayInput(input);
    }

    /**
     * this method is called when seven is pressed.
     */


    public void seven(View view) {
        int num = 7;
        input = input + String.valueOf(num);
        if (input.length() >= 20) {
            displayMessage();
        } else
            displayInput(input);
    }

    /**
     * this method is called when eight is  pressed.
     */


    public void eight(View view) {

        int num = 8;
        input = input + String.valueOf(num);
        if (input.length() >= 20) {
            displayMessage();
        } else
            displayInput(input);
    }

    /**
     * this method is called when nine pressed.
     */


    public void nine(View view) {
        int num = 9;
        input = input + String.valueOf(num);
        if (input.length() >= 20) {
            displayMessage();
        } else
            displayInput(input);
    }


    /**
     * this method is called when decimal pressed.
     */

    public void dot(View view) {
        char num = '.';
        input = input + String.valueOf(num);
        if (input.length() >= 20) {
            displayMessage();
        } else
            displayInput(input);
    }

    /**
     * this method is called when equal  pressed.
     */

    public void equal(View view) {
        float j = Float.parseFloat(input);

        if(input2.endsWith("+")){
           result =  i + j ;
            displayResult(result);
        }
        else  if(input2.endsWith("-")){
            result =  i - j ;
            displayResult(result);
        }
        else  if(input2.endsWith("*")){
            result =  i * j ;
            displayResult(result);
        }
        else  if(input2.endsWith("/")){
            result =  i / j ;
            displayResult(result);
        }

    }


    /**
     * this method is called when plus is  pressed.
     */


    public void plus(View view){
        char num = '+';
        input1 = input;
        input2 = input+String.valueOf(num);
        input = input + String.valueOf(num);
        i = Float.parseFloat(input1);
        if (input.length() >= 20) {
            displayMessage();
        }
        else {
            displayInput(input);
            input = "";
            displayResult(i);
        }
    }


    /**
     * this method is called when minus pressed.
     */


    public void minus(View view) {
        char num = '-';
        input1 = input;
        input2 = input+String.valueOf(num);
        input = input + String.valueOf(num);
        i = Float.parseFloat(input1);
        if (input.length() >= 20) {
            displayMessage();
        }
        else {
            displayInput(input);
            input = "";
            displayResult(i);
        }

    }

    /**
     * this method is called when product pressed.
     */


    public void product(View view) {
        char num = '*';
        input1 = input;
        input2 = input+String.valueOf(num);
        input = input + String.valueOf(num);
        i = Float.parseFloat(input1);
        if (input.length() >= 20) {
            displayMessage();
        }
        else {
            displayInput(input);
            input = "";
            displayResult(i);
        }
    }

    /**
     * This method is called when divide is called.
     */

    public void divide(View view) {
        char num = '/';
        input1 = input;
        input2 = input+String.valueOf(num);
        input = input + String.valueOf(num);
        i = Float.parseFloat(input1);
        if (input.length() >= 20) {
            displayMessage();
        }
        else {
            displayInput(input);
            input = "";
            displayResult(i);
        }
    }

    /**
     * this method we use for calculation on the app
     */
    public void calculation() {


    }

    /**
     * this method is called when ac pressed.
     */

    public void clear(View view) {
        input = "";
        result = 0;
        displayInput(input);
        displayResult(result);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayInput(String num) {
        TextView inputTextView = (TextView) findViewById(R.id.input_text_view);
        inputTextView.setText(num);
    }

    /**
     * This method desplay result of calculation on the screen.
     */
    private void displayResult(float number) {
        TextView resultTextView = (TextView) findViewById(R.id.result_text_view);
        resultTextView.setText(""+ number);
    }
}
