package realizer.com.makemepopular;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import realizer.com.makemepopular.utils.FontManager;

/**
 * Created by Win on 10/01/2017.
 */
public class RegistrationActivity extends AppCompatActivity
{
    TextView ico_user,ico_email,ico_mobile,ico_calendar,ico_gender,ico_list;
    Button registration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registratin_activity);

        getSupportActionBar().hide();
        ico_user= (TextView) findViewById(R.id.reg_ico_user);
        ico_email= (TextView) findViewById(R.id.reg_ico_email);
        ico_mobile= (TextView) findViewById(R.id.ico_mobile_no);
        ico_calendar= (TextView) findViewById(R.id.reg_ico_dob);
        ico_gender= (TextView) findViewById(R.id.reg_ico_gendar);
        ico_list= (TextView) findViewById(R.id.reg_ico_accinfo);
        Spinner acctype= (Spinner) findViewById(R.id.spn_reg_user_acc);
        registration= (Button) findViewById(R.id.btn_registration);

        String[] items = new String[] {"Select Account Type", "Personal", "Official","Both"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        acctype.setAdapter(adapter);

        ico_user.setTypeface(FontManager.getTypeface(this, FontManager.FONTAWESOME));
        ico_email.setTypeface(FontManager.getTypeface(this,FontManager.FONTAWESOME));
        ico_mobile.setTypeface(FontManager.getTypeface(this,FontManager.FONTAWESOME));
        ico_calendar.setTypeface(FontManager.getTypeface(this,FontManager.FONTAWESOME));
        ico_gender.setTypeface(FontManager.getTypeface(this,FontManager.FONTAWESOME));
        ico_list.setTypeface(FontManager.getTypeface(this,FontManager.FONTAWESOME));


        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent interest=new Intent(RegistrationActivity.this,InterestActivity.class);
                startActivity(interest);
            }
        });
    }
}
