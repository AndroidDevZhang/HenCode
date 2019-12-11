package com.hencoder.hencoderpracticedraw1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;


class PaintCodeStaticLayout {
    private StaticLayout layout;
    private int width;
    private Layout.Alignment alignment;
    private CharSequence source;
    private TextPaint paint;
    
    StaticLayout get(int width, Layout.Alignment alignment, CharSequence source, TextPaint paint) {
        if (this.layout == null || this.width != width || this.alignment != alignment || !this.source.equals(source) || !this.paint.equals(paint)) {
            this.width = width;
            this.alignment = alignment;
            this.source = source;
            this.paint = paint;
            this.layout = new StaticLayout(source, paint, width, alignment, 1, 0, false);
        }
        return this.layout;
    }
}
