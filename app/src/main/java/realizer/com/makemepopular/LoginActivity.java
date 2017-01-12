package realizer.com.makemepopular;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import realizer.com.makemepopular.utils.FontManager;

/**
 * Created by Win on 10/01/2017.
 */
public class LoginActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        EditText editphoneno= (EditText) findViewById(R.id.edt_mob_no);
        TextView phone_ico= (TextView) findViewById(R.id.ico_mobileno);
        TextView signupbtn= (TextView) findViewById(R.id.login_signup_btn);
        TextView loginmapimg= (TextView) findViewById(R.id.login_mapimg);
        

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg=new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(reg);
            }
        });

        getSupportActionBar().hide();
        phone_ico.setTypeface(FontManager.getTypeface(this,FontManager.FONTAWESOME));

        TelephonyManager tMgr = (TelephonyManager)this.getSystemService(Context.TELEPHONY_SERVICE);
        String mPhoneNumber = tMgr.getLine1Number();
        editphoneno.setText(mPhoneNumber.toString());

       /* String simID = tMgr.getSimSerialNumber();
        if (simID != null)
            Toast.makeText(this, "SIM card ID: " + simID,
                    Toast.LENGTH_LONG).show();

        String telNumber = tMgr.getLine1Number();
        if (telNumber != null)
            Toast.makeText(this, "Phone number: " + telNumber,
                    Toast.LENGTH_LONG).show();

        String IMEI = tMgr.getDeviceId();
        if (IMEI != null)
            Toast.makeText(this, "IMEI number: " + IMEI,
                    Toast.LENGTH_LONG).show();*/

    }
}
