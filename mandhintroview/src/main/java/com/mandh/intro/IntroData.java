package com.mandh.intro;

import android.graphics.Color;

public class IntroData {
    String title, description;
    int image, backgroundImage;
    int titleColor, descriptionColor, bacgroundColor, titleFont, descriptionFont;

    /**
     * Detailed constructor of intro data
     *
     * @param title            String top title text
     * @param description      String bottom description text
     * @param image            int Drawable image reference id
     * @param backgroundImage  int Drawable background image reference id
     * @param titleColor       int Color of top title
     * @param descriptionColor int Color of bottom description
     * @param bacgroundColor   int Color of background
     * @param titleFont        int top title font
     * @param descriptionFont  int bottom description font
     */
    public IntroData(String title, String description, int image, int backgroundImage, int titleColor,
                     int descriptionColor, int bacgroundColor, int titleFont, int descriptionFont) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.backgroundImage = backgroundImage;
        this.titleColor = titleColor;
        this.descriptionColor = descriptionColor;
        this.bacgroundColor = bacgroundColor;
        this.titleFont = titleFont;
        this.descriptionFont = descriptionFont;
    }

    /**
     * Basic constructor of intro data
     *
     * @param title       String top title text
     * @param description String bottom description text
     * @param image       int Drawable image reference id
     */
    public IntroData(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    /**
     * Get title
     *
     * @return string
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     *
     * @param title string
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get description
     *
     * @return string
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     *
     * @param description string
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get image
     *
     * @return int
     */
    public int getImage() {
        return image;
    }

    /**
     * Set image
     *
     * @param image int
     */
    public void setImage(int image) {
        this.image = image;
    }

    /**
     * Get background image
     *
     * @return int
     */
    public int getBackgroundImage() {
        return backgroundImage == 0 ? R.drawable.default_background_drawable : backgroundImage;
    }

    /**
     * Set background image
     *
     * @param backgroundImage int
     */
    public void setBackgroundImage(int backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    /**
     * Get title color
     *
     * @return int
     */
    public int getTitleColor() {
        return titleColor == 0 ? Color.BLACK : titleColor;
    }

    /**
     * Set title color
     *
     * @param titleColor int
     */
    public void setTitleColor(int titleColor) {
        this.titleColor = titleColor;
    }

    /**
     * Get description color
     *
     * @return string
     */
    public int getDescriptionColor() {
        return descriptionColor == 0 ? Color.BLACK : descriptionColor;
    }

    /**
     * Set description color
     *
     * @param descriptionColor int
     */
    public void setDescriptionColor(int descriptionColor) {
        this.descriptionColor = descriptionColor;
    }

    /**
     * Get background color
     *
     * @return int
     */
    public int getBacgroundColor() {
        return bacgroundColor == 0 ? Color.WHITE : bacgroundColor;
    }

    /**
     * Set background color
     *
     * @param bacgroundColor int
     */
    public void setBacgroundColor(int bacgroundColor) {
        this.bacgroundColor = bacgroundColor;
    }

    /**
     * Get title font
     *
     * @return int
     */
    public int getTitleFont() {
        return titleFont;
    }

    /**
     * Set title font
     *
     * @param titleFont int
     */
    public void setTitleFont(int titleFont) {
        this.titleFont = titleFont;
    }

    /**
     * Get description font
     *
     * @return int
     */
    public int getDescriptionFont() {
        return descriptionFont;
    }

    /**
     * Set description font
     *
     * @param descriptionFont int
     */
    public void setDescriptionFont(int descriptionFont) {
        this.descriptionFont = descriptionFont;
    }
}
