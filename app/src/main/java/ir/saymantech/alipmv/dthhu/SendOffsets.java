package ir.saymantech.alipmv.dthhu;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;




public class SendOffsets extends Activity {
    private TextView mytextview;
    private ImageView send_offset_button;
    private EditText offset1_input;
    private EditText offset2_input;
    private EditText offset3_input;
    private EditText offset4_input;
    private EditText offset5_input;
    private EditText offset6_input;
    private EditText offset7_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.offsets_send);
        //phoneNo2 = (EditText) findViewById(R.id.mobileNumber);
        mytextview=(TextView)findViewById(R.id.show_number_page_1);

        offset1_input=(EditText)findViewById(R.id.offset1);
        offset2_input=(EditText)findViewById(R.id.offset2);
        offset3_input=(EditText)findViewById(R.id.offset3);
        offset4_input=(EditText)findViewById(R.id.offset4);
        offset5_input=(EditText)findViewById(R.id.offset5);
        offset6_input=(EditText)findViewById(R.id.offset6);
        offset7_input=(EditText)findViewById(R.id.offset7);

        send_offset_button = (ImageView) findViewById(R.id.send_offset_button);
        final String number3 = getIntent().getExtras().getString("numberzz");
        //final String offsetNumber=offset_input.getText().toString();

        mytextview.setText("Subscription No: "+number3 );

        send_offset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final String mMessageBody =
                            offset1_input.getText().toString() + "*" +
                                    offset2_input.getText().toString() + "*" +
                                    offset3_input.getText().toString() + "*" +
                                    offset4_input.getText().toString() + "*" +
                                    offset5_input.getText().toString() + "*" +
                                    offset6_input.getText().toString() + "*" +
                                    offset7_input.getText().toString() + "#";
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage("09147752516", null,"$"+mMessageBody, null, null);
                    final Snackbar snk= Snackbar.make(v,mMessageBody,Snackbar.LENGTH_LONG);
                    View snkView=snk.getView();
                    TextView snktext=(TextView)snkView.findViewById(R.id.snackbar_text);
                    snktext.setTextColor(getResources().getColor(R.color.zxing_possible_result_points));
                    snk.show();
                } catch (Exception e) {
                    final Snackbar snk= Snackbar.make(v,"SMS failed to send",Snackbar.LENGTH_LONG);
                    View snkView=snk.getView();
                    TextView snktext=(TextView)snkView.findViewById(R.id.snackbar_text);
                    snktext.setTextColor(getResources().getColor(R.color.zxing_possible_result_points));
                    snk.show();
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
