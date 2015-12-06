package com.google.gerrit.client.diff;

import com.google.gerrit.client.rpc.NativeMap;
import com.google.gwt.core.client.JavaScriptObject;

public class FileCoverageInfo extends JavaScriptObject
{
    public final native NativeMap hits() /*-{ return this.hits; }-*/;
    public final native NativeMap conditions() /*-{ return this.conditions; }-*/;
    public final native NativeMap coveredConditions() /*-{ return this.covered_conditions; }-*/;

    protected FileCoverageInfo() {
    }
}
