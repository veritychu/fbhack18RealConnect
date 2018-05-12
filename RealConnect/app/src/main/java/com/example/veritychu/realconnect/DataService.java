package com.example.veritychu.realconnect;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    /*fake data */
    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<Event>();
        for (int i = 0; i < 10; ++i) {
            eventData.add(
                    new Event("Event", "77 King St, Sydney",
                            "facebookhack"));
        }
        return eventData;
    }

}
