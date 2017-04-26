package edu.bertalt.nlsandbox.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


public class ShapeShadow extends View {
    Paint paint;

    public ShapeShadow(Context context, AttributeSet attrs) {
        super(context);

        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setShadowLayer(12, 0, 0, Color.YELLOW);

        // Important for certain APIs
        setLayerType(LAYER_TYPE_SOFTWARE, paint);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(20, 20, 100, 100, paint);
    }
}
