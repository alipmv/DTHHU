package ir.saymantech.alipmv.dthhu;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tab2Activity  extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        final int i=0;
        final Button myButton=new Button(this);
        myButton.setText("kick");
        myButton.setWidth(100);
        myButton.setHeight(10);
        setContentView(myButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snk= Snackbar.make(v, "hi", Snackbar.LENGTH_LONG);
                snk.setAction("Action!", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       snk.dismiss();// NOP
                    }
                }).show();
            }
        });
    }
}