package com.example.dc.navigation.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dc.navigation.R;
import com.squareup.picasso.Picasso;

public class LabeledImageButton extends RelativeLayout {
    private ImageView backgroundImg, iconImg;
    private TextView titleLabel;
    private TypedArray ta;
    private AttributeSet set;
    private Context context;

    public LabeledImageButton(Context context) {
        super(context);
        this.context = context;
        init(null);
    }

    public LabeledImageButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init(attrs);
    }

    private void init(@Nullable AttributeSet set){
        //here is called when the view is first created
        inflate(getContext(), R.layout.card_view_labeled_image_button, this);
        this.backgroundImg = (ImageView) findViewById(R.id.backgroundSrc);
        this.iconImg = (ImageView) findViewById(R.id.iconSrc);
        this.titleLabel = (TextView) findViewById(R.id.title_label);
        setBackgroundColor(getResources().getColor(R.color.pure_white));
        this.set = set;
        if(set != null) {
            ta = getContext().obtainStyledAttributes(set, R.styleable.LabeledImageButton);
            this.backgroundImg.setBackgroundColor(getResources().getColor(ta.getResourceId(R.styleable.LabeledImageButton_backgroundColour, 0)));
            this.iconImg.setImageResource(ta.getResourceId(R.styleable.LabeledImageButton_iconSrc, R.drawable.bug));
            this.titleLabel.setText(ta.getResourceId(R.styleable.LabeledImageButton_title, 0));
            this.titleLabel.setTextColor(getResources().getColor(ta.getResourceId(R.styleable.LabeledImageButton_titleColor, 0)));
            if (!isInEditMode()) {
                Picasso.get()
                        .load(ta.getString(R.styleable.LabeledImageButton_backgroundSrc))
                        .into(this.backgroundImg);
            }
            ta.recycle();
        }

    }

    public void setBackgroundImg(String url){
        Picasso.get()
                .load(url)
                .into(this.backgroundImg);
        invalidate();
        requestLayout();
    }

    public void setIconImg(int iconImg){
        this.iconImg.setImageResource(iconImg);
        requestLayout();
    }

    public void setTitleLabel(String title){
        this.titleLabel.setText(title);
        invalidate();
        requestLayout();
    }

}
