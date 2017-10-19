package com.google.zxing.client.android;

import android.graphics.Point;
import android.graphics.Rect;
import android.support.annotation.NonNull;

/**
 * 屏幕尺寸转换工具
 * Created by Wang on 2017/10/19.
 */

public class RectToX {
    /**
     * 不同大小 横竖屏互转
     *
     * @param aPoint Point 需要转换的尺寸
     * @param aRect  Rect 需要转换尺寸里面的矩形
     * @param xPoint Point 转换到的矩形
     * @return 转换后 Rect
     */
    public static Rect onRectToX(@NonNull Point aPoint, @NonNull Rect aRect, @NonNull Point xPoint) {
        Rect rect = new Rect();
        rect.top = xPoint.y - aRect.right * xPoint.y / aPoint.x;
        rect.bottom = xPoint.y - aRect.left * xPoint.y / aPoint.x;
        rect.right = xPoint.x - aRect.top * xPoint.x / aPoint.y;
        rect.left = xPoint.x - aRect.bottom * xPoint.x / aPoint.y;
        return rect;
    }
}
