public Bitmap makeSmallerImage (Bitmap image, int maximumSize){
        int width = image.getWidth();
        int height = image.getHeight();

        float bitmapRatio = (float) width / (float) height;

        if (bitmapRatio > 1){
            //landscape image
            width = maximumSize;
            height = (int) (width / bitmapRatio);
        } else {
            //portrait image
            height = maximumSize;
            width = (int) (height * bitmapRatio);
        }

        return image.createScaledBitmap(image, width, height, true);

    }