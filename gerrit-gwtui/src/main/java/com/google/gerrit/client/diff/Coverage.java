package com.google.gerrit.client.diff;

import com.google.gwt.resources.client.CssResource;

/**
 * The Coverage.
 */
public class Coverage {
  static {
    Resources.I.coverageStyle().ensureInjected();
  }

  interface Style extends CssResource {
    String coverageGutter();
    String coverageFull();
    String coverageNone();
    String coveragePartial();
  }
}
