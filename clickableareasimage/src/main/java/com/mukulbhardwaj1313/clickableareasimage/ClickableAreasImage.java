package com.mukulbhardwaj1313.clickableareasimage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.OnPhotoTapListener;
import com.github.chrisbanes.photoview.PhotoViewAttacher;

import java.util.ArrayList;
import java.util.List;



public class ClickableAreasImage implements OnPhotoTapListener {

    private PhotoViewAttacher attacher;
    private OnClickableAreaClickedListener listener;

    private ImageView imageView;
    private List<ClickableArea> clickableAreas;

    private int imageWidthInPx;
    private int imageHeightInPx;

    public ClickableAreasImage(ImageView imageView, OnClickableAreaClickedListener listener){
        this.imageView = imageView;
        this.attacher = new PhotoViewAttacher(imageView);
        init(listener);
    }

    private void init(OnClickableAreaClickedListener listener) {
        this.listener = listener;
        getImageDimensions(imageView);
        attacher.setOnPhotoTapListener(this);
    }


    private void getImageDimensions(ImageView imageView){
   
        BitmapDrawable drawable2 = (BitmapDrawable) imageView.getDrawable();
        //After SDK 28 (Android Pie), getBitmap() returns the actual size of the image on the screen
        if (Build.VERSION.SDK_INT > 27) {
            imageWidthInPx = (int) (drawable2.getBitmap().getWidth());
            imageHeightInPx = (int) (drawable2.getBitmap().getHeight());
        } else {
            imageWidthInPx = (int) (drawable2.getBitmap().getWidth() / Resources.getSystem().getDisplayMetrics().density);
            imageHeightInPx = (int) (drawable2.getBitmap().getHeight() / Resources.getSystem().getDisplayMetrics().density);
        }

    }
        

    @Override
    public void onPhotoTap(ImageView view, float x, float y) {
        PixelPosition pixel = ImageUtils.getPixelPosition(x, y, imageWidthInPx, imageHeightInPx);
        List<ClickableArea> clickableAreas = getClickAbleAreas(pixel.getX(), pixel.getY());
        for(ClickableArea ca : clickableAreas){
            listener.onClickableAreaTouched(ca.getItem());
        }
    }

    private List<ClickableArea> getClickAbleAreas(int x, int y){
        List<ClickableArea> clickableAreas= new ArrayList<>();
        for(ClickableArea ca : getClickableAreas()){
            if(isBetween(ca.getX(),(ca.getX()+ca.getW()),x)){
                if(isBetween(ca.getY(),(ca.getY()+ca.getH()),y)){
                    clickableAreas.add(ca);
                }
            }
        }
        return clickableAreas;
    }

    private boolean isBetween(int start, int end, int actual){
        return (start <= actual && actual <= end);
    }

    public void setClickableAreas(List<ClickableArea> clickableAreas) {
        this.clickableAreas = clickableAreas;
    }

    public List<ClickableArea> getClickableAreas() {
        return clickableAreas;
    }
}
