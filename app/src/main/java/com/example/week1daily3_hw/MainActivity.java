package com.example.week1daily3_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // name of each EditText, where the user will input their information
    private EditText etFName, etLName, etStAddr, etCity, etState, etZip;

    // name of each TextView, where the information will be displayed
    private TextView tvFName, tvLName, tvStAddr, tvCity, tvState, tvZip;

    // a button that, once clicked, will display the user's information
    private Button btSubmit;

    // declare the person object
    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link each EditText to it's appropriate ID
        etFName = findViewById(R.id.etFName);
        etLName = findViewById(R.id.etLName);
        etStAddr = findViewById(R.id.etStAddr);
        etCity = findViewById(R.id.etCity);
        etState = findViewById(R.id.etState);
        etZip = findViewById(R.id.etZip);

        // link each TextView to it's appropriate ID
        tvFName = findViewById(R.id.tvFName);
        tvLName = findViewById(R.id.tvLName);
        tvStAddr = findViewById(R.id.tvStAddr);
        tvCity = findViewById(R.id.tvCity);
        tvState = findViewById(R.id.tvState);
        tvZip = findViewById(R.id.tvZip);

        // Link button to ID
        btSubmit = findViewById(R.id.btGetInfo);
    }

    public void onClick(View view) {
        // get user input and set it to appropriate text view in person class
        String fNameInput= etFName.getText().toString();
        tvFName.setText(fNameInput);

        String lNameInput = etLName.getText().toString();
        tvLName.setText(lNameInput);

        String strAddrInput = etStAddr.getText().toString();
        tvStAddr.setText(strAddrInput);

        String cityInput = etCity.getText().toString();
        tvCity.setText(cityInput);

        String stateInpput = etState.getText().toString();
        tvState.setText(stateInpput);

        String zipInput = etZip.getText().toString();
        tvZip.setText(zipInput);

        person = new Person(fNameInput, lNameInput, strAddrInput, cityInput, stateInpput, zipInput);

    } // end onClick
} // end main Activity

// the person class that holds all the text views for person
class Person{
    private String fName, lName, addr, city, state, zip;

    public Person(String fName, String lName, String addr, String city, String state, String zip) {
        this.fName = fName;
        this.lName = lName;
        this.addr = addr;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // the following are a list of methods that can set a specific value
    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // the following are methods that retrieve a specific value
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddr() {
        return addr;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
} // end Person class
