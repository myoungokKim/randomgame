package kr.hs.emirim.cheese0414.monchicken;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    EditText mName;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton=(Button)findViewById(R.id.btn_show_me_the_chicken);
        mButton.setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");


    }

    /**
     * Called when a view has been clicked. 뷰가 클릭됐을 때 불림
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Toast.makeText(this, "배고파요!", Toast.LENGTH_LONG).show();
    }
}
