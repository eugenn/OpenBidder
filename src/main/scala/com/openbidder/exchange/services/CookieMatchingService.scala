package com.openbidder.exchange.services

import com.openbidder.exchange.{Tags, PixelServiceConnection}
import com.openbidder.http.{HttpRequest, HttpResponse}
import com.openbidder.model.com.openbidder.exchange.Tags

class CookieMatchingService (pixelServices: Map[Int, PixelServiceConnection]) {

  def redirect (request: HttpRequest): HttpResponse = {
    HttpResponse(Tags(""))
  }

}
