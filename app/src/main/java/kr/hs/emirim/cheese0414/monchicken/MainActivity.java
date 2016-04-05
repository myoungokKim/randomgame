package kr.hs.emirim.cheese0414.monchicken;

import android.content.Intent;
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
        mName.setText(null);
    }

    /**
     * Called when a view has been clicked. 뷰가 클릭됐을 때 불림
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        String name=mName.getText().toString(); //toString으로 반드시 변환해서 해야함
//        if (name==null) {   //명옥아! 여기서 null은 소문자얌! 아까 너 에러낫징!!!! 수업좀 들어라^0^ -천사
//            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(this, ResultActivity.class);
//            startActivity(intent);
//        }

        try {
            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("age", 18);
            startActivity(intent);
        } catch(NullPointerException e) {
            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
        } catch(Exception e) { //모든 예외의 어머니(?)
            Toast.makeText(this, "뭔진 모르지만 잘 안되네요!", Toast.LENGTH_LONG).show();
        }
    }
}
