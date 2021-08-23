package com.example.lp2;



import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<AppCompatActivity> extends AppCompatActivity {
EditText number1,number2;
TextView res;
char op;
private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        res = findViewById(R.id.res);


    }



    public void one(android.view.View v)
    {
        if(number1.hasFocus())
        {
            number1.append("1");
        }
        else if(number2.hasFocus())
        {
            number2.append("1");
        }
        else
        {
            Toast.makeText(this,"Please get the focus of the first or second field",Toast.LENGTH_LONG).show();
        }
    }

    public void two(android.view.View v)
    {
        if(number1.hasFocus())
        {
            number1.append("2");
        }
        else if(number2.hasFocus())
        {
            number2.append("2");
        }
        else
        {
            Toast.makeText(this,"Please get the focus of the first or second field",Toast.LENGTH_LONG).show();
        }

    }

    public void three(android.view.View v)
    {
        if(number1.hasFocus())
        {
            number1.append("3");
        }
        else if(number2.hasFocus())
        {
            number2.append("3");
        }
        else
        {
            Toast.makeText(this,"Please get the focus of the first or second field",Toast.LENGTH_LONG).show();
        }
    }


    public void four(android.view.View v)
    {
        if(number1.hasFocus())
        {
            number1.append("4");
        }
        else if(number2.hasFocus())
        {
            number2.append("4");
        }
        else
        {
            Toast.makeText(this,"Please get the focus of the first or second field",Toast.LENGTH_LONG).show();
        }
    }

    public void five(android.view.View v)
    {
        if(number1.hasFocus())
        {
            number1.append("5");
        }
        else if(number2.hasFocus())
        {
            number2.append("5");
        }
        else
        {
            Toast.makeText(this,"Please get the focus of the first or second field",Toast.LENGTH_LONG).show();
        }
    }

    public void six(android.view.View v)
    {
        if(number1.hasFocus())
        {
            number1.append("6");
        }
        else if(number2.hasFocus())
        {
            number2.append("6");
        }
        else
        {
            Toast.makeText(this,"Please get the focus of the first or second field",Toast.LENGTH_LONG).show();
        }
    }

    public void seven(android.view.View v)
    {
        if(number1.hasFocus())
        {
            number1.append("7");
        }
        else if(number2.hasFocus())
        {
            number2.append("7");
        }
        else
        {
            Toast.makeText(this,"Please get the focus of the first or second field",Toast.LENGTH_LONG).show();
        }
    }

    public void eight(android.view.View v)
    {
        if(number1.hasFocus())
        {
            number1.append("8");
        }
        else if(number2.hasFocus())
        {
            number2.append("8");
        }
        else
        {
            Toast.makeText(this,"Please get the focus of the first or second field",Toast.LENGTH_LONG).show();
        }
    }

    public void nine(android.view.View v)
    {
        if(number1.hasFocus())
        {
            number1.append("9");
        }
        else if(number2.hasFocus())
        {
            number2.append("9");
        }
        else
        {
            Toast.makeText(this,"Please get the focus of the first or second field",Toast.LENGTH_LONG).show();
        }
    }

    public void zero(android.view.View v)
    {
        if(number1.hasFocus())
        {
            number1.append("0");
        }
        else if(number2.hasFocus())
        {
            number2.append("0");
        }
        else
        {
            Toast.makeText(this,"Please get the focus of the first or second field",Toast.LENGTH_LONG).show();
        }
    }



    public void dot(android.view.View v)
    {
        if(number1.hasFocus())
        {
            number1.append(".");
        }
        else if(number2.hasFocus())
        {
            number2.append(".");
        }
        else
        {
            Toast.makeText(this,"Please get the focus for the first or second field",Toast.LENGTH_LONG).show();
        }
    }

    public void add(View v)
    {
        op = '+';
    }

    public void minus(View v)
    {
        op = '-';
    }

    public void  multiply(View v)
    {
        op = '*';
    }
    public void divide(View v)
    {
        op = '/';
    }
    public void equal(View v)
    {
        float n1,n2,r;
        switch(op)
        {
            case '+': n1=Float.parseFloat(number1.getText().toString());
                      n2=Float.parseFloat(number2.getText().toString());
                      r=n1+n2;
                      res.setText(""+n1+"+"+n2+"="+r);
                      break;

            case '-': n1=Float.parseFloat(number1.getText().toString());
                     n2=Float.parseFloat(number2.getText().toString());
                     r=n1-n2;
                     res.setText(""+n1+"-"+n2+"="+r);
                     break;

            case '*': n1=Float.parseFloat(number1.getText().toString());
                     n2=Float.parseFloat(number2.getText().toString());
                     r=n1*n2;
                     res.setText(""+n1+"*"+n2+"="+r);
                     break;

            case '/': n1=Float.parseFloat(number1.getText().toString());
                      n2=Float.parseFloat(number2.getText().toString());
                      r=n1/n2;
                      res.setText(""+n1+"/"+n2+"="+r);
                      break;
        }
    }

public void clear_one_field(View v)
{
if(number1.hasFocus())
{
    number1.setText("");
    res.setText("");
}
else if(number2.hasFocus())
{
    number2.setText("");
    res.setText("");
}
else
{
    Toast.makeText(this,"Set focus on either number one or number two ",Toast.LENGTH_LONG).show();
}
}

public void all_clear(View v)
{
    number1.setText("");
    number2.setText("");
    res.setText("");
}


public void clear(View v)
{
    if(number1.hasFocus())
    {
        String n;
        n=number1.getText().toString();
        n= n.substring(0,n.length()-1);
        number1.setText(n);


    }
    else if(number2.hasFocus())
    {   String n;
        n=number2.getText().toString();
        n= n.substring(0,n.length()-1);
        number2.setText(n);
    }
    else{
        Toast.makeText(this,"Set focus on either number one or number two ",Toast.LENGTH_LONG).show();
    }
}

}