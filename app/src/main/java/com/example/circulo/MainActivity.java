package com.example.circulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new vista(this));

    }

    public class vista extends View {

        public vista(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);

            Path trazo = new Path();
            //trazo.addCircle(250, 250, 100, Path.Direction.CCW);
            trazo.addArc(25, 150, 205, 70, 105, 40);

            Paint p = new Paint();
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(8);
            p.setColor(Color.BLUE);

            canvas.drawPath(trazo, p);

            p.setStrokeWidth(1);
            p.setTextSize(30);
            p.setTypeface(Typeface.SERIF);

            canvas.drawTextOnPath("David Martinez Rodriguez", trazo, 40, 60, p);


        }
    }

}