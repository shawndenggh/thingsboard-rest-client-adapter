package org.shawn.shaded;

import org.thingsboard.rest.client.RestClient;

/**
 * Thingsboard Service.
 */
public class TbRestClient {

  private final RestClient restClient;

  /**
   * Constructor.
   * @param restClient thingsboard REST client.
   */
  public TbRestClient(RestClient restClient) {
    this.restClient = restClient;
  }
}
