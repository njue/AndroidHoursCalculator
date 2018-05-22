package njue.androidhourscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int state = 0; //0 is nothing entered, 1 is 1 number, 2 is 2 numbers entered.
    private TextView current;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void onClick(View view)
    {
        if (view.getId() == R.id.button0)
        {

            state++;
        }
        if (view.getId() == R.id.button1)
        {

        }
        if (view.getId() == R.id.button2)
        {

        }
        if (view.getId() == R.id.button3)
        {

        }
        if (view.getId() == R.id.button4)
        {

        }
        if (view.getId() == R.id.button5)
        {

        }
        if (view.getId() == R.id.button6)
        {

        }
        if (view.getId() == R.id.button7)
        {

        }
        if (view.getId() == R.id.button8)
        {

        }
        if (view.getId() == R.id.button9)
        {

        }
        if (view.getId() == R.id.buttonMinus)
        {

        }
        if (view.getId() == R.id.buttonPlus)
        {

        }
        if (view.getId() == R.id.buttonEquals)
        {

        }
        if (view.getId() == R.id.buttonHours)
        {

        }
        if (view.getId() == R.id.buttonMinutes)
        {

        }
        if (view.getId() == R.id.buttonSeconds)
        {

        }
        if (view.getId() == R.id.buttonClear)
        {

        }

    }

}
