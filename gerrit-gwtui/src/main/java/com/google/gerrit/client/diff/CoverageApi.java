package com.google.gerrit.client.diff;

import com.google.gerrit.client.changes.ChangeApi;
import com.google.gerrit.client.rpc.RestApi;
import com.google.gerrit.reviewdb.client.PatchSet;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class CoverageApi
{
  public static CoverageApi coverage(PatchSet.Id id, String path) {
    return new CoverageApi(ChangeApi.revision(id)
        .view("files").id(path)
        .view("coverage"));
  }

  private final RestApi call;

  private CoverageApi(RestApi call) {
    this.call = call;
  }

  public void get(AsyncCallback<FileCoverageInfo> cb) {
    call.get(cb);
  }
}
