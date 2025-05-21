package dev.noash.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import dev.noash.loadingview.LoadingButton;

public class MainActivity extends AppCompatActivity {
    private LoadingButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.loadingBtn);
        btn.setImageResource(R.drawable.img_profile1);
        btn.setOnClickListener(v -> {
            btn.showLoading();

            simulateTask(() -> {
                btn.hideLoading();  //stop loading when mission accomplish
            });
        });
    }
    private void simulateTask(Runnable onFinished) {
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            onFinished.run();
        }, 10000);
    }
}

