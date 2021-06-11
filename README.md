# Simple-Android-Swipe-Listener
This is a sinppet for handling screen swipes in android (Java &amp; Kotlin). It is inspired by public resources available for swipe listener.

## Usage for Java Code
```
//the view you want to put swipe listener
View view = new View(this);

//add the swipe listener
view.setOnTouchListener(new SwipeListener(this){
    @Override
    public void onClick() {
        super.onClick();
        //when view is clicked
    }


    @Override
    public void onSwipeRight() {
        super.onSwipeRight();
        //when swipe right on view
    }


    @Override
    public void onSwipeLeft() {
        super.onSwipeLeft();
        //when swipe left on view
    }


    @Override
    public void onSwipeUp() {
        super.onSwipeUp();
        //when swipe up on view
    }


    @Override
    public void onSwipeDown() {
        super.onSwipeDown();
        //when swipe down on view
    }

    @Override
    public void onSwipeCompleted() {
        super.onSwipeCompleted();
        //this will be called after you finish any swipe (up,down,left,right)
    }

});
```

## Usage for Kotlin
