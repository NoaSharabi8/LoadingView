package dev.noash.loadingview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class LoadingButton extends FrameLayout {
    private ProgressBar progressBar;
    private ImageButton profileImage;
    private boolean isLoading = false;

    public LoadingButton(Context context) {
        super(context);
        init(context, null);
    }

    public LoadingButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public LoadingButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }
    private void init(Context context, AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.view_loading_button, this, true);
        progressBar = findViewById(R.id.profileProgressBar);
        profileImage = findViewById(R.id.profileImage);

        if (profileImage != null && attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.LoadingButton);

            Drawable srcDrawable = a.getDrawable(R.styleable.LoadingButton_lb_src);
            if (srcDrawable != null) {
                profileImage.setImageDrawable(srcDrawable);
            }

            a.recycle();
        }
    }
    public void showLoading() {
        if (isLoading) return;
        isLoading = true;
        if (progressBar != null) {
            progressBar.setVisibility(View.VISIBLE);
        }
        setEnabled(false);
    }
    public void hideLoading() {
        if (!isLoading) return;
        isLoading = false;
        if (progressBar != null) {
            progressBar.setVisibility(View.GONE);
        }
        setEnabled(true);
    }
    public void setImageResource(int resId) {
        if (profileImage != null) {
            profileImage.setImageResource(resId);
        }
    }
}
