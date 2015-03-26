package com.example.tm002.masterflow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class WebpageListActivity extends FragmentActivity
        implements WebpageListFragment.Callbacks {

    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webpage_list);

        if (findViewById(R.id.webpage_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the
            // 'activated' state when touched.
            ((WebpageListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.webpage_list))
                    .setActivateOnItemClick(true);
        }

        // TODO: If exposing deep links into your app, handle intents here.
    }

    /**
     * Callback method from {@link WebpageListFragment.Callbacks}
     * indicating that the item with the given ID was selected.
     */
    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(WebpageDetailFragment.ARG_ITEM_ID, id);
            WebpageDetailFragment fragment = new WebpageDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.webpage_detail_container, fragment)
                    .commit();

        } else {
            // In single-pane mode, simply start the detail activity
            // for the selected item ID.
            Intent detailIntent = new Intent(this, WebpageDetailActivity.class);
            detailIntent.putExtra(WebpageDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
