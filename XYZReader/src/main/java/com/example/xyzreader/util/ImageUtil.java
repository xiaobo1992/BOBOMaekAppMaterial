package com.example.xyzreader.util;

import android.content.Context;
import android.widget.ImageView;

import com.example.xyzreader.R;
import com.squareup.picasso.Picasso;

/**
 * Created by xiaobozhang on 10/16/17.
 */

public class ImageUtil {

    public static void loadImage(Context context, ImageView imageView, String url) {

        try {
            Picasso.with(context)
                    .load(url)
                    .error(R.drawable.photo_background_protection)
                    .placeholder(R.drawable.photo_background_protection)
                    .into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
