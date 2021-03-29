package top.kagurayayoi.learn.android.singleinstance;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("ThirdActivity","Task id is" + getTaskId());
        setContentView(R.layout.activity_third);
    }
}
