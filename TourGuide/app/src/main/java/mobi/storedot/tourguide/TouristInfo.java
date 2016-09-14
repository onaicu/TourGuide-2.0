package mobi.storedot.tourguide;

/**
 * {@link TouristInfo} represents a tourist information that the user is interested in.
 * It contains resource IDs for the attraction name, attraction description e.g. ranking, available parking places
 * optional image file for public places
 */
public class TouristInfo {

    /** String resource ID for tourist info name */
    private int mAttractionNameId;

    /** String resource ID for description of tourist info */
    private int mDescriptionInfoId;

    /** Image resource ID for the tourist info */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this tourist info */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new TouristInfo object.
     *
     * @param attractionNamedId is the string resource ID for the tourist info name
     * @param descriptionInfoId is the string resource Id for the description of the attraction name the user doesn't know
     */
    public TouristInfo (int attractionNamedId, int descriptionInfoId) {
        mAttractionNameId = attractionNamedId;
        mDescriptionInfoId = descriptionInfoId;
    }

    /**
     * Create a new TouristInfo object.
     *
     * @param attractionNamedId is the string resource ID for the tourist info name
     * @param descriptionInfoId is the string resource Id for the description of the attraction name the user doesn't know
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public TouristInfo (int attractionNamedId, int descriptionInfoId, int imageResourceId) {
        mAttractionNameId = attractionNamedId;
        mDescriptionInfoId = descriptionInfoId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for attraction name
     */
    public int getAttractionNameId() {
        return mAttractionNameId;
    }

    /**
     * Get the string resource ID for the description of the attraction name     */
    public int getDescriptionInfoId() {
        return mDescriptionInfoId;
    }

    /**
     * Return the image resource ID of the tourist info.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this tourist info.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

