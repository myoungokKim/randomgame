package kr.hs.emirim.cheese0414.monchicken;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by appcreate02 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {

    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResult = (TextView) findViewById(R.id.result);
        mResult.setText("결과");
    }
}
