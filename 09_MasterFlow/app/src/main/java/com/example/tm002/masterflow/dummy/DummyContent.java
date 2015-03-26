package com.example.tm002.masterflow.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent {
    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String item_name;
        public String url;

        public DummyItem(String id, String item_name, String url) {
            this.id = id;
            this.item_name = item_name;
            this.url = url;
        }
        @Override
        public String toString() {
            return item_name;
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Web Training", "http://summerwebbootcamp.com/"));
        addItem(new DummyItem("2", "Radon Mitigation", "http://fresnoradonmitigation.com/"));
        addItem(new DummyItem("3", "Reddit", "http://www.reddit.com/"));
    }
}
