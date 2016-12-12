package com.epicodus.myrestaurants.util;

/**
 * Created by joannaanderson on 12/12/16.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
