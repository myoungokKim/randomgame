package kr.hs.emirim.cheese0414.monchicken;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class SplashActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() { //익명 객체(이름없이 클래스 구성)
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class); //액티비티를 실행시키려면 intent 객체가 있어야 한다.
                startActivity(intent);
                overridePendingTransition(0, R.anim.zoom_exit);
                finish(); //현재 액티비티를 끝내준다
            }
        },3000);
    }

}
