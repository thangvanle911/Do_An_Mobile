/*
 * Copyright (c) 2017. http://hiteshsahu.com- All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * If you use or distribute this project then you MUST ADD A COPY OF LICENCE
 * along with the project.
 *  Written by Hitesh Sahu <hiteshkrsahu@Gmail.com>, 2017.
 */

package com.hitesh_sahu.retailapp.domain.helper;


// TODO: Auto-generated Javadoc

public interface NetworkConstants {
    public boolean DEBUGABLE = true;


    public static final String URL_BASE_URI = "http://delivery2home.com"
            + "/Delivery2Home/";

    public static final String URL_GET_ALL_CATEGORY = URL_BASE_URI
            + "categories";


    public static final String URL_GET_PRODUCTS_MAP = URL_BASE_URI
            + "productMap";


    public static final String URL_PLACE_ORDER = URL_BASE_URI + "insertOrder";

    public static final String URL_APPLY_COUPAN = URL_BASE_URI
            + "validateCoupan";

    public static final int GET_ALL_PRODUCT_BY_CATEGORY = 0;
    public static final int GET_ALL_PRODUCT = 1;
    public static final int GET_SHOPPING_LIST = 9;

}
