package ir.saymantech.alipmv.dthhu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab3Activity  extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        final String number3 = getIntent().getExtras().getString("numberzz");
        TextView tv=new TextView(this);
        tv.setTextSize(25);
        tv.setText(number3);

        setContentView(tv);
    }
}