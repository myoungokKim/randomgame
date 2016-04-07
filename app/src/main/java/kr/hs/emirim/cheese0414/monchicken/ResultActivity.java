package kr.hs.emirim.cheese0414.monchicken;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.util.Log;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.Random;

/**
 * Created by appcreate02 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {

    static  String TAG="먼치킨:ResultActivity"; //관행적으로 대문자 TAG를 넣는다
    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!");


        mResult = (TextView) findViewById(R.id.result);
        mImageView=(ImageView)findViewById(R.id.imageView); //위젯을 연결하는 경우 findViewById를 사용하게 됨 잘 기억해두기!
        Log.d(TAG, "텍스트뷰 연결 성공!");

        Random r=new Random();
        int result=r.nextInt(3);
        Log.d(TAG, "랜덤값 생성! : "+result);

        mImageView.setImageResource(R.drawable.c01+result); //잘 기억해두기!
        //if
        /* if (result==0) {
            mImageView.setImageResource(R.drawable.c01);
        }else if (result==1) {
            mImageView.setImageResource(R.drawable.c01);
        }else if (result==2) {
            mImageView.setImageResource(R.drawable.c01);
    } */

    Intent intent=getIntent();
    String name=intent.getStringExtra("name");
    Log.d(TAG, "인텐트값 읽기<name> : " + name);

    int age=intent.getIntExtra("age", -1);
    Log.d(TAG, "인텐트값 읽기<age> : " + age);

        mResult.setText(name+"님, 안녕하세요!");
    }
}
