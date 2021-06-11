package example.swipelistener

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class SwipeListener implements View.OnTouchListener {

    private GestureDetector gestureDetector;
    private int swipeThreshold = 100;

    SwipeListener(Context context) {
        gestureDetector= new GestureDetector(context,new GestureListener());
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return gestureDetector.onTouchEvent(motionEvent);
    }


    class GestureListener extends GestureDetector.SimpleOnGestureListener{
        //always true to trigger on fling
        @Override
        public boolean onDown(MotionEvent e) {
            return true;
        }


        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            onClick();
            return true;
        }


        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

            //get the distance from previous to current position
            float distX = e2.getX() - e1.getX();
            float distY = e2.getY() - e1.getY();

            boolean swiped = false;

            if (distX > swipeThreshold ) {
                onSwipeRight();
                swiped = true;
            }
            else if (distX < -swipeThreshold) {
                onSwipeLeft();
                swiped = true;
            }

            if (distY > swipeThreshold) {
                onSwipeDown();
                swiped = true;
            }
            else if (distY < -swipeThreshold) {
                onSwipeUp();
                swiped = true;
            }


            if (swiped) onSwipeCompleted();


            return true;
        }


        public void onClick(){

        }

        public void onSwipeRight(){

        }


        public void onSwipeLeft(){

        }


        public void onSwipeDown(){

        }

        public void onSwipeUp(){

        }

        public void onSwipeCompleted(){

        }



    }
}
