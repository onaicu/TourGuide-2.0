package mobi.storedot.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClubFragment extends Fragment {
    public ClubFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourist_info, container, false);

        // Create a list of tourist info
        final ArrayList<TouristInfo> touristInfos = new ArrayList<TouristInfo>();
        touristInfos.add(new TouristInfo(R.string.rank_1, R.string.club_Bellevue));
        touristInfos.add(new TouristInfo(R.string.rank_2, R.string.club_Hive));
        touristInfos.add(new TouristInfo(R.string.rank_3, R.string.club_Plazza));
        touristInfos.add(new TouristInfo(R.string.rank_4, R.string.club_Terasse));
        touristInfos.add(new TouristInfo(R.string.rank_5, R.string.club_Mascotte));
        touristInfos.add(new TouristInfo(R.string.rank_6, R.string.club_Jade));
        touristInfos.add(new TouristInfo(R.string.rank_7, R.string.club_Amber));
        touristInfos.add(new TouristInfo(R.string.rank_8, R.string.restaurant_Hiltl));

        // Create an {@link TouristInfoAdapter}, whose data source is a list of {@link TouristInfo}s. The
        // adapter knows how to create list items for each item in the list.
        TouristInfoAdapter adapter = new TouristInfoAdapter(getActivity(), touristInfos, R.color.category_club);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tourist_info.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.tourist_info);

        // Make the {@link ListView} use the {@link TouristInfoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link TouristInfo} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
