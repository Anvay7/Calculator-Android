package com.example.anvay.calculator;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,be,bc,bm,bd,ba,bs;
    TextView ans,disp;
    float r,p,result;
    int madd=0,msub=0,mmult=0,mdiv=0,i,j;
    float[] arr=new float[50];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button6);
        b3=(Button)findViewById(R.id.button9);
        b4=(Button)findViewById(R.id.button2);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button8);
        b7=(Button)findViewById(R.id.button);
        b8=(Button)findViewById(R.id.button4);
        b9=(Button)findViewById(R.id.button7);
        b0=(Button)findViewById(R.id.button11);
        bp=(Button)findViewById(R.id.button10);
        be=(Button)findViewById(R.id.button17);
        bc=(Button)findViewById(R.id.button12);
        bm=(Button)findViewById(R.id.button14);
        bd=(Button)findViewById(R.id.button13);
        ba=(Button)findViewById(R.id.button16);
        bs=(Button)findViewById(R.id.button15);
        ans=(TextView)findViewById(R.id.editText);
        disp=(TextView)findViewById(R.id.editText2);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(disp.getText()+"1");
                //arr[i]=1;
                //i++;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(disp.getText()+"2");
                //arr[i]=2;
                //i++;
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(disp.getText()+"3");
                //arr[i]=3;
                //i++;
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(disp.getText()+"4");
                //arr[i]=4;
                //i++;
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(disp.getText()+"5");
                //arr[i]=5;
                //i++;
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(disp.getText()+"6");
                //arr[i]=6;
                //i++;
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(disp.getText()+"7");
                //arr[i]=7;
                //i++;
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(disp.getText()+"8");
                //arr[i]=8;
                //i++;
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(disp.getText()+"9");
                //arr[i]=9;
                //i++;
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(disp.getText()+"0");
                //arr[i]=0;
                //i++;
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(disp.getText()+".");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText("");
                ans.setText("");
                i=0;
                result=0;
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r=Float.valueOf(disp.getText().toString());
                disp.setText("");
                arr[i++]=r;
                //result=result+arr[i];
                arr[i++]='+';

                /*if(ans.getText()!="")
                {
                    r=Float.valueOf(disp.getText().toString());
                    disp.setText("");
                    arr[i++]=r;
                    //result=result+arr[i];
                    arr[i++]='+';
                }*/


                madd=1;
                msub=0;mmult=0;mdiv=0;
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r=Float.valueOf(disp.getText().toString());
                disp.setText("");
                arr[i++]=r;
                //ans.setText(String.valueOf(arr[i-1]));
                arr[i++]='-';

               /* if(ans.getText()!="")
                {
                    r=Float.valueOf(disp.getText().toString());
                    disp.setText("");
                    arr[i++]=r;
                    //result=result+arr[i];
                    arr[i++]='-';
                }*/

                /*if(i==0) {
                    result =arr[i];
                }
                else
                {
                    result=result-arr[i];
                }
                i++;*/
                //ans.setText(String.valueOf(result));
                msub=1;
                madd=0;mmult=0;mdiv=0;
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r=Float.valueOf(disp.getText().toString());
                disp.setText("");
                arr[i++]=r;
                //ans.setText(String.valueOf(arr[i-1]));
                arr[i++]='*';

                /*if(ans.getText()!="")
                {
                    r=Float.valueOf(disp.getText().toString());
                    disp.setText("");
                    arr[i++]=r;
                    //result=result+arr[i];
                    arr[i++]='*';
                }*/

                /*if(i==0) {
                    result =arr[i];
                }
                else
                {
                    result=result*arr[i];
                }
                i++;8*/
                //ans.setText(String.valueOf(result));
                mmult=1;
                madd=0;msub=0;mdiv=0;
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r=Float.valueOf(disp.getText().toString());
                disp.setText("");
                arr[i++]=r;
                //ans.setText(String.valueOf(arr[i-1]));
                arr[i++]='/';

                /*if(ans.getText()!="")
                {
                    r=Float.valueOf(disp.getText().toString());
                    disp.setText("");
                    arr[i++]=r;
                    //result=result+arr[i];
                    arr[i++]='/';
                }*/

                /*if(i==0) {
                    result =arr[i];
                }
                else
                {
                    result=result/arr[i];
                }
                i++;*/
                //ans.setText(String.valueOf(result));
                mdiv=1;
                madd=0;msub=0;mmult=0;
            }
        });


        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arr[i++]=Float.valueOf(disp.getText().toString());
                arr[i]='=';
                //p=Float.valueOf(ans.getText().toString());

                /*if(msub==1)
                {

                    result=p-arr[i];
                    ans.setText(String.valueOf(result));
                    msub=0;

                }

                else if(madd==1)
                {

                        result=p+arr[i];

                    ans.setText(String.valueOf(result));
                    madd=0;

                }


                else if(mmult==1)
                {

                        result=p*arr[i];

                    ans.setText(String.valueOf(result));
                    mmult=0;

                }

                else if(mdiv==1)
                {

                        result=p/arr[i];

                    ans.setText(String.valueOf(result));
                    mdiv=0;

                }*/
                result=arr[0];
                for(j=1;j<=i;j++)
                {

                    if(arr[j]=='+')
                    {
                        j++;
                        result=result+arr[j];
                    }
                    else if(arr[j]=='-')
                    {
                        j++;
                        result=result-arr[j];
                    }
                    else if(arr[j]=='*')
                    {
                        j++;
                        result=result*arr[j];
                    }
                    else if(arr[j]=='/')
                    {
                        j++;
                        result=result/arr[j];
                    }
                    else if(arr[j]=='=')
                        break;
                }
                ans.setText(String.valueOf(result));
            }
        });




    }
}
