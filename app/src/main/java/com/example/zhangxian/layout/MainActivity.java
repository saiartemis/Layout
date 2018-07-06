package com.example.zhangxian.layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//安卓5大布局
//1、线性布局 LinearLayout
//2、相对布局 RelativeLayout
//3、帧布局 FrameLayout
//4、表格布局 TableLayout
//5、绝对布局 AbsoluteLayout
//6、约束布局 ConstraintLayout
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_relativelayout);
        /*Button button_ni = findViewById(R.id.button_ni);
        Button button_hao = findViewById(R.id.button_hao);
        Button button_ma = findViewById(R.id.button_ma);

        button_ni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你",Toast.LENGTH_SHORT).show();
            }
        });

        button_hao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"好",Toast.LENGTH_SHORT).show();
            }
        });

        button_ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"吗",Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
