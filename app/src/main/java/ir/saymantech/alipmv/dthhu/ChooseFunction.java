package ir.saymantech.alipmv.dthhu;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class ChooseFunction extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_choose_function);
        // create the TabHost that will contain the Tabs
        String number2 = getIntent().getExtras().getString("numberz");
        TabHost tabHost = getTabHost();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("First Tab");
        tab1.setIndicator("Setpoints");
        Intent myIntent = new Intent(this,SendOffsets.class);
        myIntent.putExtra("numberzz", number2);
        tab1.setContent(myIntent);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("Second Tab");
        tab2.setIndicator("connectivity");
        Intent myIntent2 = new Intent(this,Tab2Activity.class);
        myIntent2.putExtra("numberzz", number2);
        tab2.setContent(myIntent2);

        TabHost.TabSpec tab3 = tabHost.newTabSpec("Third tab");
        tab3.setIndicator("Others");
        Intent myIntent3 = new Intent(this,Tab3Activity.class);
        myIntent3.putExtra("numberzz", number2);
        tab3.setContent(myIntent3);

        /** Add the tabs  to the TabHost to display. */
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_function, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
