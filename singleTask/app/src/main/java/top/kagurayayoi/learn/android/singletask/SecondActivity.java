package top.kagurayayoi.learn.android.singletask;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("SecondActivity",this.toString());
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("SecondActivity","onDestroy");
    }

    /*
    E/MainActivity: top.kagurayayoi.learn.android.singletask.MainActivity
    E/SecondActivity: top.kagurayayoi.learn.android.singletask.SecondActivity
    E/MainAtivity: onRestart
    E/SecondActivity: onDestroy
     */
    // SecondActivity直接出栈重新启动MainActivity
}
