package tk.wablanchett.calculator_blanchett;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public final String[] StateList = {"VAR1", "VAR2", "ANS"};
    String curState = StateList[0];

    String preVar1 = "";
    String preVar2 = "";

    boolean var1Edited = false;
    boolean var2Edited = false;

    double var1 = 0;
    double var2 = 0;
    boolean addedDecimal = false;

    Button oneButton = (Button) findViewById(R.id.oneButton);
    Button twoButton = (Button) findViewById(R.id.twoButton);
    Button threeButton = (Button) findViewById(R.id.threeButton);
    Button fourButton = (Button) findViewById(R.id.fourButton);
    Button fiveButton = (Button) findViewById(R.id.fiveButton);
    Button sixButton = (Button) findViewById(R.id.sixButton);
    Button sevenButton = (Button) findViewById(R.id.sevenButton);
    Button eightButton = (Button) findViewById(R.id.eightButton);
    Button nineButton = (Button) findViewById(R.id.nineButton);
    Button zeroButton = (Button) findViewById(R.id.zeroButton);
    Button decimalButton = (Button) findViewById(R.id.decimalButton);


    Button cButton = (Button) findViewById(R.id.cButton);
    Button ceButton = (Button) findViewById(R.id.ceButton);



    Button equalsButton = (Button) findViewById(R.id.equalsButton);
    Button plusButton = (Button) findViewById(R.id.addButton);
    Button minusButton = (Button) findViewById(R.id.minusButton);
    Button multiplyButton = (Button) findViewById(R.id.multiplyButton);
    Button divideButton = (Button) findViewById(R.id.divideButton);

    void appendNumber(String inNum)
    {
        System.out.println("String used to be::: " + preVar1);
        preVar1 = preVar1 + inNum;
        System.out.println("Now the string is:::" + preVar1);

        if (curState.equalsIgnoreCase(StateList[0]))
        {
            var1Edited = true;
        }

        if (curState.equalsIgnoreCase(StateList[1]))
        {
            var2Edited = true;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) || curState.equalsIgnoreCase(StateList[1]))
                {
                    appendNumber("1");
                }
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) || curState.equalsIgnoreCase(StateList[1]))
                {
                    appendNumber("2");
                }
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) || curState.equalsIgnoreCase(StateList[1]))
                {
                    appendNumber("3");
                }
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) || curState.equalsIgnoreCase(StateList[1]))
                {
                    appendNumber("4");
                }
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) || curState.equalsIgnoreCase(StateList[1]))
                {
                    appendNumber("5");
                }
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) || curState.equalsIgnoreCase(StateList[1]))
                {
                    appendNumber("6");
                }
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) || curState.equalsIgnoreCase(StateList[1]))
                {
                    appendNumber("7");
                }
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) || curState.equalsIgnoreCase(StateList[1]))
                {
                    appendNumber("8");
                }
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) || curState.equalsIgnoreCase(StateList[1]))
                {
                    appendNumber("9");
                }
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) || curState.equalsIgnoreCase(StateList[1]))
                {
                    appendNumber("0");
                }
            }
        });

        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((curState.equalsIgnoreCase(StateList[0]) || curState.equalsIgnoreCase(StateList[1])) && addedDecimal == false)
                {
                    appendNumber(".");
                    addedDecimal = true;
                }
            }
        });

















    }
}
