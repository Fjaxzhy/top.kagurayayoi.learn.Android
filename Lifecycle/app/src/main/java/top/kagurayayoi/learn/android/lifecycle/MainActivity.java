package top.kagurayayoi.learn.android.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Type","onCreate"); //在活动第一次被创建的时候被调用
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Type","onStart"); //在活动由不可见变为可见的时候被调用
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Type","onResume"); //在活动准备好和用户进行交互的时候被调用
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Type","onPause"); //在系统准备去启动或者恢复另一个活动的时候被调用
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Type","onStop"); //在活动完全不可见的时候被调用
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Type","onDestroy"); //在活动被销毁之前被调用
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Type","onRestart"); //在活动由停止状态变为运行状态之前被调用
    }
}