package tk.wablanchett.calculator_blanchett;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final String[] StateList = {"VAR1", "VAR2", "ANS"};
    String curState = StateList[0];

    String preVar1 = "";
    String preVar2 = "";
    char curOP;

    boolean var1Edited = false;
    boolean var2Edited = false;
    String statusMsg = "Editing first variable...";

    double var1;
    double var2;
    double ansval;
    boolean addedDecimal = false;

    Button oneButton;
    Button twoButton;
    Button threeButton;
    Button fourButton;
    Button fiveButton;
    Button sixButton;
    Button sevenButton;
    Button eightButton;
    Button nineButton;
    Button zeroButton;
    Button decimalButton;


    Button cButton;
    Button ceButton;

    TextView screen;
    String curText;
    TextView status;

    Button equalsButton;
    Button plusButton;
    Button minusButton;
    Button multiplyButton;
    Button divideButton;

    void appendNumber(String inNum)
    {
        if (curState.equalsIgnoreCase(StateList[0]))
        {
            System.out.println("String used to be::: " + preVar1);
            preVar1 = preVar1 + inNum;
            System.out.println("Now the string is:::" + preVar1);
            var1Edited = true;

            curText = preVar1;
            screen.setText(curText);
        }

        if (curState.equalsIgnoreCase(StateList[1]))
        {
            System.out.println("String used to be::: " + preVar2);
            preVar2 = preVar2 + inNum;
            System.out.println("Now the string is:::" + preVar2);
            var2Edited = true;

            curText = preVar1 + " " + curOP + " " + preVar2;
            screen.setText(curText);
        }
    }

    void doMath(String invar1, String invar2, char op)
    {
        var1 = Double.parseDouble(invar1);
        var2 = Double.parseDouble(invar2);


        if (op == '+') {ansval = var1 + var2;}

        if (op == '-') {ansval = var1 - var2;}

        if (op == '*') {ansval = var1 * var2;}

        if (op == '/') {ansval = var1 / var2;}

        curText = preVar1 + " " + curOP + " " + preVar2 + " = " + ansval;
        screen.setText(curText);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putDouble("var1",var1);
        outState.putDouble("var2",var2);
        outState.putDouble("ansval", ansval);
        outState.putBoolean("var1Edited", var1Edited);
        outState.putBoolean("var2Edited", var2Edited);
        outState.putBoolean("addedDecimal", addedDecimal);
        outState.putChar("curop", curOP);
        outState.putString("cstat", statusMsg);
        outState.putString("preval1", preVar1);
        outState.putString("preval2", preVar2);
        outState.putString("curtext", curText);
        outState.putString("curstate",curState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        var1 = savedInstanceState.getDouble("var1");
        var2 = savedInstanceState.getDouble("var2");
        ansval = savedInstanceState.getDouble("ansval");
        var1Edited = savedInstanceState.getBoolean("var1Edited");
        var2Edited = savedInstanceState.getBoolean("var2Edited");
        addedDecimal = savedInstanceState.getBoolean("addedDecimal");
        curOP = savedInstanceState.getChar("curop");
        statusMsg = savedInstanceState.getString("cstat");
        preVar1 = savedInstanceState.getString("preval1");
        preVar2 = savedInstanceState.getString("preval2");
        curState = savedInstanceState.getString("curstate");
        curText = savedInstanceState.getString("curtext");
        screen.setText(curText);
        status.setText(statusMsg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneButton = (Button) findViewById(R.id.oneButton);
         twoButton = (Button) findViewById(R.id.twoButton);
         threeButton = (Button) findViewById(R.id.threeButton);
         fourButton = (Button) findViewById(R.id.fourButton);
         fiveButton = (Button) findViewById(R.id.fiveButton);
         sixButton = (Button) findViewById(R.id.sixButton);
         sevenButton = (Button) findViewById(R.id.sevenButton);
         eightButton = (Button) findViewById(R.id.eightButton);
         nineButton = (Button) findViewById(R.id.nineButton);
         zeroButton = (Button) findViewById(R.id.zeroButton);
         decimalButton = (Button) findViewById(R.id.decimalButton);


         cButton = (Button) findViewById(R.id.cButton);
         ceButton = (Button) findViewById(R.id.ceButton);

         screen = (TextView) findViewById(R.id.textView);
        status = (TextView) findViewById(R.id.statusBox);


         equalsButton = (Button) findViewById(R.id.equalsButton);
         plusButton = (Button) findViewById(R.id.addButton);
         minusButton = (Button) findViewById(R.id.minusButton);
         multiplyButton = (Button) findViewById(R.id.multiplyButton);
         divideButton = (Button) findViewById(R.id.divideButton);


        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);

                }
                    appendNumber("1");

            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);

                }
                    appendNumber("2");

            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);

                }
                    appendNumber("3");

            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);

                }
                    appendNumber("4");

            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);

                }
                    appendNumber("5");

            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);

                }
                    appendNumber("6");

            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);

                }
                    appendNumber("7");

            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);

                }
                    appendNumber("8");

            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);

                }
                    appendNumber("9");

            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);

                }
                    appendNumber("0");

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

                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);
                    appendNumber(".");
                    addedDecimal = true;
                }
            }
        });

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if (curState.equalsIgnoreCase(StateList[0])) {
                    System.out.println("Currently value is: " + preVar1);
                    String[] v1c = preVar1.split("");
                    String rebuild = "";
                    int curpos = 0;

                    if (v1c.length == 1) {
                        var1Edited = false;
                        addedDecimal = false;
                        preVar1 = "";
                    } else

                    {
                        if (v1c[v1c.length-1].equalsIgnoreCase("."))
                        {
                         addedDecimal = false;
                        }

                        while (curpos < (v1c.length - 1)) {
                            rebuild = rebuild + v1c[curpos];
                            curpos+=1;
                            System.out.println("Rebuild is currently: " + rebuild);
                        }

                        preVar1 = rebuild;
                    }

                    curText = preVar1;
                    screen.setText(preVar1);
                }


                if (curState.equalsIgnoreCase(StateList[1])) {
                    String[] v1c = preVar2.split("");
                    String rebuild = "";
                    int curpos = 0;

                    if (v1c.length == 1) {
                        var2Edited = false;
                        preVar2 = "";
                    }
                    else
                    {
                        if (v1c[v1c.length-1].equalsIgnoreCase("."))
                        {
                            addedDecimal = false;
                        }

                        while (curpos < (v1c.length - 1)) {
                            rebuild = rebuild + v1c[curpos];
                            curpos+=1;
                        }

                        preVar2 = rebuild;

                        curText = preVar1 + " " + curOP + " " + preVar2;
                        screen.setText(curText);
                    }
                }

                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    curState = StateList[0];
                    curOP = ' ';
                    preVar1 = "";
                    preVar2 = "";
                    ansval = 0;
                    var1 = 0;
                    var2 = 0;
                    var1Edited = false;
                    var2Edited = false;
                    addedDecimal = false;
                    curText = "Awaiting input...";
                    statusMsg = "Editing first variable...";
                    screen.setText(curText);
                    status.setText(statusMsg);
                }

            }
        });

        ceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                curState = StateList[0];
                curOP = ' ';
                preVar1 = "";
                preVar2 = "";
                ansval = 0;
                var1 = 0;
                var2 = 0;
                var1Edited = false;
                var2Edited = false;
                addedDecimal = false;
                curText = "Awaiting input...";
                statusMsg = "Editing first variable...";
                screen.setText(curText);
                status.setText(statusMsg);
            }

        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (curState.equalsIgnoreCase(StateList[0]) && (var1Edited == true))
                {
                    curOP = '+';
                    curState = StateList[1];
                    addedDecimal = false;
                    curText = preVar1 + " " + curOP;

                    screen.setText(curText);
                    statusMsg = "Editing second variable...";
                    status.setText(statusMsg);
                }

                if (curState.equalsIgnoreCase(StateList[1]) && (var2Edited == true))
                {
                    doMath(preVar1,preVar2,curOP);
                    preVar1 = Double.toString(ansval);
                    preVar2 = "";
                    var2 = 0;
                    var1 = ansval;
                    addedDecimal = false;
                    var2Edited = false;
                    curOP = '+';

                    curText = preVar1 + " " + curOP;
                    screen.setText(curText);
                }

                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    var1 = ansval;
                    preVar1 = Double.toString(var1);

                    preVar2 = "";
                    var2 = 0;
                    ansval = 0;
                    var2Edited = false;
                    addedDecimal = false;
                    curState = StateList[2];
                    statusMsg = "Editing second variable...";
                    curOP = '+';
                    status.setText(statusMsg);
                    curText = preVar1 + " " + curOP;
                    screen.setText(curText);
                }
                }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) && (var1Edited == true))
                {
                    curOP = '-';
                    curState = StateList[1];
                    addedDecimal = false;
                    curText = preVar1 + " " + curOP;
                    screen.setText(curText);
                    statusMsg = "Editing second variable...";
                    status.setText(statusMsg);
                }

                if (curState.equalsIgnoreCase(StateList[1]) && (var2Edited == true))
                {
                    doMath(preVar1,preVar2,curOP);
                    preVar1 = Double.toString(ansval);
                    preVar2 = "";
                    var2 = 0;
                    var1 = ansval;
                    addedDecimal = false;
                    var2Edited = false;
                    curOP = '-';

                    curText = preVar1 + " " + curOP;
                    screen.setText(curText);
                }

                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    var1 = ansval;
                    preVar1 = Double.toString(var1);

                    preVar2 = "";
                    var2 = 0;
                    ansval = 0;
                    var2Edited = false;
                    addedDecimal = false;
                    curState = StateList[2];
                    statusMsg = "Editing second variable...";
                    curOP = '-';
                    status.setText(statusMsg);
                    curText = preVar1 + " " + curOP;
                    screen.setText(curText);
                }

            }
        });

    multiplyButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (curState.equalsIgnoreCase(StateList[0]) && (var1Edited == true))
            {
                curOP = '*';
                curState = StateList[1];
                addedDecimal = false;
                curText = preVar1 + " " + curOP;
                screen.setText(curText);
                statusMsg = "Editing second variable...";
                status.setText(statusMsg);
            }

            if (curState.equalsIgnoreCase(StateList[1]) && (var2Edited == true))
            {
                doMath(preVar1,preVar2,curOP);
                preVar1 = Double.toString(ansval);
                preVar2 = "";
                var2 = 0;
                var1 = ansval;
                addedDecimal = false;
                var2Edited = false;
                curOP = '*';

                curText = preVar1 + " " + curOP;
                screen.setText(curText);
            }

            if (curState.equalsIgnoreCase(StateList[2]))
            {
                var1 = ansval;
                preVar1 = Double.toString(var1);

                preVar2 = "";
                var2 = 0;
                ansval = 0;
                var2Edited = false;
                addedDecimal = false;
                curState = StateList[2];
                statusMsg = "Editing second variable...";
                curOP = '*';
                status.setText(statusMsg);
                curText = preVar1 + " " + curOP;
                screen.setText(curText);
            }
        }
    });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curState.equalsIgnoreCase(StateList[0]) && (var1Edited == true))
                {
                    curOP = '/';
                    curState = StateList[1];
                    addedDecimal = false;
                    curText = preVar1 + " " + curOP;
                    screen.setText(curText);
                    statusMsg = "Editing second variable...";
                    status.setText(statusMsg);
                }

                if (curState.equalsIgnoreCase(StateList[1]) && (var2Edited == true))
                {
                    doMath(preVar1,preVar2,curOP);
                    preVar1 = Double.toString(ansval);
                    preVar2 = "";
                    var2 = 0;
                    var1 = ansval;
                    addedDecimal = false;
                    var2Edited = false;
                    curOP = '/';

                    curText = preVar1 + " " + curOP;
                    screen.setText(curText);
                }

                if (curState.equalsIgnoreCase(StateList[2]))
                {
                    var1 = ansval;
                    preVar1 = Double.toString(var1);

                    preVar2 = "";
                    var2 = 0;
                    ansval = 0;
                    var2Edited = false;
                    addedDecimal = false;
                    curState = StateList[2];
                    statusMsg = "Editing second variable...";
                    curOP = '/';
                    status.setText(statusMsg);
                    curText = preVar1 + " " + curOP;
                    screen.setText(curText);
                }
            }
        });


        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (curState.equalsIgnoreCase(StateList[1])){
                    curState = StateList[2];
                    doMath(preVar1,preVar2,curOP);
                    statusMsg = "Displaying answer....";
                    status.setText(statusMsg);
                }



            }
        });


    }







}
