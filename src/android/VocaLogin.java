package org.apache.cordova.vocaLogin;

import org.apache.cordova.CordovaPlugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by imunsu on 2017. 11. 7..
 */

public class VocaLogin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        if (action.equals("inputUserInfo")) {
            
            return true;
        }

        return false;
    }

}
