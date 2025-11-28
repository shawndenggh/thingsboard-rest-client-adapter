package org.shawn.shaded;

import org.thingsboard.rest.client.RestClient;

public class TbRestClient {

  private final RestClient restClient;

  public TbRestClient(RestClient restClient) {
    this.restClient = restClient;
  }
}
