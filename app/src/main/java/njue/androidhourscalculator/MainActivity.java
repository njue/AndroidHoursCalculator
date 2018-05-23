package njue.androidhourscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int state; //0 is nothing entered, 1 is 1 number, 2 is 2 numbers entered. 3 is 2 numbers plus the unit of time. 4 is 2 numbers plus the unit of time and plus/minus
    private int totalSeconds;
    private int currentSeconds;
    private TextView current;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        state = 0;
        current = findViewById(R.id.textViewCurrent);
        total = findViewById(R.id.textViewTotal);
    }

    private void onClick(View view)
    {
        if (view.getId() == R.id.button0)
        {
            if (state == 0)
            {
                addFirstNumber(0);
            }
            if (state == 1)
            {
                addSecondNumber(0);
            }
        }
        if (view.getId() == R.id.button1)
        {
            if (state == 0)
            {
                addFirstNumber(1);
            }
            if (state == 1)
            {
                addSecondNumber(1);
            }
        }
        if (view.getId() == R.id.button2)
        {
            if (state == 0)
            {
                addFirstNumber(2);
            }
            if (state == 1)
            {
                addSecondNumber(2);
            }
        }
        if (view.getId() == R.id.button3)
        {
            if (state == 0)
            {
                addFirstNumber(3);
            }
            if (state == 1)
            {
                addSecondNumber(3);
            }
        }
        if (view.getId() == R.id.button4)
        {
            if (state == 0)
            {
                addFirstNumber(4);
            }
            if (state == 1)
            {
                addSecondNumber(4);
            }
        }
        if (view.getId() == R.id.button5)
        {
            if (state == 0)
            {
                addFirstNumber(5);
            }
            if (state == 1)
            {
                addSecondNumber(5);
            }
        }
        if (view.getId() == R.id.button6)
        {
            if (state == 0)
            {
                addFirstNumber(6);
            }
            if (state == 1)
            {
                addSecondNumber(6);
            }
        }
        if (view.getId() == R.id.button7)
        {
            if (state == 0)
            {
                addFirstNumber(7);
            }
            if (state == 1)
            {
                addSecondNumber(7);
            }
        }
        if (view.getId() == R.id.button8)
        {
            if (state == 0)
            {
                addFirstNumber(8);
            }
            if (state == 1)
            {
                addSecondNumber(8);
            }
        }
        if (view.getId() == R.id.button9)
        {
            if (state == 0)
            {
                addFirstNumber(9);
            }
            if (state == 1)
            {
                addSecondNumber(9);
            }
        }
        if (view.getId() == R.id.buttonMinus)
        {
            if (state == 3)
            {
                plusMinus(1);
            }
        }
        if (view.getId() == R.id.buttonPlus)
        {
            if (state == 3)
            {
                plusMinus(2);
            }
        }
        if (view.getId() == R.id.buttonEquals)
        {
            if (state == 4)
            {
               equalsSign();
            }
        }
        if (view.getId() == R.id.buttonHours)
        {
            if (state == 2)
            {
                addTimeUnit(1);
            }
        }
        if (view.getId() == R.id.buttonMinutes)
        {
            if (state == 2)
            {
                addTimeUnit(2);
            }
        }
        if (view.getId() == R.id.buttonSeconds)
        {
            if (state == 2)
            {
                addTimeUnit(3);
            }
        }
        if (view.getId() == R.id.buttonClear)
        {
            current.setText("");
            total.setText("");
            currentSeconds = 0;
            totalSeconds = 0;
        }

    }

    private void addFirstNumber(int buttonPressed)
    {
        current.setText(buttonPressed);
        state = 1;
    }

    private void addSecondNumber(int buttonPressed)
    {
        String previousValue = current.getText().toString();
        current.setText(buttonPressed + previousValue);
        state = 2;
    }

    //1 = Hours, 2 = Minutes, 3 = Seconds
    private void addTimeUnit(int timeUnit)
    {
        String previousValue = current.getText().toString();
        int previousValueInt = Integer.getInteger(previousValue);
        if (timeUnit == 1)
        {
            current.setText(previousValue + "H");
            currentSeconds = previousValueInt;
        }
        if (timeUnit == 2)
        {
            current.setText(previousValue + "M");
            currentSeconds = previousValueInt * 60;
        }
        if (timeUnit == 3)
        {
            current.setText(previousValue + "S");
            currentSeconds = previousValueInt * 60 * 60;
        }
        state = 3;
    }

    //1 = +, 2 = -
    private void plusMinus(int sign)
    {
        String previousValue = current.getText().toString();
        if (sign == 1)
        {
            totalSeconds = totalSeconds + currentSeconds;
            current.setText("+" + previousValue);
        }
        if (sign == 2)
        {
            totalSeconds = totalSeconds - currentSeconds;
            current.setText("-" + previousValue);
        }
        currentSeconds = 0;

        state = 4;
    }

    private void equalsSign()
    {
        total.setText(calculateTime());
        current.setText("");
        state = 0;
    }

    private String calculateTime()
    {
        int seconds = totalSeconds;

        int minutes = seconds/60;
        int secondsRemainder = seconds%60;

        int hours = minutes/60;
        int minutesRemainder = minutes%60;

        String totalTime = hours + "H " + minutesRemainder + "M " + secondsRemainder + "S";
        return totalTime;
    }



}
