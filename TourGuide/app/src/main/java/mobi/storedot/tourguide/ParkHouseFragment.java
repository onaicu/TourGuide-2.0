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
public class ParkHouseFragment extends Fragment {
    public ParkHouseFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourist_info, container, false);

        // Create a list of tourist info
        final ArrayList<TouristInfo> touristInfos = new ArrayList<TouristInfo>();
        touristInfos.add(new TouristInfo(R.string.available_Bleicherweg, R.string.parkHouse_Bleicherweg));
        touristInfos.add(new TouristInfo(R.string.available_Central, R.string.parkHouse_Central));
        touristInfos.add(new TouristInfo(R.string.available_CityParking, R.string.parkHouse_CityParking));
        touristInfos.add(new TouristInfo(R.string.available_Feldegg, R.string.parkHouse_Feldegg));
        touristInfos.add(new TouristInfo(R.string.available_Globus, R.string.parkHouse_Globus));
        touristInfos.add(new TouristInfo(R.string.available_HauptBahnHof, R.string.parkHouse_HauptBahnHof));
        touristInfos.add(new TouristInfo(R.string.available_HohePromenade, R.string.parkHouse_HohePromenade));
        touristInfos.add(new TouristInfo(R.string.available_Jelmoli, R.string.parkHouse_Jelmoli));

        // Create an {@link TouristInfoAdapter}, whose data source is a list of {@link TouristInfo}s. The
        // adapter knows how to create list items for each item in the list.
        TouristInfoAdapter adapter = new TouristInfoAdapter(getActivity(), touristInfos, R.color.category_park_house);

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

