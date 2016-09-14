package mobi.storedot.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link TouristInfoAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link TouristInfo} objects.
 */
public class TouristInfoAdapter extends ArrayAdapter<TouristInfo> {

    /** Resource ID for the background color for this list of tourist infos */
    private int mColorResourceId;

    /**
     * Create a new {@link TouristInfoAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param touristInfos is the list of {@link TouristInfo}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of tourist infos
     */
    public TouristInfoAdapter(Context context, ArrayList<TouristInfo> touristInfos, int colorResourceId) {
        super(context, 0, touristInfos);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link TouristInfo} object located at this position in the list
        TouristInfo currentTouristInfo = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID attraction_name.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        // Get the attraction name from the currentTouristInfo object and set this text on
        // the Attraction TextView.
        miwokTextView.setText(currentTouristInfo.getAttractionNameId());

        // Find the TextView in the list_item.xml layout with the ID description_text_view .
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the default translation from the currentTouristInfo object and set this text on
        // the Description TextView.
        defaultTextView.setText(currentTouristInfo.getDescriptionInfoId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this tourist info or not
        if (currentTouristInfo.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentTouristInfo.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
