package app.calculator.com.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private TextView outputResult;
    private TextView shiftDisplay;
    private TextView degreeRad;
    private boolean isDegree = false;
    private boolean isInverse = false;
    private String lastResultObtain = "";
    private String currentDisplayedInput = "";
    private String inputToBeParsed = "";
    private Calculator mCalculator;
    private static String PREFS_NAME = "memory";
    private Button buttonDegree, buttonInv,buttonLn, buttonRoot, buttonXSquare, buttonDel, buttonCE, buttonClear, buttonCloseParenthesis, buttonOpenParenthesis,
            buttonInt, buttonSinH, buttonSin, buttonTrootx, buttonX3Square, button7, button8,button9,buttonDivide,buttonAdd,
            buttonDms, buttonCosH, buttonCos, buttonYRootX, buttonXYSquare, button4,button5,button6,buttonMpl, buttonPercent,
            buttonPi, buttonTan, buttonTanH, buttonPpm, buttonTenNSquare, button1, button2,button3, buttonMinus,button1x,
            buttonFme, buttonExp, buttonMod, buttonLog, buttonFactorial, button0, button00, buttonDot,buttonPlus, buttonEqual;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonDegree  = (Button) findViewById(R.id.degreesbtn);
        buttonInv = (Button) findViewById(R.id.invbtn);
        buttonLn = (Button) findViewById(R.id.lnbtn);
        buttonRoot  = (Button) findViewById(R.id.rootbtn);
        buttonXSquare = (Button) findViewById(R.id.xsquarebtn);
        //buttonDel = (ImageButton) findViewById(R.id.delbtn);
        buttonCE = (Button) findViewById(R.id.cebtn);
        buttonClear = (Button) findViewById(R.id.clearbtn);
        buttonCloseParenthesis = (Button) findViewById(R.id.);
        buttonOpenParenthesis = (Button) findViewById(R.id.);
        buttonInt = (Button) findViewById(R.id.);
        buttonSinH = (Button) findViewById(R.id.);
        buttonSin = (Button) findViewById(R.id.);
        buttonTrootx = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
        button = (Button) findViewById(R.id.);
    }

    @Override
    public void onClick(View v)
    {

    }
}
